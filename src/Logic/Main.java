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
    public static void main (String[] args)  throws ParserConfigurationException, FileNotFoundException, SAXException, IOException, InterruptedException {
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
        consumidor c11 = new consumidor(sb);
        consumidor c12 = new consumidor(sb);
        consumidor c13 = new consumidor(sb);
        consumidor c14 = new consumidor(sb);
        consumidor c15 = new consumidor(sb);
        consumidor c16 = new consumidor(sb);
        consumidor c17 = new consumidor(sb);
        consumidor c18 = new consumidor(sb);
        consumidor c19 = new consumidor(sb);
        consumidor c20 = new consumidor(sb);
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
        c11.start();
        c12.start();
        c13.start();
        c14.start();
        c15.start();
        c16.start();
        c17.start();
        c18.start();
        c19.start();
        c20.start();
        
        while(true){
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
            c11.run();
            c12.run();
            c13.run();
            c14.run();
            c15.run();
            c16.run();
            c17.run();
            c18.run();
            c19.run();
            c20.run();
            
        }
    }
}
