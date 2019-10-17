/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan33.oo.userlogin;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menampilkan User Login
 */
public class IF110118013Latihan33OOUserLogin {
    //private String usName;
    //private String passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username = ");
        String usName = scanner.nextLine();
        
        System.out.print("Masukkan Password = ");
        String passWord = scanner.nextLine();
        
        User user = new User();
        user.pengecekanLogin(usName, passWord);
        
    }
    
}
