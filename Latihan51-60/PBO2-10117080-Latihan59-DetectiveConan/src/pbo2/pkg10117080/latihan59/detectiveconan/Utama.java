/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan59.detectiveconan;

/**
 *
 * @author User
 */
public class Utama extends Karakter{
    private String samaran;

    public Utama(String nam, String mak, String sifat, int umur) {
        super(nam, mak, sifat, umur);
        this.nama=nam;
        this.makanan=mak;
        this.sifat=sifat;
        this.umur=umur;
    }

    public String getSamaran() {
        return samaran;
    }

    public void setSamaran(String samaran) {
        this.samaran = samaran;
    }

    
    
    
}
