/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author jairo
 */
public class generadorIndice extends Thread{
    private spiderBot _sb;
    /**
     * 
     * @param sp 
     */
    public generadorIndice(spiderBot sp){
        this._sb=sp;
    }
    
    public void run (){
        try {
            _sb.generarIndice();
        }
        catch (IOException ex) {
            Logger.getLogger(consumidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(generadorIndice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
