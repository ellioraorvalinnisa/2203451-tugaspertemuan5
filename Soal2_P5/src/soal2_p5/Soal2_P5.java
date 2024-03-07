/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_p5;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Soal2_P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan batas awal: ");
        int batasAwal = sc.nextInt();
        System.out.print("Masukan batas akhir: ");
        int batasAkhir = sc.nextInt();

        hitungGanjil(batasAwal,batasAkhir);
        
        sc.close();
    }
    
    public static void hitungGanjil(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal;  i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlah++;
            }
        }
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah " + jumlah);
    }
}