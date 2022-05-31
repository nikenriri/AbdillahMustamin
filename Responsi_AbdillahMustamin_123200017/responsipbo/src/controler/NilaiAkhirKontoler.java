/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.InputModel;
import model.NilaiAkhirModel;
import view.InputView;
import view.NilaiAkhirView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NilaiAkhirKontoler {
    NilaiAkhirView nilaiAkhirView;
    NilaiAkhirModel nilaiAkhirkModel;
    InputView inputView;
    InputModel inputModel;

    NilaiAkhirKontoler(NilaiAkhirView nilaiAkhirView, NilaiAkhirModel nilaiAkhirModel , InputView inputView , InputModel inputModel){
        this.nilaiAkhirModel = nilaiAkhirModel;
        this.nilaiAkhirView = nilaiAkhirView;
        this.inputView = inputView;
        this.inputModel = inputModel;

        NilaiAkhirView.btn_update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = nilaiAkhirView.getjudul();
                String stokbaru = nilaiAkhirView.getjbaru();
                nilaAkhirModel.upstok(judul,jbaru);
                String[][] databuku = inputModel.readbuku();
                inputView.table.setModel((new JTable(databuku,inputView.namakolom)).getModel());

            }
        });

        NilaiAkhirView.btn_cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = nilaiAkhirView.getjudul();
                String[][] hasil = nilaiAkhirModel.readaslab(judul);
                if (hasil[0][0] != null){
                    nilaiAkhirView.tampil(hasil[0][0],hasil[0][1]);
                    nilaiAkhirView.btn_update.setEnabled(true);
                }
            }
        });
    }
    
}
