/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author jairo
 */
public class productor extends Thread{
    
    private spiderBot _sb;
    private String direccion;
    private int indice;
    private int numAsoc;
    
    public productor(spiderBot sp, String direccion, int indice, int numAsoc){
        this._sb=sp;
        this.direccion=direccion;
        this.indice=indice;
        this.numAsoc=numAsoc;
    }
    
    public void run () {
        try {
            _sb.generarCola(direccion, indice, numAsoc);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(productor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(productor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(productor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
