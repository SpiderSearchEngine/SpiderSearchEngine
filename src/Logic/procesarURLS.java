package Logic;

import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *  @author Gerald M, Jairo O
 */
public class procesarURLS {
    
    public procesarURLS(){
        
    }
    /**
     * Metodo para desencolar y procesar los URL's
     * @param cola
     * @throws IOException 
     */
    public void procesar (QueueList cola) throws IOException{
        String pag = ("http://"+((url)cola.dequeue().getData()).getDireccion());
        extraerLinks el = new extraerLinks(pag);
        el.extraerTexto(pag);
    }
    
}
