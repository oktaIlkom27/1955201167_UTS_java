/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class contohFor {
    public static void main(String[] args){
        for(int i=0;i<=10;i++){
            System.out.println("**********");
        }
        for(int i=1;i<=30;i+=2){
            System.out.println(i+"");
        }
        //membuat array 
        int angka[]={12,13,141,15};
        //menggunakan perulangan For each untuk menampilkan angka
        for(int x : angka){
            System.out.println(x +"");
        }
        int n = 6 ;
        String Kopi = "";
        System.out.println("Siapkan gelas");
        System.out.println("Rebus air hingga mendidih");
        System.out.println("Tuangkan kopi dan gula dalam gelas");
        System.out.println("Tuangkan air");
        System.out.println("Aduk kopi");
        System.out.println("Kopi siap dihidangkan");
        
        String kopi;
        kopi = "manis";
        System.out.println("Apakah kopi sudah manis ?");
        if("manis".equals(kopi)) {
        }else{
                System.out.println("sudah manis");
                }
        for(int i = 1;i<n; i++){
            System.out.println("tambah gula lagi -" + i);
        }
        System.out.println("aduk aduk");
        System.out.println("selesai");
        }        
    }
    

