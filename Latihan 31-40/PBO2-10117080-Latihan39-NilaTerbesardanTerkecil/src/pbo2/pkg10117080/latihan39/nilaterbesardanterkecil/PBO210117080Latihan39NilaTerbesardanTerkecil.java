/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Nilai 
                        Terbesar dan Terkecil
 */
package pbo2.pkg10117080.latihan39.nilaterbesardanterkecil;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class PBO210117080Latihan39NilaTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Petugas ptg = new Petugas();
        DaftarNilai dafNilai = new DaftarNilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();


        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+dafNilai.nKecil);

        System.out.print("\nPetugas : "+ptg.namaPetugas);
    }
}
   
