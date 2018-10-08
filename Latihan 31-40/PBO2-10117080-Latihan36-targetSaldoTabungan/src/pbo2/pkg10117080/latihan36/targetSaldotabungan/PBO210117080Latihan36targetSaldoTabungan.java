/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN TARGET SALDO TABUNGAN
 */
package pbo2.pkg10117080.latihan36.targetSaldotabungan;

/**
 *
 * @author User
 */
public class PBO210117080Latihan36targetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        SaldoTabungan tst = new SaldoTabungan();
        tst.hitungSaldoTabungan(saldo, bulan, bunga);
    }
    
}
