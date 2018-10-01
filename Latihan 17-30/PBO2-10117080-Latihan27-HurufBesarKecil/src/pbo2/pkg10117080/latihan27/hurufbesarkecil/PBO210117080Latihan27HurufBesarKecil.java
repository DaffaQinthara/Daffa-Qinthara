/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN HURUF BESAR ATAU KECILPADA SUATU KALIMAT
 */
package pbo2.pkg10117080.latihan27.hurufbesarkecil;

import java.util.Scanner;

public class PBO210117080Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Kalimat;
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("========HasilFormating=======");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf Kecil = " + Kecil);
        

    }
    
}
