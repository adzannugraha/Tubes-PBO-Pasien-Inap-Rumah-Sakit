/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SearchDataPasienInapIndex;
import View.SearchDataRuangan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerSearchDataPasienInapIndex {

    Application model;
    SearchDataPasienInapIndex view;
    
    
    public ControllerSearchDataPasienInapIndex(Application model) {
        this.model = model;
        view = new SearchDataPasienInapIndex();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnEdit())) {
            new ControllerEditDataPasienInap(model);
            view.dispose();
        } else if (source.equals(view.getBtnHapusDiagnosa())) {
            new ControllerSearchDataPasienInapIndex(model);
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerSearchDataPasienInapIndex(model);
            view.dispose();
        } else if (source.equals(view.getBtnTambahDiagnosa())) {
            new ControllerEditDataPasienInap(model);
            view.dispose();
        }
    }
}
