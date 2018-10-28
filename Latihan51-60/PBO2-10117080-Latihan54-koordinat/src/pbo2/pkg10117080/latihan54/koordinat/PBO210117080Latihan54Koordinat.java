/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan54.koordinat;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Koordinat
 */
public class PBO210117080Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       WarnaKoordinat wkd = new WarnaKoordinat(0, 0, "");
       wkd.setNamaWarna("Jingga");
        wkd.setX(10);
        wkd.setY(4);
        System.out.println("Warna Koordinat "+wkd.getNamaWarna());
        System.out.println("Kordinat Sumbu x : "+wkd.getX()+", y : "+wkd.getY());
        
    }
    
}
