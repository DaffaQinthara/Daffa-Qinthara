/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan62.livingthing;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN LivingThing
 */
public class PBO210117080Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hmn = new Human();
        hmn.setNama("Rizki Adam Kurniawan");
       
        hmn.walk(hmn.getNama());
        hmn.Breath(hmn.getNama());
        hmn.eat(hmn.getNama());
       
    }
    
}
