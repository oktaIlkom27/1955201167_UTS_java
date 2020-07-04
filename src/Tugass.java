
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
public class Tugass {
    public static void main(String[] args){
        // deklarasi variabel 
        String nama,alamat,status;
        int usia,gaji;
        double tinggibadan,beratbadan;
        
        // membuat scanner baru 
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilan output ke user
        System.out.println("### Pendataan Karyawan PT.CINTA ABADI ###");
        System.out.println("Nama Karyawan");
        // menggunakan scanner dan menyimpan apa yang diketik divariabel nama
        nama = keyboard.nextLine();
        //Tampilan output lagi
        System.out.print("Alamat");
        alamat = keyboard.nextLine();
        System.out.print("Status");
        status = keyboard.nextLine();
        
        System.out.print("Usia");
        usia = keyboard.nextInt();
        System.out.print("Gaji");
        gaji = keyboard.nextInt();
        
        System.out.print("Tinggi Badan");
        tinggibadan = keyboard.nextDouble();
        System.out.print("Berat Badan");
        beratbadan = keyboard.nextDouble();
        
        //Menampilkan apa yang sudah di simpan di variabel
        System.out.println("----------------------");
        System.out.println("Nama Karyawan" + nama);
        System.out.println("Alamat" + alamat);
        System.out.println("Status" + status);
        System.out.println("Usia" + usia + "tahun");
        System.out.println("Gaji:Rp" + gaji);
        System.out.println("Berat Badan" + beratbadan);
        System.out.println("Tinggi badan" + tinggibadan);
        
    }
}
