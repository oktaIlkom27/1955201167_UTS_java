/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ifelse {
    public static void main(String[] args) {
        int nilai = 10;
        String pesan = "jumlah = ";
        
        if (nilai>2){
            String jumlah = "Lebih besar dari 2";
            if(nilai%2==0){
                pesan = "Bilangan Genap";
            }else{
                pesan = "Bialangan Ganjil";
            }
            System.out.println(jumlah+"dan"+pesan);
        }else{
            String jumlah = "Lebih kecil dari 2";
            System.out.println(jumlah);
        }
    }
}


