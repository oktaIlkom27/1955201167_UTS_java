//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class contohBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String nama;
         String alamat;
         String status;
         int usia;
         int gaji;
         double tinggibadan;
         double beratbadan;
         
         try
         {  System.out.print("Masukkan nama anda : ");//melakukan input nama
            nama = br.readLine();
            System.out.print("Masukkan alamat anda : ");//melakukan input alamat
            alamat = br.readLine();
            System.out.print("Masukkan status anda : ");//melakukan input status
            status = br.readLine();
            System.out.print("Masukkan usia anda : ");//melakukan input usia
            usia = br.read();
            System.out.print("Masukkan gaji anda : ");//melakukan input gaji
            gaji = br.read();
            System.out.print("Masukkan tinggi badan anda : ");//melakukan input tinggi badan
            tinggibadan = br.hashCode();
            System.out.print("Masukkan berat badan anda : ");//melakukan input berat badan
            beratbadan = br.hashCode();
            
             System.out.println("=================");
             System.out.println("Nama anda : " + nama);// menampilkan pesan nama
             System.out.println("Alamat anda : " + alamat);//menampilkan pesan alamat
             System.out.println("Status anda : " + status);// menampilkan pesan status
             System.out.println("Usia anda : " + usia);//menampilkan pesan usia
             System.out.println("Gaji anda : " + gaji);// menampilkan pesan gaji
             System.out.println("Tinggi badan anda : " + tinggibadan);//menampilkan pesan tinggi badan
             System.out.println("Berat badan anda : " + beratbadan);//menampilkan pesan berat badan
         
         }
         catch(IOException eox)//menangkap kesalahan 
         {
             System.out.println(eox);
         }
             
    }
    
}
