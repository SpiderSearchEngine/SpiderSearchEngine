package Logic;

import Logic.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerald and jairo
 */
public class keyByKey <G>{
    private String dato;
    //nodo 
    List lista=new List(null,null);
    //CircularList cir_lis=new CircularList(null);
    //Node nodo;
    //keys_referencias objeto_keyword=new keywords_referencia(nombre, null);
    /**
     * Lo que pasa aqui es que se va a hacer referencia a la clase Texto para 
     * obtener puramente el texto plano en html
     */
    
    /**
     * 
     * @param a_procesar 
     */
    public keyByKey(String a_procesar){
         this.dato=a_procesar;
    }

    /**
     * @param args the command line arguments
     */
    
    public void procesar(){
        String nombre="";
        //keywords_referencia objeto_keyword;
        while(!dato.equals("")){
            Character chardato =dato.charAt(0);
            if(Character.toString(chardato).equals(" ")){
                if (nombre!="")
                    //lista.insertHead(nombre);
                    //lista.insertHead(new keywords_referencia(nombre, cir_lis.getHead()));
                dato=dato.substring(1,dato.length());
                nombre="";
            }
            else{
                nombre=nombre+chardato;
                dato=dato.substring(1,dato.length());
            }
        }
        lista.print();
        
    }
}
