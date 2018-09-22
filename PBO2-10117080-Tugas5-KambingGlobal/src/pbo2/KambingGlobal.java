/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author Nama : Daffa Qinthara Senjaya
 * Kelas : IF-2
 * NIM : 10117080
 * DESKRIPSI PROGRAM : Program ini berisi jumlah kambing setelah ditambahkan
 */
public class KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
// variabel jumlahkambing menjadi variabel instance   
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    KambingGlobal kambingSusu = new KambingGlobal();
    
    //menampilkan jummlah kambing yang ada saat program x pertama berjalan
    kambingSusu.getJumlahKambing();
    
    //menambah satu kambing
    kambingSusu.tambahKambing();
    
    //menampilkan jumlah kambing yang ada
    kambingSusu.getJumlahKambing();
   
    }
}

    
  
