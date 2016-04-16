/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SearchDataPasienInapId;
import View.SearchDataPasienInapIndex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerSearchDataPasienInapId {

    Application model;
    SearchDataPasienInapId view;
    
    public ControllerSearchDataPasienInapId(Application model) {
        this.model = model;
        view = new SearchDataPasienInapId();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnHapusDiagnosa())) {
            new ControllerEditDataPasienInap(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewRuangan(model);
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerSearchDataPasienInapId(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahDiagnosa())) {
            new ControllerEditDataPasienInap(model);
            view.dispose();
        }
    }
    
    
}
