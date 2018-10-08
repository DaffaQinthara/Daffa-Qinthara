/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Kalkulatot
 */
package pbo2.pkg10117080.latihan34.kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;



/**
 *
 * @author User
 */
public class PBO210117080Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Kalkulator nKalkulator1 = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukan Angka Pertama : ");
        nKalkulator1.value1 = scanner.nextDouble();
        
        System.out.print("Masukan Angka Ke-2 : ");
        nKalkulator1.value2 = scanner.nextDouble();

        System.out.println("");
        
        
        System.out.print("Hasil Pertambahan : " + nKalkulator1.tambahBilangan());
        System.out.print("Hasil Pengurangan : " + nKalkulator1.kurangBilangan());
        System.out.print("Hasil Perkalian : " + nKalkulator1.kaliBilangan());
        System.out.print("Hasil Pembagian : " + nKalkulator1.bagiBilangan());
        System.out.print("Hasil Sisa : " + nKalkulator1.sisaBilangan());
    }

}
