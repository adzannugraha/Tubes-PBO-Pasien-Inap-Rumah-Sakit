/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewRuangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;



/**
 *
 * @author Adzan
 */
public class ControllerViewRuangan {

    Application model;
    ViewRuangan view;
    
    public ControllerViewRuangan(Application model) {
        this.model = model;
        view = new ViewRuangan();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnCariPasienInapId())) {
            new ControllerSearchDataPasienInapId(model);
            view.dispose();
        } else if (source.equals(view.getBtnCariPasienInapIndex())) {
            new ControllerSearchDataPasienInapIndex(model);
            view.dispose();
        } else if (source.equals(view.getBtnCariRuangan())) {
            new ControllerSearchDataRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembaliRuangan())) {
            new ControllerViewMenu(model);
            view.dispose();
        } else if (source.equals(view.getBtnLihatSemuaPasienInap())) {
            new ControllerLihatSemuaPasienInap(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahPasienInap())) {
            new ControllerTambahDataPasieninap(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahRuangan())) {
            new ControllerTambahDataRuangan(model);
            view.dispose();
        }
    }
}
