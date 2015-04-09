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
public class Main {    
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)  throws ParserConfigurationException, FileNotFoundException, SAXException, IOException {
        
        //SpiderBot sb = new SpiderBot();
        //sb.obtenerurl("targets.xml",1, 0);
        //System.out.println("entre");
       
        ListKey l = new ListKey(null, null);
        l.insertHead("www.google.com");
        l.getHead().setNumNode(new Node (2, null, null));
        l.insertHead("www.wikipedia.com");
        l.getHead().setNumNode(new Node (3, null, null));
        l.insertHead("www.yahoo.com");
        l.getHead().setNumNode(new Node (5, null, null));
        
        System.out.println(l.getHead().getData());
        System.out.println(l.getHead().getNumNode().getData());
        System.out.println(l.getHead().getNextNode().getData());
        System.out.println(l.getHead().getNextNode().getNumNode().getData());
        System.out.println(l.getHead().getNextNode().getNextNode().getData());
        System.out.println(l.getHead().getNextNode().getNextNode().getNumNode().getData());
        
    }
}