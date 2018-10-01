/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN WAKTU SAAT INI
 */
package pbo2.pkg10117080.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PBO210117080Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Date Waktu = new Date ( );
        SimpleDateFormat FormatWaktu = new SimpleDateFormat("EEEE, dd MMM yyy hh:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + FormatWaktu.format(Waktu));
    }
    
}
