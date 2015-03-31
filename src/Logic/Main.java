/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author jairo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws ParserConfigurationException, FileNotFoundException, SAXException, IOException{
        
        /*List l = new List(null, null);
        url u = new url (0, "daniel.es");
        //leerxml lx = new leerxml ();
        //lx.leer("/home/jairo/NetBeansProjects/SpiderSearchEngine/src/XML/spider.xml");
        SpiderBot sb = new SpiderBot();
        sb.obtenerurl("/home/jairo/NetBeansProjects/SpiderSearchEngine/src/XML/targets.xml",1);
        */
        App1Thread a = new App1Thread();
        
        a.beepForAnHour();
    }
    
}
