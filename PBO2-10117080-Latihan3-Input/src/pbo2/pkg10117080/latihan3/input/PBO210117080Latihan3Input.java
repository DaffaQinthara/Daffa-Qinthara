/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan3.input;

import java.util.Scanner;
/**
 *
 * @author Daffa Qinthara
 * Nama : Daffa Qinthara Senjaya
 * Kelas : IF-2
 * NIM : 10117080
 * DESKRIPSI PROGRAM : Program Ini bisa memasukan nilai atau input oleh programer
 */
public class PBO210117080Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    
    }
    
}
