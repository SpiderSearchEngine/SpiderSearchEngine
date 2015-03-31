/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class leerxml {
    
       
    public leerxml(){
        
    }
    
    
    public String leer (String direccion, int indice) throws ParserConfigurationException, FileNotFoundException, SAXException, IOException{
        try {
            DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder DB = DBF.newDocumentBuilder();
            Document documento = DB.parse(direccion);
            
            //Obtener el elemento raíz del documento
            Element raiz = documento.getDocumentElement();
            
                        
	    //Obtener los elementos de la raiz
	    NodeList elemRaiz = raiz.getChildNodes();   
	    
            Node dato = elemRaiz.item(indice);
            if(dato.getNodeType()==Node.ELEMENT_NODE) {
                    
	            //El valor está contenido en un hijo del nodo Element
	            Node datoContenido = dato.getFirstChild(); 
	                
	            //Mostrar el valor contenido en el nodo que debe ser de tipo Text
	            if(datoContenido!=null && datoContenido.getNodeType()==Node.TEXT_NODE)
                        //System.out.println(datoContenido.getNodeValue());
                        return datoContenido.getNodeValue();
	            }
            
        } catch (SAXException ex) {
            System.out.println("ERROR: El formato XML del fichero no es correcto\n"+ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("ERROR: Se ha producido un error el leer el fichero\n"+ex.getMessage());
            ex.printStackTrace();
        } catch (ParserConfigurationException ex) {
            System.out.println("ERROR: No se ha podido crear el generador de documentos XML\n"+ex.getMessage());
            ex.printStackTrace();
        }      
        return null;
    }
}
