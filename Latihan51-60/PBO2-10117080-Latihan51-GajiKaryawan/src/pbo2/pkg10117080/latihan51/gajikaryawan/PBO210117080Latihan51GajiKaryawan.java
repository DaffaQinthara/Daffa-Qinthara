/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan51.gajikaryawan;

import java.util.Scanner;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Gaji Karyawan
 */
public class PBO210117080Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Manager mng = new Manager();
         System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mng.setNik(scn.nextLine());
        System.out.print("Masukkan Nama : ");
        mng.setNama(scn.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mng.setGolongan(scn.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mng.setJabatan(scn.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng.setKehadiran(scn.nextInt());
        System.out.println("");
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : "+mng.getNik());
        System.out.println("Nama : "+mng.getNama());
        System.out.println("Golongan : "+mng.getGolongan());
        System.out.println("Jabatan : "+mng.getJabatan());
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN : "+mng.tunjanganGolongan(mng.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : "+mng.tunjanganJabatan(mng.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+mng.tunjanganKehadiran(mng.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL "+mng.totalGaji());
    }
    
    
}
