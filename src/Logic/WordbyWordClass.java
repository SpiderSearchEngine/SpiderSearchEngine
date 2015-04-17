/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Jairo O, Gerald M.
 */
public class WordbyWordClass <G>{
    private String dato;
    String url;
    int contador=0;
    //nodo 
    //listaClass lista=new listaClass(null,null);
    /**
     * Lo que pasa aqui es que se va a hacer referencia a la clase Texto para 
     * obtener puramente el texto plano en html
     */
    public WordbyWordClass(String a_procesar, String url){
         this.dato=a_procesar;
         this.url=url;
         this.contador=this.contador+contador;
    }
    /**
     * @param args the command line arguments
     */
    public void procesar(){

        String nombre="";
        while(!dato.equals("")){
            Character chardato =dato.charAt(0);
            //System.out.println("Char: "+chardato);
            if(Character.toString(chardato).equals(" ")){
                //System.out.println("wwww: "+nombre);
                //return nombre; 
                if (!nombre.equals(" ") && nombre.length()>3){
                    
                    System.out.println("Palabra nueva:"+nombre);
                    
            }dato=dato.substring(1,dato.length());
            nombre="";}
            else{
                nombre=nombre+chardato.toString();
                dato=dato.substring(1,dato.length());
            }
        }
        System.out.println("Palabra nueva:"+nombre);
        //palabra= new WordsClass(nombre, url);
        //lista.insertHead(palabra);
        //return nombre;
        
        //lista.print();
    }
}
    

