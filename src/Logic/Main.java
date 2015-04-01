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
    
    public static String dato;
    public static String dato_links;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws ParserConfigurationException, FileNotFoundException, SAXException, IOException{
        
        SpiderBot sb = new SpiderBot();
        sb.obtenerurl("/home/jairo/NetBeansProjects/SpiderSearchEngine/src/XML/targets.xml",1);
        
        /**
         * Aqui se esta instancean la clase texto la cual me trae todo el texto 
         * de un html, para luego ser procesado y separado palabra por palabra.
         */
        texto texto=new texto();
        texto.extraer_el_texto("http://www.google.com");
        //System.out.println(texto.extraer_el_texto());
        
        /***
        * Aqui es para probar hacer u array para guardar todas las expresiones regulares
        */
       String[] expresiones=new String[47];
       expresiones[0]="ª";
       expresiones[1]="º";
       expresiones[2]="\\";
       expresiones[3]="!";
       expresiones[4]="...";
       expresiones[5]="¿";
       expresiones[6]="?";
       expresiones[7]="(";
       expresiones[8]="[";
       expresiones[9]="_";
       expresiones[10]="-";
       expresiones[11]="|";
       expresiones[12]="'";
       expresiones[13]="{";
       expresiones[14]="/";
       expresiones[15]=")";
       expresiones[16]="=";
       expresiones[17]="]";
       expresiones[18]="}";
       expresiones[19]="·";
       expresiones[20]="$";
       expresiones[21]="&nbsp";
       expresiones[22]="Ç";
       expresiones[23]="º";
       expresiones[24]="!";
       expresiones[25]="&";
       expresiones[26]="•";
       expresiones[27]="@";
       expresiones[28]="url";
       expresiones[29]=":";
       expresiones[30]=".";
       expresiones[31]=",";
       expresiones[32]="*";
       expresiones[33]="+";
       expresiones[34]="¡";
       expresiones[35]=";";
       expresiones[36]="1";
       expresiones[37]="2";
       expresiones[38]="3";
       expresiones[39]="4";
       expresiones[40]="5";
       expresiones[41]="6";
       expresiones[42]="7";
       expresiones[43]="8";
       expresiones[44]="9";
       expresiones[45]="0";
       expresiones[46]="px";
       
       
       /**Texto extractor=new Texto();
        dato=extractor.extraer_el_texto("http://www.google.com");
        //Aqui obtiene todo el texto o codigo HTML
        System.out.println("1: "+dato);

        dato=dato.replaceAll("\\<.*?>", " ");
        System.out.println("2: "+dato);
        for(int i=0; i<expresiones.length;i++){
         dato=dato.replace(expresiones[i], " ");
        }
        System.out.println("3: "+dato);*/

        /**
         * Aqui se instancia la clase key_by_key la cual 
         * me extrae palabra por palabra todo el html 
         * sin incluir los tags.
         */
        //key_by_key palabra_obtencion=new key_by_key(dato);
        //palabra_obtencion.procesar();
         /**
         * Aqui se instancia la clase extrac_links la cual 
         * me extrae los urls.
         */
        extraerLinks links=new extraerLinks();
        /*
        Ahora esta variable tomara el texto completo HTML
        */
        dato_links=links.extraer_el_texto("http://www.google.com");
        System.out.println("1: "+dato_links);
        /*
        Ahora se tomara los links presentes en ese HTML
        */
        links.leer_solo_los_URL(dato_links);
    
    }
}