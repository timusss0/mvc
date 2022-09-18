/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import com.controller.controller_mvc1;
import com.koneksi.koneksi;
import com.view.indomi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class model_mvc1 implements controller_mvc1 {
    String jk;
    
    
    
    @Override
    public void Simpan(indomi mi) throws SQLException {
      if (mi.rblaki.isSelected()) {
            jk = "Laki laki";
            
        } else {
            jk = "perempuan";
        }
          try {
            Connection con = koneksi.getcon();
            String sql = "INSERT INTO siswa Values(?,?,?,?)"; 
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, mi.txtNIS.getText());
            prepare.setString(2, mi.txtNama.getText());
            prepare.setString(3, jk);
            prepare.setString(4, (String) mi.cbjurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA UDIN MASUK");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void Ubah(indomi mi) throws SQLException {
       if (mi.rblaki.isSelected()) {
         jk = "Laki-laki";
     } else{
         jk = "perempuan";
     }
     try {
         Connection con = koneksi.getcon();
         String sql = "UPDATE  sebut SET nama=?, jenis_kelamin=?, "  + "jurusan=? WHERE NIS=?";
           PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(4, mi.txtNIS.getText());
            prepare.setString(1, mi.txtNama.getText());
            prepare.setString(2, jk);
            prepare.setString(3, (String) mi.cbjurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA UDIN MASUK");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
//        Tampil(siswa);
//        siswa.setLebarKolom();
//        Baru(mi);
    }

    }

    }
    

