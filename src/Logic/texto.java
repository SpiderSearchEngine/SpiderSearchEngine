package Logic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Clase para extraer el texto de la pagina web
 * @author Gerald M, Jairo O
 */
public class texto {
    public String linkfinal;
    /**
    * Funcion para extraer todo el texto de una pagina html.
    * @return
    * @throws MalformedURLException
    * @throws IOException 
    */
    public String extraerTexto(String string_url)throws MalformedURLException, IOException{
		// TODO Auto-generated method stub
	
		//Pasar el URL
		URL url= new URL(string_url);
		//Abrir la possibilidad de coneccion
		URLConnection conexion=url.openConnection();
		//Conectarse
		conexion.connect();
		/*
		 * Aqui se hace la lectura del texto HTML si es que el URL lo posee
		 * */
		InputStream entrada =conexion.getInputStream();
		BufferedReader lectura= new BufferedReader(new InputStreamReader(entrada));
		String contenido="";
		String linea=lectura.readLine();
		while (linea!=null){
			contenido+=linea;
			linea=lectura.readLine();
		}
		return contenido;
			
		
	}
}