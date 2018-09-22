/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author Daffa Qinthara
 * Nama : Daffa Qinthara Senjaya
 * Kelas : IF-2
 * NIM : 10117080
 * DESKRIPSI PROGRAM : program ini mendeklarasikan variabel lokal
 */
public class Kambing {

    public void tambahKambing(){
       //Deklarasi variabel lokal
       int jumlahKambing = 0;
       
       jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                            jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
