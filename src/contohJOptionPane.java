
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class contohJOptionPane {
    public static void main(String[] args) {
        
        String tanya = JOptionPane.showInputDialog("Siapa Nama Anda");
        String alamat = JOptionPane.showInputDialog("Alamat Rumah");
        String status = JOptionPane.showInputDialog("Status Anda");
        String usia = JOptionPane.showInputDialog("Usia Anda");
        String gaji = JOptionPane.showInputDialog("Berapa Gaji Anda");
        String tinggibadan = JOptionPane.showInputDialog("Tinggi Badan Anda");
        String beratbadan = JOptionPane.showInputDialog("Berat Badan Anda");
        
        int jumlah = Integer.parseInt(usia);
        int banyakkaryawan = 230;
        double total = jumlah*banyakkaryawan;
        
        
        System.out.println("Siapa Nama Anda :" + tanya);
        System.out.println("Alamat Rumah :" + alamat);
        System.out.println("Status Anda :" + status);
        System.out.println("Usia Anda :" + usia);
        System.out.println("Berapa Gaji Anda :" + gaji);
        System.out.println("Tinggi Badan Anda :" + tinggibadan);
        System.out.println("Berat Badan Anda :" + beratbadan);
         
    }
    }
    

