/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan49.biayaemaskawin;

/**
 *
 * @author User
 */
public class Emas {
    private double harga = 570000;
    private double berat;
    
    public Emas(double berat){
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public double getBerat() {
        return berat;
    }
    public double hitungHargaEmas(double parBerat, double parHarga){
        return berat*harga;
    }
    
    

}
