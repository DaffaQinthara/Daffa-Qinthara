/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Program rata
                        rata nilai
 */
package pbo2.pkg10117080.latihan37.programratarata;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210117080Latihan37ProgramRatarata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int jmlhMahasiswa;
        Scanner scn = new Scanner(System.in);
        Ratarata rata = new Ratarata();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jmlhMahasiswa = scn.nextInt();
        
        rata.hitungNilai(jmlhMahasiswa);
        double jmlhNilai;
        System.out.println("Rata Rata Nilainya adalah : " + rata.hitungRata2Nilai(rata.jmlhNilai,jmlhMahasiswa));
        
    }
    
}
