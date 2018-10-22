/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan46.tandanyakamu;

import java.util.Scanner;
/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Hasil dari project Tandanya Kamu
 */
public class PBO210117080Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Age mns = new Age(2018);
        System.out.print("Masukan Tahun Lahir : ");
        mns.setYearBirth(scn.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + mns.getYearBirth());
        System.out.println("Hari ini tahun : " + mns.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + mns.hitungUmur() + 
                            " tahun ");
        mns.tandanyaKamu(mns.hitungUmur());
        
    }
    
}
