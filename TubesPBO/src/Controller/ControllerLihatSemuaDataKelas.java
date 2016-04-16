/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatSemuaDataKelas;
import View.LihatSemuaDokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerLihatSemuaDataKelas {

    Application model;
    LihatSemuaDataKelas view;
    
    public ControllerLihatSemuaDataKelas(Application model) {
        this.model = model;
        view = new LihatSemuaDataKelas();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnHapus())) {
            new ControllerLihatSemuaDataKelas(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewKelas(model);
        } 
    }
    
    
}
