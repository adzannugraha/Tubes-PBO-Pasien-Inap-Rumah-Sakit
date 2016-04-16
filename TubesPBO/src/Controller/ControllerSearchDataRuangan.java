/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.SearchDataRuangan;
import View.TambahDataDokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerSearchDataRuangan {

    Application model;
    SearchDataRuangan view;
    
    public ControllerSearchDataRuangan(Application model) {
        this.model = model;
        view = new SearchDataRuangan();
        view.setVisible(true);
        view.addListener((ActionListener) this);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnEdit())) {
            new ControllerEditDataRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnKembali())) {
            new ControllerViewRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnSubmit())) {
            new ControllerSearchDataRuangan(model);
            view.dispose();
        }
    }
    
    
}
