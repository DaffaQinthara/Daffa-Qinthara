/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan56.umurbarangantik;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Umur Barang Antik
 */
public class PBO210117080Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio rd = new Radio(234);
        rd.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+rd.getName());
        rd.tampilUmur();
    }
    
}
