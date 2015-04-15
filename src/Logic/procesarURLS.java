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
        url URL = ((url)(cola.dequeue().getData()));
        String pag = URL.getDireccion();
        int numAsoc = URL.getNumAsoc();
        if (!(pag.endsWith(".org")|| pag.endsWith(".com") || pag.endsWith(".cr")
                || pag.endsWith(".ac") || pag.endsWith(".es") || pag.endsWith(".mx")
                || pag.endsWith(".co") || pag.endsWith(".net"))){
            String str ="";
            int i=0;
            while(!(str.endsWith(".org") || str.endsWith(".com") ||str.endsWith(".cr")
                || str.endsWith(".ac") || str.endsWith(".es") || str.endsWith(".mx")
                || str.endsWith(".co") || str.endsWith(".net"))){
                str+=pag.substring(i, i+1);
                i++;
                }
            extraerLinks el = new extraerLinks(str);
            el.extraerTexto(pag, numAsoc);
            
            
            
        }
        else{
            extraerLinks el = new extraerLinks(pag);
            el.extraerTexto(pag, numAsoc);
        }
        
    }
    
}
