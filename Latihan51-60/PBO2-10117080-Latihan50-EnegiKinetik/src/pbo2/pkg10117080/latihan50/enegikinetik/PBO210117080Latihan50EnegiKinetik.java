/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan50.enegikinetik;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN ENERGI KINETIK
 */
public class PBO210117080Latihan50EnegiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Energi bola = new Energi();
      bola.setMassa(145);
      bola.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa = " +bola.getMassa() + " g");
        System.out.println("bola baseball tersebut dilempar dengan kecepatan= " + bola.getKecepatan()
                             + " m/s");
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. usaha pada bola = " + bola.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadadan diam");
    }
    
}
