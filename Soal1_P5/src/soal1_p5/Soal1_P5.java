/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1_p5;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Soal1_P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan N: ");
        int N = sc.nextInt();
        
        deret(N);

        sc.close();
    }
    
    public static void deret(int N) {
        String hasil = "";
        int hasilInt = 0;
        
        for (int i = 1; i <= N; i++) {
            hasilInt += i;
            if (i < N) {
                hasil += String.valueOf(i) + "+";
            } else {
                hasil += String.valueOf(i) + "=";
            }
        }
        
        hasil += String.valueOf(hasilInt);
        
        System.out.println(hasil);
    }
}

