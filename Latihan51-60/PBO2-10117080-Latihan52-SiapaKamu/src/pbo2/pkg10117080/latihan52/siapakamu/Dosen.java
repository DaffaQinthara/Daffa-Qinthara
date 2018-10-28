/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan52.siapakamu;

/**
 *
 * @author User
 */
public class Dosen extends Manusia {
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
     public void mengajarApa(){
        System.out.println("Nama Saya "+nama+" umur "+umur+" tahun sedang mengajar mata kuliah "+mataKuliah);
}

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
     
}