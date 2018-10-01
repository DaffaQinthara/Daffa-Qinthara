/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN GANTI KATA PADA SUATU KALIMAT
 */
package pbo2.pkg10117080.latihan28.gantikata;

import java .util.Scanner;

public class PBO210117080Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.println("Ganti kata : ");
        nGanti = scanner.nextLine();
        
        System.out.println("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : " + ganti);
    }
    
}
