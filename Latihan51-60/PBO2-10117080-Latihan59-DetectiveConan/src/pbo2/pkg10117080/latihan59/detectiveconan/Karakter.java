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
public class Karakter {
    protected String nama;
    protected String makanan;
    protected String sifat;
    protected int umur;
    
    public Karakter(String nam, String mak, String sifat, int umur){
        this.nama=nam;
        this.makanan=mak;
        this.sifat=sifat;
        this.umur=umur;
}
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("Makanan kesukaan : "+makanan);
        System.out.println("sifat : "+sifat);
        System.out.println("umur : "+umur);
    }
}
