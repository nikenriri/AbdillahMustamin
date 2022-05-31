/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.InputAslabModel;
import view.InputAslabView;
import view.InputView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InputAslabControler {
    InputAslabView inputAslabView;
    InputAslabModel inputAslabModel;
    InputView inputView;
    public InputAslabControler(InputAslabModel inputAslabModel , InputAslabView inputAslabView , InputView inputView){
        this.inputAslabView = inputAslabView;
        this.inputAslabModel=inputAslabModel;
        this.inputView = inputView;

        inputAslabView.btn_tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String judul = inputAslabView.getjudul();
                String portofolio = inputAslabView.getTfportofolio();
                String microteaching = inputAslabView.getTfmicroteaching();
                String wawancara = inputAslabView.getTfwawancara();
                String nilai = inputAslabView.getTfnilai();
                inputAslabModel.insertdata(judul,portofolio,microteaching,wawancara,nilai);

                String[][] dataaslab = inputAslabModel.readaslab();
                inputView.table.setModel((new JTable(dataaslab,inputView.namakolom)).getModel());

            }
        });


    }
}
