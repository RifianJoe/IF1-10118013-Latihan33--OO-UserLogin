/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan33.oo.userlogin;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 */
public class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    /**
     * 
     * @param parUserName
     * @param parPassword
     * 
     */
    
    private boolean cekAkun(String parUserName, String parPassword){
        this.statusAkun = (parUserName.equals(this.username)) && (parPassword.equals(this.password));
        return this.statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName){
        status = this.statusAkun;
        
        if(status == true){
            System.out.println("******HALLO " + parUserName.toUpperCase() + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
            //System.out.println("Selamat Datang di Aplikasi ini");
        }
        else{
            System.out.println("Oooops, Username atau Password anda salah");
        }
    }
    
    /**
     *
     * @param parPassword
     * @param parUserName
     */
    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
    
    
}
