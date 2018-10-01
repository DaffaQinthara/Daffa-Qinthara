/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN PERHITUNGGAN LINGKARAN
 */
package pbo2.pkg10117080.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PBO210117080Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PHI = 3.14159265358979323846;
        double nKeliling, nDiameter = 0, njariJari, nLuas;

        do {
            System.out.print("Masukan nilai diameter lngkaran : ");
            try {
                nDiameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
                scanner.nextLine();
            }

        } while (nDiameter == 0);
        
        njariJari = nDiameter / 2;
        nLuas = (float) (PHI * (njariJari * njariJari));
        nKeliling = (PHI * nDiameter);
        
        DecimalFormat DF = new DecimalFormat("#.##");
        System.out.printf("jari jari lingkaran \t= %s%n", DF.format(njariJari));
         System.out.printf("Luas keliling\t\t= %s%n", DF.format(nLuas));
        System.out.printf("Keliling Lingkaran\t= %s%n", DF.format(nKeliling));
    }

}
