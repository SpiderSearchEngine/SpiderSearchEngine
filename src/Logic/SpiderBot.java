/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author jairo
 */
public class SpiderBot {
    
    private String _url;
    private int _maxthreads;
    private int _maxprofundidad;
    private int _reindex;   
    
    public SpiderBot(){}/*String url){
        
        this._url=url;
    }*/
    
    public void obtenerurl(String url, int indice) throws ParserConfigurationException, SAXException, IOException{
        leerxml le =new leerxml();
        QueueList ql = new QueueList(null, null);
        
        for (int i=indice; i<=7; i+=2){
            ql.enqueue(new url (0,le.leer(url, i)));
            System.out.println("inserte: "+ le.leer(url, i));
        }
    }
}
