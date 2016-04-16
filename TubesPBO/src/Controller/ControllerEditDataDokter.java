/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.EditDataDokter;
import View.EditDataKelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerEditDataDokter {

    Application model;
    EditDataDokter view;
           
    public ControllerEditDataDokter(Application model) {
        this.model = model;
        view = new EditDataDokter();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnKembali1())) {
            new ControllerViewDokter(model);
            view.dispose();
        } else if (source.equals(view.getBtnSimpan())) {
            new ControllerViewDokter(model);
        } 
    }
    
    
}
