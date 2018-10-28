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
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
     public void kelasApa(){
        System.out.println("Nama saya "+nama+" umur "+umur+" sedang belajar di kelas "+kelas);
          
}

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}