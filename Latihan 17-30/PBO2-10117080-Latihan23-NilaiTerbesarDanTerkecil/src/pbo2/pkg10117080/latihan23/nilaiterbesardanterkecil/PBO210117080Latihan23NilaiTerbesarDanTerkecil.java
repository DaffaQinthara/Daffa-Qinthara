/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN NILAI TERBESAR DAN TERKECIL
 */
package pbo2.pkg10117080.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

public class PBO210117080Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nBanyak, nilai[];
        float rata = 0;
        String Nama;

        System.out.println("=======program nilai terbesar dan terkecil Nilai mahasiswa======");
        System.out.println("Masukan Nama Petugas : ");
        Nama = input.nextLine();
        
        System.out.println("Masukan Banyak Mahasiswa : ");
        nBanyak = input.nextInt();
        
        nilai = new int [nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.println("Masukan Niali mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            
        }
        int max = 0;
        for (int val : nilai) {
            if ( max < val){
                max = val;
            }
    }
        System.out.println("Nilai terbesar adalah " + max);
        
        int min = nilai[0];
        for (int val : nilai) {
            if(val < min) { 
                min = val;
            }
    
        }
        System.out.println("nilai terkecil adalah " + min);
        System.out.println("Petugas : " + Nama);
    }
}
    
