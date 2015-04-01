package Logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Clase para obtener los links de las paginas web
 * @author Gerald M, Jairo O.
 */
public class extraerLinks {
    private String _url;
    /**
     * Constructor de la clase
     * @param url 
     */
    public extraerLinks(String url){
        this._url=url;
    }
    public void extraerTexto(String string_url)throws MalformedURLException, IOException{
        URL url = new URL(string_url);
        URLConnection conexion=url.openConnection();
        InputStream entrada =conexion.getInputStream();
        BufferedReader br= new BufferedReader(new InputStreamReader(entrada)); 
        String contenido="";
        String linea=br.readLine();
        while (linea!=null){
                contenido+=linea;
                linea=br.readLine();
        }
        extraerURL(contenido);
    }
    
    public void extraerURL(String contenido){
        Pattern patron=Pattern.compile("(?i)HREF\\s*=\\s*\"(.*?)\"");
        Matcher matcher=patron.matcher(contenido);
        while(matcher.find())
            verificar(matcher.group(1), _url);
	}

    private void verificar(String dato, String url){
        Character chardato =dato.charAt(0);
        System.out.println(url+dato);
        if(Character.toString(chardato).equals("/"))
            System.out.println(url+dato);
        else if (Character.toString(chardato).equals("#"))
            System.out.println("nada");
        else if (Character.toString(chardato).equals("h")){
            
            String tmp = "";
            int i=0;
            while((tmp!="https:" || tmp!="http:") && i<6){
                tmp+=dato.charAt(i);
                i++;              
            }
            if (tmp!="https:" || tmp!="http:" )
                System.out.println(dato);
            else
                System.out.println(url+"/"+dato); 
        }
        else
            System.out.println(url+"/"+dato);
    }
    
}
