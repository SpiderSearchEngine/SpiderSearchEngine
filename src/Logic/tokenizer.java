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
            if (dato.length()>=3 && dato!="que" && dato!="ante" && dato!="bajo"
                    && dato!="cabe" && dato!="con" && dato!="contra" &&dato!="desde"
                    && dato!="entre" && dato!="hacia" && dato!="hasta" && dato!="para"
                    && dato!="por" && dato!="según" && dato!="sin" && dato!="sobre"
                    && dato!="tras" && dato!="las"  && dato!="los"){
                sl.push(dato);
            }
        }
        return sl;
    }
}
    

