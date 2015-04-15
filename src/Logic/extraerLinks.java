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
    public StackList extraerTexto(String string_url, int numAsoc) throws MalformedURLException, IOException{
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
        return extraerURL(contenido, numAsoc);
    }
    /**
     * Metodo para obtener solamente los links
     * @param contenido. HTML de la pagina web
     */
    private StackList extraerURL(String contenido, int numAsoc) {
        Pattern patron=Pattern.compile("(?i)HREF\\s*=\\s*\"(.*?)\"");
        Matcher matcher=patron.matcher(contenido);
        StackList sl = new StackList (null);
        while(matcher.find())
            sl.push(matcher.group(1));
        return verificar(sl, _url, numAsoc);
    }

    
    
    /**
     * Metodo para dar el formato a los links
     * @param dato. link a analizar
     * @param url. Pagina solicitada
     */
    private StackList verificar(StackList pila, String url, int numAsoc){  
        StackList sl = new StackList (null);
        while (pila.top()!=null){
            String dato = (String)pila.top().getData();
            if (dato.endsWith(".css")||dato.startsWith("//")|| dato.startsWith("#") || dato.startsWith("https"))
                pila.pop();
            else if (dato.startsWith("http")){
                String str ="";
                int i=7;
                str=dato.substring(i,dato.length()-1);
                sl.push(new url(str, numAsoc+1));
                pila.pop();
            }
            else if (dato.length()>1 && dato.startsWith("/") ){
                sl.push(new url(url+dato, numAsoc+1));
                pila.pop();
            }
            else{
                pila.pop();
            }
        }
        return sl;
    }
}