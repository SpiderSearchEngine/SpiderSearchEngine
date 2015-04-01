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

public class extraerLinks {
	public static String linkfinal;
	public String extraer_el_texto(String string_url)throws MalformedURLException, IOException{
		
		URL url=new URL(string_url);
		URLConnection conexion=url.openConnection();
		InputStream entrada =conexion.getInputStream();
		BufferedReader br= new BufferedReader(new InputStreamReader(entrada)); 
		String contenido="";
		String linea=br.readLine();
		while (linea!=null){
			contenido+=linea;
			linea=br.readLine();
		}
		return contenido;
	}
	

	public void leer_solo_los_URL(String contenido){
		Pattern patron=Pattern.compile("(?i)HREF\\s*=\\s*\"(.*?)\"");
		Matcher matcher=patron.matcher(contenido);
		while(matcher.find()){
			System.out.println(matcher.group(1));
			linkfinal=matcher.group(1);
		}
		System.out.println(linkfinal);
	}
}
