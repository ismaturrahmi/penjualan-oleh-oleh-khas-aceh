package Stok;

import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sultan
 */
public class Koneksi {

    private static java.sql.Connection koneksi;

    public static java.sql.Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/penjualan-oleh-oleh-khas-aceh";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Tersambung");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return koneksi;
    }

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        getKoneksi();
    }
}
