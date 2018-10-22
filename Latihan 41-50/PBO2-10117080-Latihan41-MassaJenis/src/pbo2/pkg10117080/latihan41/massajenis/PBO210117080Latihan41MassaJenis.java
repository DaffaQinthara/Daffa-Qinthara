/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN MASSA JENIS
                        KUBUS
 */
package pbo2.pkg10117080.latihan41.massajenis;

/**
 *
 * @author User
 */
public class PBO210117080Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Kubus kbs = new Kubus();
    kbs.setSisi(5);
    kbs.setMassa(250);
        System.out.println("===Massa Jenis Kubus===");
        System.out.println("sisi : " + kbs.getSisi());
        System.out.println("massa : " + kbs.getMassa());
    
        System.out.println();
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("volume : " + kbs.hitungVolume(5));
        System.out.println("Massa jenis " + kbs.hitungMassaJenis(250, +kbs.hitungVolume(5)));
    }
    
    
}
