/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.EditDataRuangan;
import View.LihatSemuaDataKelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerEditDataRuangan {

    Application model;
    EditDataRuangan view;
    
    public ControllerEditDataRuangan(Application model) {
        this.model = model;
        view = new EditDataRuangan();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnKembali())) {
            new ControllerViewRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnSimpan())) {
            new ControllerViewRuangan(model);
        } 
    }
    
    
}
