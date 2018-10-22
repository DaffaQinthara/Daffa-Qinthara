/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan49.biayaemaskawin;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN BIAYA EMAS KAWIN
 */
public class PBO210117080Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas ems = new Emas(15.7);
        System.out.println("Hitung Mahar Nikah");
        System.out.println("Harga Emas Saat Ini Rp. " + ems.getHarga() + " Gram");
        System.out.println("Total Biaya yang harus dikeluarkan Rp . " + ems.hitungHargaEmas(ems.getBerat(), ems.getHarga()));
    }
}

