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
    public static void main (String[] args)  throws ParserConfigurationException, FileNotFoundException, SAXException, IOException, InterruptedException, Exception {
        spiderBot sb = new spiderBot();
        productor p = new productor (sb, "targets.xml",1, 0);
        consumidor c1 = new consumidor(sb);
        consumidor c2 = new consumidor(sb);
        consumidor c3 = new consumidor(sb);
        consumidor c4 = new consumidor(sb);
        consumidor c5 = new consumidor(sb);
        consumidor c6 = new consumidor(sb);
        consumidor c7 = new consumidor(sb);
        consumidor c8 = new consumidor(sb);
        consumidor c9 = new consumidor(sb);
        consumidor c10 = new consumidor(sb);
        
        p.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        
        
        while(sb.getParar()==true){
            c1.run();
            c2.run();
            c3.run();
            c4.run();
            c5.run();
            c6.run();
            c7.run();
            c8.run();
            c9.run();
            c10.run();
            
            
        }
        sb.generarIndice();
    }
}
