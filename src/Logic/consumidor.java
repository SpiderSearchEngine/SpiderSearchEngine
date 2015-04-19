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
public class consumidor extends Thread{
    private spiderBot _sb;
    
    
    public consumidor(spiderBot sp){
        this._sb=sp;
    }
    
    public void run (){
        try {
            _sb.obtenerDatos();
        } catch (IOException ex) {
            Logger.getLogger(consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
