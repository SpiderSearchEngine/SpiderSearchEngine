/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 *@author Jairo O, Gerald M.
 */
public class extraeTexto {

    public static String linkfinal;
    /**
    * Funcion para extraer todo el texto de una pagina html.
    * @return
    * @throws MalformedURLException
    * @throws IOException 
    */
    public String extraerTexto(String string_url)throws MalformedURLException, IOException, FileNotFoundException {
        String contenido="";
        try{
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
		
		
		
		String linea=lectura.readLine();
		while (linea!=null){
			contenido+=linea;
			linea=lectura.readLine();
                }
        }
		catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
        return contenido;
    }
}