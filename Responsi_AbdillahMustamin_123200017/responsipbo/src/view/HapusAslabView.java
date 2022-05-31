/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;


public class HapusAslabView {
     JLabel ltitle = new JLabel("Masukan Data", SwingConstants.CENTER);
    JLabel lj = new JLabel("Judul");
    JLabel lp = new JLabel("Portofolio");
    JLabel hj = new JLabel();
     JLabel hp = new JLabel();
    JTextField tfjudul = new JTextField();

    public JButton btn_cek = new JButton("Cek");
    public JButton btn_hapus = new JButton("Hapus");

    public HapusAslabView(){
//        setTitle("Hapus Aslab");
//        setLayout(null);
//        setSize(500,500);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        add(ltitle);
//        add(lj);add((tfjudul);
//        add(lp); add(hp);
//        add(btn_cek);
//        add(btn_hapus);

        btn_hapus.setEnabled(false);
        btn_hapus.setBackground(new Color(252, 3, 3));
        btn_cek.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,20,500,30);
        lj.setBounds(100,80,60,30); tfjudul.setBounds(230,80,200,30);
        lp.setBounds(100,140,60,30); hp.setBounds(230,140,200,30);
        btn_cek.setBounds(150,320,100,30); btn_hapus.setBounds(260,320,100,30);

    }

    public String getno_buku(){
        return tfjudul.getText();
    }

    public void tampil(String hjudul){
        this.hj.setText(hjudul);
    }
    
}
