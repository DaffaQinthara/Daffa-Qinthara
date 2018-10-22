/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN TABUNGAN
 */
package pbo2.pkg10117080.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210117080Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Tabungan tabungan = new Tabungan(scn.nextInt());    
    System.out.print("Masukan Saldo Awal : ");
        
        
        System.out.print("Jumlah yang mau di ambil : ");
        tabungan.ambilUang(scn.nextInt());
        System.out.println("Saldo anda sekarang : " +tabungan.ambilUang(0));
            
    }
}