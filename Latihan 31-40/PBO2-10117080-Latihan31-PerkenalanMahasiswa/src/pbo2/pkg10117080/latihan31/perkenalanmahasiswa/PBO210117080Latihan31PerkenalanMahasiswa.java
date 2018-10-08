/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk PERKENALAN MAHASISWA

 */
package pbo2.pkg10117080.latihan31.perkenalanmahasiswa;

/**
 *
 * @author User
 */
public class PBO210117080Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mahasiswa nMhs1 = new Mahasiswa();
        nMhs1.nim = "10110269";
        nMhs1.nama = "Rizk Adam Kurniawan";

        nMhs1.perkenalanDiri(nMhs1.nim, nMhs1.nama);

        Mahasiswa nMhs2 = new Mahasiswa();
        nMhs2.nim = "10110270";
        nMhs2.nama = "Indra Tiola";

        nMhs2.perkenalanDiri(nMhs2.nim, nMhs2.nama);
    
         Mahasiswa nMhs3 = new Mahasiswa();
         nMhs3.nim  = "10110271";
         nMhs3.nama  = "Robi Tanzil Ganefi";

         nMhs3.perkenalanDiri (nMhs3.nim, nMhs3.nama);
    
        Mahasiswa nMhs4 = new Mahasiswa();
        nMhs4.nim ="10110269";
        nMhs4.nama ="Muhammad Nur Awaludin";
        
        nMhs4.perkenalanDiri(nMhs4.nim, nMhs4.nama);
    }
}
