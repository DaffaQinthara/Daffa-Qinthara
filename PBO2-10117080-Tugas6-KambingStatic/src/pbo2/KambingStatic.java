/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author Daffa
 * Nama : Daffa Qinthara Senjaya
 * Kelas : IF-2
 * NIM : 10117080
 * DESKRIPSI PROGRAM : mengghubungkan 1 kelas kepada kelas yang lainnya
 */


public class KambingStatic {

    /**
     * @param args the command line arguments
     */
    // Nama kambing sebagai konstanta
     public static final String NAMA_KAMBING = "MIDUN";
     
    public static void main(String[] args) {
        // TODO code application logic here
    Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memiliki kambing sebanyak " + 
                            Mamalia.jumlahKambing);
    }
    
}
