/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahDataPasienInap;
import View.TambahDataRuangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerTambahDataPasieninap {

    Application model;
    TambahDataPasienInap view;
    
    public ControllerTambahDataPasieninap(Application model) {
        this.model = model;
        view = new TambahDataPasienInap();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnKembali())) {
            new ControllerViewRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerViewRuangan(model);
            view.dispose();
        } 
    }
    
    
}
