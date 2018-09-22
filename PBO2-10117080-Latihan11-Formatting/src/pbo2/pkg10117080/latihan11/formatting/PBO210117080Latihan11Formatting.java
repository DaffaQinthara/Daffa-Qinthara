/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan11.formatting;

/**
 *
 * @author Daffa Qinthara
 * Nama : Daffa Qinthara Senjaya
 * Kelas : IF-2
 * NIM : 10117080
 * DESKRIPSI PROGRAM : program ini berisi penggunaan formating
 */
public class PBO210117080Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i = 3546764;
    int iminus = -i;
    System.out.println("i : " + i);
    System.out.printf("%%d : %d%n", i);
    System.out.printf("%%10d : %10d%n", i);
    System.out.printf("%%+10d : %+10d%n", i);
    System.out.printf("%%+10d : %+10d%n", iminus);
    System.out.printf("%%,10d : %,10d%n", i);
    System.out.printf("%%-10d : %-10d%n", i);
    double f = 5675482.982;
    System.out.println("f : " + f);
    System.out.printf("%%f : %f%n", f);
    System.out.printf("%%.2f : %.2f%n", f);
    System.out.printf("%%12.2f : %12.2f%n", f);
    System.out.printf("%%,12.2f : %,12.2f%n", f);
    
    
    }
    
}
