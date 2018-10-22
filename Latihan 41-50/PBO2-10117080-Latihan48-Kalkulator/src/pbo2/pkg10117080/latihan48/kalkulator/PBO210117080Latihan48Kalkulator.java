/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan48.kalkulator;

import java.util.Scanner;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN HITUNGAN KALKULATOR
 */
public class PBO210117080Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator hitung = new Kalkulator();
        hitung.setValue1(7);
        hitung.setValue2(5);
        System.out.println("Value1: " + hitung.getValue1());
        System.out.println("Value2: " + hitung.getValue2());
        hitung.setNameProject();
        hitung.setNoteProject(null);
        System.out.println("Result add is : " +hitung.add(hitung.getValue1(), hitung.getValue2()));
        System.out.println("Result minus is : " +hitung.minus(hitung.getValue1(), hitung.getValue2()));
        System.out.println("Result Multiple is : " + hitung.multiplication(hitung.getValue1(), hitung.getValue2()));
        System.out.println("Result Division is : " + hitung.division(hitung.getValue1(), hitung.getValue2()));
    }
    
}
