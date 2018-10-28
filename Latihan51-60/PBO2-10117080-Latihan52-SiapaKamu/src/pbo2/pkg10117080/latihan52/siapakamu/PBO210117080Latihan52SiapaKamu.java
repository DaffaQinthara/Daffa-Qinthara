/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan52.siapakamu;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Siapa Kamu
 */
public class PBO210117080Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        dsn.setNama("Rizki Adam Kurniawan");
        dsn.setNip("41227829930");
        dsn.setUmur(27);
        dsn.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : "+dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();
        
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Daffa Qinthara");
        mhs.setKelas("IF-2");
        mhs.setNim("10117080");
        mhs.setUmur(19);
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
    }
    
}
