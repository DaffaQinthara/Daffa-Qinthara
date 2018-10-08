/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Program Tunjangan
 */
package pbo2.pkg10117080.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210117080Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        Tunjangan tjn = new Tunjangan();
        
        System.out.println("===Program Tunjangan===");
        System.out.print("Berapa Gaji Pokok Anda Sebulan? : Rp. ");  
        gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum) ? : ");
        status = scanner.next();
        System.out.println("");
        
        tjn.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed by : Daffa Qinthara");
        
    }
    
}
