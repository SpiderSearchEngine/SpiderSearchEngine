/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;



/**
 *
 * @author jairo
 */
public class App1Thread implements Runnable{
    Thread t = new Thread( this );
    int contador;
    boolean suspendido=true;

    public void init() {
        contador = 0;
        //t = new Thread( this );
        t.start();
        }

    public void run() {
        while (contador<50 )
            {
            System.out.println(contador);
            contador++;
            try {
                t.sleep( 1000 );
                
                if (contador==5 || contador==15 || contador == 25 || contador == 35 || contador == 45){
                    
                    pausa(true);}
                
                if (contador==47)
                    stop();
            } catch( InterruptedException e ) {
                ;        
                };
            }
        }

    public void stop() {
        t.stop();
        }
    public void pausa(boolean susp){
        if (susp==suspendido){          
        
            t.interrupt();
            
            for (int i=0; i<5; i++ )
                System.out.println("***"+i);
            pausa(false);}
        
        else 
            t.run();      
        
    }
    
    }
