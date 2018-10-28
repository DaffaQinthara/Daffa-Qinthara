/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan53.rabbit;

/*
 * NAMA       : Daffa Qinthara
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117080
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN Rabbit
 */
public class PBO210117080Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rbt = new Rabbit("Peter",false,"Grass",4,"grey");
        System.out.println("Hello, his name is "+rbt.getName());
        System.out.println(rbt.getName()+" is Vegetarian? "+rbt.isiVegetarian());
        System.out.println(rbt.getName()+" eats "+rbt.getEats());
        System.out.println(rbt.getName()+" has "+rbt.getNoOfLegs()+" legs");
        System.out.println(rbt.getName()+" color is "+rbt.getColor());
        
    }
    
}
