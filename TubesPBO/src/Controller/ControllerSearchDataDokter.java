/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SearchDataDokter;
import View.SearchDataKelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerSearchDataDokter {

    Application model;
    SearchDataDokter view;
    
    public ControllerSearchDataDokter(Application model) {
        this.model = model;
        view = new SearchDataDokter();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnEdit())) {
            new ControllerEditDataDokter(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewDokter(model);
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerSearchDataDokter(model);
            view.dispose();
        } 
    }
    
    
}
