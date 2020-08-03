/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuas;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class arraymultidimensi {
    public static void main(String[]args) {
        // Membuat array dan Scanner
        String[][]meja = new String[2][3];
        Scanner scan = new Scanner(System.in);
        
        //mengisi setiap meja
        for(int bar=0;bar<meja.length;bar++){
            for(int kol = 0; kol<meja[bar].length;kol++){
                System.out.format("Siapa yang akan duduk di meja(%d,%d):",bar,kol);
                meja[bar][kol]=scan.nextLine();
            }
        }
        //menampilkan isi array
        System.out.println("------------------");
        for (String[] meja1 : meja) {
            for (String meja11 : meja1) {
                System.out.format("|%s|\t", meja11);
            }
            System.out.println(" ");
        }
        System.out.println("-----------------");
    }
    
}
