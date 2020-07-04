
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class kombinasi {
    public static void main(String[] args){
       Scanner input = new Scanner (System.in);
        System.out.println("***********");
        System.out.println("TOKO BUKU CEMERLANG");
        System.out.println("***************");
        
        System.out.println("Masukkan jumlah barang yang akan dibeli: ");
        int beli = input.nextInt();
        
        for ( int i = 1; i<=beli; i++){
            System.out.println("Masukkan Nama Barang Ke- "+i+" : ");
            String nama = input.next();
            System.out.println("Masukkan Harga Barang Ke- "+i+" : ");
            int harga = input.nextInt();
            System.out.println("Masukkan Jumlah Barang Ke- "+i+" : ");
            int jumlah = input.nextInt();
            System.out.println(" ");
            
            System.out.println("*********");
            System.out.println("Nama Barang : "+nama);
            System.out.println("Harga Barang : "+harga);
            System.out.println("Jumlah Barang : "+jumlah);
            System.out.println("*************");
            
            int total,totalb, diskon =0;
            total = harga * jumlah;
            System.out.println("Total Belanja = Rp."+total);
            
            if (total >=250000){
                diskon=total/5;
            }else {diskon = 0;}
            System.out.println("Diskon     = Rp."+ diskon);
            total = total-diskon;
            System.out.println("Total Bayar  = Rp."+ total);
            
            System.out.println("Uang Bayar = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar-total;
            System.out.println("Uang Kembali = Rp."+kembali);
        }
        
       
    }
    
    
}
