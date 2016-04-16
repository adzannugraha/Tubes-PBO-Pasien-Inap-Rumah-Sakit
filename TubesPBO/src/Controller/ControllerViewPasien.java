/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewPasien;
import tubespbo.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 *
 * @author Adzan
 */
public class ControllerViewPasien {
    
    Application model;
    ViewPasien view;
    
    public ControllerViewPasien(Application model) {
        this.model = model;
        view = new ViewPasien();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnCariPasien())) {
            new ControllerSearchDataPasien(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembaliPasien())) {
            new ControllerViewMenu(model);
            view.dispose();
        } else if (source.equals(view.getBtnLihatSemuaPasien())) {
            new ControllerLihatSemuaPasien(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahPasien())) {
            new ControllerTambahDataPasien(model);
            view.dispose();
        }
    }
    
}
