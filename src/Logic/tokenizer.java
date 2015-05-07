/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.StringTokenizer;

/**
 *
 * @author Jairo O, Gerald M.
 */
public class tokenizer <G>{
    private String dato;
    String url;
    int contador=0;
    //nodo 
    //listaClass lista=new listaClass(null,null);
    /**
     * Lo que pasa aqui es que se va a hacer referencia a la clase Texto para 
     * obtener puramente el texto plano en html
     */
    public tokenizer(String a_procesar, String url){
         this.dato=a_procesar;
         this.url=url;
    }
    /**
     * @param args the command line arguments
     */
    public stackList procesar(){
        stackList sl = new stackList (null);
        StringTokenizer st = new StringTokenizer(dato);
        while (st.hasMoreTokens()) {
            dato = (String)st.nextToken();
            if (dato.length()>=3 && dato.compareTo("ante")!=0 
                    && dato.compareTo("bajo")!=0 && dato.compareTo("cabe")!=0 
                    && dato.compareTo("con")!=0 && dato.compareTo("contra")!=0 
                    && dato.compareTo("desde")!=0 && dato.compareTo("entre")!=0 
                    && dato.compareTo("hacia")!=0 && dato.compareTo("hasta")!=0 
                    && dato.compareTo("para")!=0 && dato.compareTo("por")!=0 
                    && dato.compareTo("según")!=0 && dato.compareTo("sin")!=0 
                    && dato.compareTo("sobre")!=0 && dato.compareTo("tras")!=0 
                    && dato.compareTo("que")!=0 && dato.compareTo("del")!=0 
                    && dato.compareTo("los")!=0 && dato.compareTo("las")!=0 
                    && dato.compareTo("Ante")!=0 && dato.compareTo("Bajo")!=0 
                    && dato.compareTo("Cabe")!=0 && dato.compareTo("Con")!=0 
                    && dato.compareTo("Contra")!=0 && dato.compareTo("Desde")!=0 
                    && dato.compareTo("Entre")!=0 && dato.compareTo("Hacia")!=0 
                    && dato.compareTo("Hasta")!=0 && dato.compareTo("Para")!=0
                    && dato.compareTo("Por")!=0 && dato.compareTo("Según")!=0
                    && dato.compareTo("Sin")!=0 && dato.compareTo("Sobre")!=0 
                    && dato.compareTo("Tras")!=0 && dato.compareTo("Que")!=0 
                    && dato.compareTo("Del")!=0 && dato.compareTo("Los")!=0
                    && dato.compareTo("Las")!=0){
                sl.push(dato);
            }
        }
        return sl;
    }
}
    

