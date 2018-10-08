/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN  USER Login
 */
package pbo2.pkg10117080.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210117080Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User lgn = new User();
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String usr = scn.next();
        System.out.println("Masukan Password: ");
        String psw = scn.next();
        System.out.println("");
        
        lgn.pengecekanLogin(usr, psw);
             
    }
    
}
