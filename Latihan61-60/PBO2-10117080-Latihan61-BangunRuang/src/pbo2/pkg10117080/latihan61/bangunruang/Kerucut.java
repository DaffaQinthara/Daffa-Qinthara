/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan61.bangunruang;

/**
 *
 * @author User
 */
public class Kerucut extends BangunRuang {
     private double t;
     private double r;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
    
    return (1 * 3.14 * r * r * t) / 3;
    }
     
     
}
