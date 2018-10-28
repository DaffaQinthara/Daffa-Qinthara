/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan59.detectiveconan;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Detectiv Conan
 */
public class PBO210117080Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utama utama = new Utama("Shinichi Kudo", "pai", "ambisius", 21);
        utama.setSamaran("Conan");
        utama.displayKarakter();
        System.out.println("Nama Samaran : "+utama.getSamaran());
        System.out.println("");
    
        Pendukung pdg = new Pendukung("Kogoro Mouri","Ramen","pantang Menyerah", 30);
        pdg.setSebutan("Kogoro tidur");
        pdg.displayKarakter();
        System.out.println("Nama Sebutan : " + pdg.getSebutan());
        System.out.println("");
    }
    
}
