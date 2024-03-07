/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_p5;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Soal3_P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan n: ");
        int n = sc.nextInt();

        faktorial(n);

        sc.close();
    }
    
    public static void faktorial(int n) {
        String hasil = String.valueOf(n) + "!" + "=";
        int hasilInt = 1;
        
        for (int i = n; i >= 1; i--) {
            hasilInt *= i;
            
            if (i > 1) {
                hasil += String.valueOf(i) + "*";
            } else {
                hasil += String.valueOf(i) + "=";
            }
        }
        
        hasil += String.valueOf(hasilInt);
        System.out.println(hasil);
    }
}