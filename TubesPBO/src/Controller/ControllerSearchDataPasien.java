/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SearchDataPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerSearchDataPasien {

    Application model;
    SearchDataPasien view;
    
    public ControllerSearchDataPasien(Application model) {
        this.model = model;
        view = new SearchDataPasien();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnEdit())) {
            new ControllerEditDataPasien(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewPasien(model);
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerSearchDataPasien(model);
            view.dispose();
        } 
    }
    
    
}
