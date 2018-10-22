/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan43.gajipegawai;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN GajiPegawai
 */
public class PBO210117080Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("###Data Gaji Karyawan PT KAKATU ###");
        System.out.println("------------------------");
        GajiPegawai pgwi = new GajiPegawai();
        pgwi.setNama("Rizki Adam Kurniawan");
        pgwi.setAlamat("jalan semar dlm 4 no 72/66");
        pgwi.setUangTransport(250000);
        pgwi.setUangTunjangan(300000);
        pgwi.setGajiPokok(4500000);
        pgwi.setTotalGaji(pgwi.getTotalGaji());
        pgwi.tampilData(pgwi.getNama(), pgwi.getAlamat(),pgwi.getUangTunjangan(),
                        pgwi.getUangTransport(),pgwi.getGajiPokok(),pgwi.getTotalGaji());
    }
    
}
