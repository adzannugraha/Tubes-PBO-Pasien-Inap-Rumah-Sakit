/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewDokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerViewDokter {

    Application model;
    ViewDokter view;
    
    public ControllerViewDokter(Application model) {
        this.model = model;
        view = new ViewDokter();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnCariDokter())) {
            new ControllerSearchDataDokter(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembaliDokter())) {
            new ControllerViewMenu(model);
            view.dispose();
        } else if (source.equals(view.getBtnLihatSemuaDokter())) {
            new ControllerLihatSemuaDokter(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahDokter())) {
            new ControllerTambahDataDokter(model);
            view.dispose();
        } 
    }

    
    
}
