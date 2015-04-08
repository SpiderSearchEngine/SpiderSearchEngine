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
 * Clase que iniciara la aplicacion
 * @author Gerald M, Jairo O
 */
public class Main <G>{    
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)  throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
        
        SpiderBot sb = new SpiderBot();
        sb.obtenerurl("targets.xml",1, 0);     
       
        
        
    }
}