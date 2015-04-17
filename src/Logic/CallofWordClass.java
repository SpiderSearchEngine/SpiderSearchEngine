/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.IOException;

/**
 *
 * @author Jairo O, Gerald M.
 */
public class CallofWordClass {
    //WordsClass lectura= new WordsClass(null,null);
    String dato;
    String[] expresiones=new String[47];
    public CallofWordClass(){
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
    }
    
    public void hacer_El_Llamado(String url) throws IOException{
        
       SacarCodigoClass extractor=new SacarCodigoClass();
        dato=extractor.extraerTexto(url);
        //Aqui obtiene todo el texto o codigo HTML
        //System.out.println("1: "+dato);

        dato=dato.replaceAll("\\<.*?>", " ");
        //System.out.println("2: "+dato);
        for(int i=0; i<expresiones.length;i++){
         dato=dato.replace(expresiones[i], " ");
        }
        //System.out.println("3: "+dato);
        /**
         * Aqui se instancia la clase key_by_key la cual 
         * me extrae palabra por palabra todo el html 
         * sin incluir los tags.
         */
        WordbyWordClass palabra_obtencion=new WordbyWordClass(dato,url);
        palabra_obtencion.procesar();
    }
       
}
