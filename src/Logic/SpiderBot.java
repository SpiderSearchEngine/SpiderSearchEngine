package Logic;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * Clase para realizar el SpiderBot.
 * @author Jairo O, Gerald M.
 */
public class SpiderBot {
    
    private String _url; 
    private int _maxthreads;
    private int _maxprofundidad;
    private int _reindex;   
    /**
     * Constructor de la clase
     */
    public SpiderBot(){
    }
    /**
     * Metodo para obtener los datos de un xml, en este caso,el de "targets".
     * @param url. Direccion del xml.
     * @param indice. Numero asociado a la pagina.
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException 
     */
    public void obtenerurl(String url, int indice, int numAsoc) throws ParserConfigurationException, SAXException, IOException{
        leerxml lxml =new leerxml();
        QueueList cola = new QueueList(null, null);        
        procesarURLS procUrls = new procesarURLS();
        StackList pila = new StackList (null);
        for (int i=indice; i<=19; i+=2){
            cola.enqueue(new url (lxml.leer(url, i), numAsoc));
        }        
        url URL = ((url)(cola.dequeue().getData()));
        pila=procUrls.procesar(URL);
    }
}