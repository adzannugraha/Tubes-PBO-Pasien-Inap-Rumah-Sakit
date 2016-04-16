/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatSemuaPasienInap;
import View.SearchDataDokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerLihatSemuaPasienInap {

    Application model;
    LihatSemuaPasienInap view;
    
    public ControllerLihatSemuaPasienInap(Application model) {
        this.model = model;
        view = new LihatSemuaPasienInap();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnHapus())) {
            new ControllerLihatSemuaPasienInap(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewRuangan(model);
        } 
    }
    
    
}
