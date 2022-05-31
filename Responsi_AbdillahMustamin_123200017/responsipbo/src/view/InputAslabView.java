/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;

public class InputAslabView extends JFrame {
    JLabel ltitle = new JLabel("Input Data Aslab", SwingConstants.CENTER);
    JLabel lj = new JLabel("judul");
    JLabel lp = new JLabel("portofolio");
    JLabel lm = new JLabel("microteaching");
    JLabel lw = new JLabel("wawancara");
    JLabel ln = new JLabel("nilai");

    JTextField tfjudul = new JTextField();
    JTextField tfportofolio = new JTextField();
    JTextField tfmicroteaching = new JTextField();
    JTextField tfwawancara = new JTextField();
    JTextField tfnilai = new JTextField();
    public JButton btn_tambah = new JButton("Tambah");
    public InputAslabView(){
        setTitle("Input Buku");
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(ltitle);
        add(lj);
        add(lp);
        add(lm);
        add(lw);
        add(ln);
        add(tfjudul);
        add(tfportofolio);
        add(tfmicroteaching);
        add(tfwawancara);
        add(tfwawancara);
        add(btn_tambah);

        btn_tambah.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,30,500,30);
        lj.setBounds(100,80,60,30); tfjudul.setBounds(230,80,200,30);
        lp.setBounds(100,140,60,30); tfportofolio.setBounds(230,140,200,30);
        lm.setBounds(100,200,60,30); tfmicroteaching.setBounds(230,200,200,30);
        lw.setBounds(100,260,60,30); tfwawancara.setBounds(230,260,200,30);
        ln.setBounds(100,260,60,30); tfwawancara.setBounds(230,260,200,30);
        btn_tambah.setBounds(200,320,100,30);


    }
        public String getjudul(){
            return tfjudul.getText();
        }

        public String getTfmicroteaching() {
            return tfmicroteaching.getText();
        }

        public String getTfportofolio() {
            return tfportofolio.getText();
        }

        public String getTfwawancara() {
            return tfwawancara.getText();
        }
       public String getTfnilai() {
            return tfnilai.getText();
        }

}
