/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan60.akatsuki;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Akatsuki
 */
public class PBO210117080Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pemimpin pem = new Pemimpin("Nagato","Uzumaki","Konan");
        pem.setPosisi("Pemimpin");
        pem.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " +pem.getPosisi() );
        System.out.println("");
    
        Anggota agt = new Anggota("Uchiha Itachi","Uchiha", "Kisame");
        agt.setPosisi2("Anggota");
        agt.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + agt.getPosisi2());
        System.out.println("");
}
}