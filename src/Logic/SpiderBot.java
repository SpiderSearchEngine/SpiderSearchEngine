

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
    public SpiderBot(){}/*String url){
        
        this._url=url;
    }*/
    /**
     * Metodo para obtener los datos de un xml, en este caso,el de "targets".
     * @param url. Direccion del xml.
     * @param indice. Numero asociado a la pagina.
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException 
     */
    public void obtenerurl(String url, int indice) throws ParserConfigurationException, SAXException, IOException{
        leerxml le =new leerxml();
        QueueList ql = new QueueList(null, null);
        
        for (int i=indice; i<=7; i+=2){
            ql.enqueue(new url (0,le.leer(url, i)));
            System.out.println("inserte: "+ le.leer(url, i));
        }
    }
}
