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
public class Anggota extends Akatsuki{
    private String posisi2;

    public Anggota(String nam, String kln, String pasangan) {
        super(nam, kln, pasangan);
         this.nama=nam;
        this.klan=kln;
        this.pasangan=pasangan;
    }

    public String getPosisi2() {
        return posisi2;
    }

    public void setPosisi2(String posisi2) {
        this.posisi2 = posisi2;
    }
    
}
