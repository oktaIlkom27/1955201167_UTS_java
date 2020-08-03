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
public class array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NH[] = new int[3];
        int NU[] = new int[3];
        int NUAS[] = new int[3];
        String[] mahasiswa = new String[3];
        int NA;
        
        Scanner input = new Scanner(System.in);
        
        for (String mahasiswa1 : mahasiswa) {
            System.out.println("------------------------");
            int i = 0;
            System.out.println("Input Nama Mahasiswa ke-" + (i + 1) + "=");
            mahasiswa[i] = input.next();
            System.out.println("------------------------");
            System.out.println("Nilai Harian = ");
            NH[i] = input.nextInt();
            System.out.println("Nilai UTS = ");
            NU[i] = input.nextInt();
            System.out.println("Nilai UAS = ");
            NUAS[i] = input.nextInt();
            System.out.println("------------------------");
            
            NA = (int) ((NH[i]*0.2) + (NU[i]*0.3) + (NUAS[i]*0.5));
            System.out.println("Nilai Akhir : " + NA);
        }
    }
    
}
