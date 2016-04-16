/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatSemuaDokter;
import View.LihatSemuaPasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerLihatSemuaDokter {

    Application model;
    LihatSemuaDokter view;
    
    public ControllerLihatSemuaDokter(Application model) {
        this.model = model;
        view = new LihatSemuaDokter();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnHapus())) {
            new ControllerLihatSemuaDokter(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewDokter(model);
        } 
    }
    
    
}
