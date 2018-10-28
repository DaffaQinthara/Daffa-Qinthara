/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan60.akatsuki;

/**
 *
 * @author User
 */
public class Akatsuki {
     protected String nama;
    protected String klan;
    protected String pasangan;
    
    
    public Akatsuki(String nam, String kln, String pasangan){
        this.nama=nam;
        this.klan=kln;
        this.pasangan=pasangan;
        
}
    public void tampilAnggota(){
        System.out.println("Nama : "+nama);
        System.out.println("Klan : "+klan);
        System.out.println("pasangan : "+pasangan);
        
    }
}
