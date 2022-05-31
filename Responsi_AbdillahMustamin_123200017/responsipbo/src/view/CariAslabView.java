/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.*;
import java.awt.*;

public class CariAslabView extends JFrame{

    JLabel ltitle = new JLabel("Cari Buku", SwingConstants.CENTER);
    JLabel lj = new JLabel("Judul");
    JLabel lp = new JLabel("Portofolio");
    JLabel lm = new JLabel("Microteaching:");
    JLabel lw = new JLabel("wawancara:");
    JLabel ln = new JLabel("nilai");
    JLabel lJudul = new JLabel();
    JLabel lPortofolio = new JLabel();
    JLabel lMicroteaching = new JLabel();
    JLabel lwawancara = new JLabel();
    JLabel lnilai = new JLabel();

    JTextField tfjudul = new JTextField();

    public JButton btn_cari = new JButton("Cari");

    public CariAslabView(){
        setTitle("Cari Aslab");
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(ltitle);
        add(lj); add(tfjudul);
        add(lp);add(lPortofolio);
        add(lm); add(lMicroteaching);
        add(lw); add(lwawancara);
        add(ln); add(lnilai);
        add(btn_cari);

        btn_cari.setBackground(new Color(3, 215, 252));

        ltitle.setBounds(0,20,500,30);
        lj.setBounds(100,80,60,30); tfjudul.setBounds(230,80,200,30);
        lp.setBounds(100,140,60,30); lPortofolio.setBounds(230,140,200,30);
        lm.setBounds(100,200,60,30); lMicroteaching.setBounds(230,200,200,30);
        lw.setBounds(100,260,60,30); lwawancara.setBounds(230,260,200,30);
        ln.setBounds(100,320,60,30);lnilai.setBounds(230,320,200,30);
        btn_cari.setBounds(200,380,100,30);
    }

    public String getcari(){
        return tfjudul.getText();
    }

    public void setText(String hp , String hm , String hw , String hn){
        lPortofolio.setText(hp);
        lMicroteaching.setText(hm);
        lwawancara.setText(hw);
        lnilai.setText(hn);
    }
}
