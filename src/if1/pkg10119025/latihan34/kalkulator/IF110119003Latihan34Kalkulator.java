/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Kalkulator
 */
public class IF110119003Latihan34Kalkulator {


    public static void main(String[] args) {
	    Kalkulator kalkulator = new Kalkulator();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("====Aplikasi Kalkulator Bilangan===");
	    System.out.print("Masukkan Angka ke-1 : ");
	    kalkulator.value1 = scan.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scan.nextDouble();
        System.out.println("\nHasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
    }
}