/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author jairo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List l = new List(null, null);
        url u = new url (0, "daniel.es");
        url u1 = new url (0, "jairo.com");
        l.insertHead(u);
        l.insertHead(u1);
        
        System.out.println(u.getNumAsoc());
        System.out.println(u.getDireccion());
        System.out.println("------------");
        System.out.println(((url)l.getHead().getData()).getDireccion());
        
        
    }
    
}
