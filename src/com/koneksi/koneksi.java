/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koneksi;

import java.sql.*;


public class koneksi {
      private static Connection con;
    public static Connection getcon(){
        if (con == null){
            try{
                String url = "jdbc:mysql://localhost/sekolah"; //namadatabase
                String Nama = "root"; //ini
                String Password = "";
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               con = DriverManager.getConnection(url, Nama, Password);
              
        } catch  (Exception e ){
                System.out.println(e);
        }
           
       
    }
        return con;
}

}



