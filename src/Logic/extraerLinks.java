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
    /**
     * Metodo que extrae el HTML de la pagina web
     * @param string_url. Pagina solicitada
     * @throws MalformedURLException
     * @throws IOException 
     */
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
    /**
     * Metodo para obtener solamente los links
     * @param contenido. HTML de la pagina web
     */
    public void extraerURL(String contenido){
        Pattern patron=Pattern.compile("(?i)HREF\\s*=\\s*\"(.*?)\"");
        Matcher matcher=patron.matcher(contenido);
        while(matcher.find())
            verificar(matcher.group(1), _url);
	}
    /**
     * Metodo para dar el formato a los links
     * @param dato. link a analizar
     * @param url. Pagina solicitada
     */
    private void verificar(String dato, String url){
        if (dato.endsWith(".css")||dato.startsWith("//")|| dato.startsWith("#"))
            System.out.println("1");
        else if (dato.startsWith("http") || dato.startsWith("https"))
            System.out.println("2");
        else if (dato.length()>1 && dato.startsWith("/") )
            System.out.println(url+dato);
        else
            System.out.println("3");
        
    }
}