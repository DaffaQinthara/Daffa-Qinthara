/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan44.hukumohm;
/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN HUKUM OHM
 */
public class PBO210117080Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai btr = new Baterai(3,12);
        System.out.println("Kuat Arus : " + btr.getKuatArus()+ " ampere");
        System.out.println("Hambatan : " + btr.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : " + btr.hitungTegangan()+ "volt");
    }
    
}
