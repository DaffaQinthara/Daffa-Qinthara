/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan57.vehicle;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Vechile
 */
public class PBO210117080Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bicycle bcl = new Bicycle();
       bcl.setBrand("Trek Bike");
        bcl.setModel("7.4FX");
        bcl.setGearCount(23);
        System.out.println("Brand : "+bcl.getBrand());
        System.out.println("Model : "+bcl.getModel());
        System.out.println("Jumlah Gear : "+bcl.getGearCount());
        System.out.println("");
  
        Skateboard skt = new Skateboard();
        skt.setBrand("Ally Skate");
        skt.setModel("Rocket");
        skt.setBoardLeght(54.5);
        System.out.println("Brand : "+skt.getBrand());
        System.out.println("Model : "+skt.getModel());
        System.out.println("Panjangnya Board : "+skt.getBoardLeght());
    }
    
}
