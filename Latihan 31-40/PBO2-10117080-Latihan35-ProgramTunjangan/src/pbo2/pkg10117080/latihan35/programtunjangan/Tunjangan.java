/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan35.programtunjangan;

/**
 *
 * @author User
 */
public class Tunjangan {
 
    double tunjangan;
    double totalGaji;

     public void hitungTunjangan(Double gajiPokok, String status){
         System.out.println("===Hasil Perhitungan Gaji===");
         System.out.println("Berapa Gaji Pokok anda perbulan : " + gajiPokok);
         
         //Tunjangan
         tunjangan = (status.equalsIgnoreCase("Menikah")) ? gajiPokok * 0.35 : 0;
        
         System.out.println("Tunjangan : Rp. " + tunjangan);
         //total gaji
         totalGaji = tunjangan + gajiPokok;
         System.out.println("Total Gaji : Rp. " +totalGaji);
     }
}
