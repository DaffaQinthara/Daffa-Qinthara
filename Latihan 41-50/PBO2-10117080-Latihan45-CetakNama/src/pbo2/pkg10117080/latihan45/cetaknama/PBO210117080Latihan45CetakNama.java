/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan45.cetaknama;

import java.util.Scanner;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN CETAK NAMA
 */
public class PBO210117080Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Printer prt = new Printer();
        System.out.println("===Aplikasi Pencetak Nama===");
        System.out.print("Masukan Nama anda : ");
        prt.setNama(scn.nextLine());
        System.out.print("Mau cetak berapa kali ? : ");
        prt.setJmlCetak(scn.nextInt());
        prt.cetak(prt.getNama());
        prt.cetak(prt.getJmlCetak(), prt.getNama());
                }
    
}
