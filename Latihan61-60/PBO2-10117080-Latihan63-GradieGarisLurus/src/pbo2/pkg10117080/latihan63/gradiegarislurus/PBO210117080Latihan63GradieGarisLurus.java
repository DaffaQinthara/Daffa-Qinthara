/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan63.gradiegarislurus;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Garis lurus
 */
public class PBO210117080Latihan63GradieGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat kor = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melewati titik(" + kor.getX1() + "" + kor.getY1() + 
                            ")dan(" + kor.getX2() + "" + kor.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + kor.hitungGradien());
        
        Koordinat kor2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melewati titik(" + kor2.getX1() + "" + kor2.getY1() + 
                            ")dan(" + kor2.getX2() + "" + kor2.getY2() + ")" );
        System.out.println("memiliki gradien sebesar " + kor2.hitungGradien());
    }
    
}
