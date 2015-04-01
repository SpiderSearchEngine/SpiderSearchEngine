package Logic;

import java.io.IOException;

/**
 * Clase para desencolar y procesar los URL's
 *  @author Gerald M, Jairo O
 */
public class procesarURLS {
    /**
     * Constructor de la clase
     */
    public procesarURLS(){
        
    }
    /**
     * Metodo que procesa los URL's
     * @param cola
     * @throws IOException 
     */
    public void procesar (QueueList cola) throws IOException{
        String pag = ("http://"+((url)cola.dequeue().getData()).getDireccion());
        extraerLinks el = new extraerLinks(pag);
        el.extraerTexto(pag);
    }
    
}
