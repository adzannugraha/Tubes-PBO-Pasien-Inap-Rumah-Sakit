/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.ViewKelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerViewKelas {

    Application model;
    ViewKelas view;
    
    public ControllerViewKelas(Application model) {
        this.model = model;
        view = new ViewKelas();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnCariKelas())) {
            new ControllerSearchDataKelas(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembaliKelas())) {
            new ControllerViewMenu(model);
            view.dispose();
        } else if (source.equals(view.getBtnLihatSemuaKelas())) {
            new ControllerLihatSemuaDataKelas(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahKelas())) {
            new ControllerTambahDataKelas(model);
            view.dispose();
        } 
    }
    
    
}
