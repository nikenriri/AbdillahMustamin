/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class InputAslabModel extends InputModel{
    public void insertdata(String judul, String portofolio, String microteaching, String wawancara, String nilai){
        try {
            String query = "Insert into buku Values ('" + judul + "','" + portofolio + "','" + microteaching + "','" + wawancara + "','" + nilai + "')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan");

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Pastikan Judul Tidak Sama");
        }

    }
}
