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
public class Pemimpin extends Akatsuki {
    private String posisi;

    public Pemimpin(String nam, String kln, String pasangan) {
        super(nam, kln, pasangan);
         this.nama=nam;
        this.klan=kln;
        this.pasangan=pasangan;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
    
}
