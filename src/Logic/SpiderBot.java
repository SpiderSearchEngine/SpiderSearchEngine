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
    public void obtenerurl(String url, int indice, int nAsoc) throws ParserConfigurationException, SAXException, IOException{
        leerxml lxml =new leerxml();
        QueueList ql = new QueueList(null, null);        
        for (int i=indice; i<=19; i+=2){
            ql.enqueue(new url (nAsoc,lxml.leer(url, i)));
        }
        procesarURLS pUrls = new procesarURLS();
        pUrls.procesar(ql);
    }
}