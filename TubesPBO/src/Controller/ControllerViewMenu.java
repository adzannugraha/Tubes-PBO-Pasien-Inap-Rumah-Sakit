/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import tubespbo.Application;

/**
 *
 * @author Adzan
 */
public class ControllerViewMenu implements ActionListener {

    Application model;
    ViewMenu view;

    public ControllerViewMenu(Application model) {
        this.model = model;
        view = new ViewMenu();
        view.setVisible(true);
        view.addListener(this);
        view.addAdapter(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnMenuDokter())) {
            new ControllerViewDokter(model);
            view.dispose();
        } else if (source.equals(view.getBtnMenuKelas())) {
            new ControllerViewKelas(model);
            view.dispose();
        } else if (source.equals(view.getBtnMenuPasien())) {
            new ControllerViewPasien(model);
            view.dispose();
        } else if (source.equals(view.getBtnMenuRuangan())) {
            new ControllerViewRuangan(model);
            view.dispose();
        } else if (source.equals(view.getBtnMenuKeluar())) {
            System.exit(0);
        }
    }
}

