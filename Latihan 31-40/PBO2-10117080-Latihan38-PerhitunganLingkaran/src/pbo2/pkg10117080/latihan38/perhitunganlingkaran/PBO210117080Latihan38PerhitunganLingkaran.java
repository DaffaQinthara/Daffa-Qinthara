/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Perhitungan 
                        lingkaran
 */
package pbo2.pkg10117080.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210117080Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diameter;
        double d;
        Scanner scn  = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("==Perhitungan Lingkaran==");
     do{
         System.out.print("Masukan nilai diameter lingkaran : ");
         diameter = scn.nextLine();
         System.out.println((!diameter.matches("[0-9]*")) ?"Nilai Diameter tidak sesuai\n":"");
         
     } while(!diameter.matches("[0-9]*"));
        System.out.println("===Hasil Perhitungan Lingkaran==");
        d = Double.parseDouble(diameter);
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                            clc.jari2Lingkaran(d));
          System.out.printf("Luas Lingkaran = %.2f cm %n",
                            clc.luas2Lingkaran(clc.jari2Lingkaran(d)));
            System.out.printf("Keliling Lingkaran = %.2f cm %n",
                            clc.kelilingLingkaran(clc.jari2Lingkaran(d)));
        
     
    }
    
}
