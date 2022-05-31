/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.*;
import view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inputControler {
    InputModel InputModel;
    InputView inputView;
    public inputControler(InputView inputView, InputModel inputModel){
        this.inputView =inputView;
        this.InputModel = inputModel;

        if(inputModel.getbannyakdata() != 0){
            String databuku[][] = inputModel.readbuku();
            inputView.table.setModel((new JTable(databuku,inputView.namakolom).getModel()));
        }

        inputView.btn_tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputAslabView inputAslabView = new InputAslabView();
                InputAslabModel inputAslabModel = new InputAslabModel();
                new InputAslabControler(inputAslabModel,inputAslabView,inputView);
            }
        });

        inputView.btn_cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CariAslabView cariBukuView = new CariAslabView();
                CariAslabModel cariBukuModel = new CariAslabModel();
                //new CariAslabControler(cariAslabView, cariAslabModel);
            }
        });

        inputView.btn_hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HapusAslabView hapusAslabView = new HapusAslabView();
                HapusAslabModel hapusAslabModel = new HapusAslabModel();
                new HapusAslabControler(hapusAslabModel,hapusAslabView,inputView,inputModel);
            }
        });
    }
}

