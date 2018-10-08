/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117080.latihan33.userlogin;

/**
 *
 * @author User
 */
public class User {
    String username = "Daffa";
    String password = "Qinthara";
    boolean status;
    
    public boolean cekAkun(String userName,String passWord){
        if (userName.equals(username)){
            status = true;           
        }
        else if ( passWord.equals(password)){
             status = false;  
        } 
        else{
            status = false;
        }
         return status;
       
}
    public void hasilLogin(boolean status, String userName){
        if(status){
            System.out.println("*****Hallo Daffa " + userName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
            System.out.println("Oooops,Username atau Password Anda salah");
        }
        }
    

    public void pengecekanLogin(String userName, String passWord){
        System.out.println(cekAkun(userName, passWord));
        hasilLogin(status, userName);
    }
}