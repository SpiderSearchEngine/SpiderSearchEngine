/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author gerald
 */
public class createXmlForKeywords<G> {
    public createXmlForKeywords(){
        
    }
    
    
    public void generate(String name, ArrayList<String> palabras,ArrayList<String>links) throws Exception{
        //System.out.println("GERALD EL GOZADO");
 
        if(palabras.isEmpty() ){
            System.out.println("ERROR empty ArrayList");
            return;
        }else{
 
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, name, null);
            document.setXmlVersion("1.0");
 
            //Main Node
            Element raiz = document.getDocumentElement();
            //Por cada palabras creamos un item que contendrá la palabras y el value
            Element itemNode1 = document.createElement("KeyWords");
            

            raiz.appendChild(itemNode1);
            //Element itemNode2 = document.createElement("UrlsProcesadas"); 
            //raiz.appendChild(itemNode2);
            
            
            for(int i=0; i<palabras.size();i++){
                //Item Node
                //Element itemNode1 = document.createElement("KeyWords"); 
                
                
                Element itemNode2 = document.createElement("KeyWord");
                
                //Key Node
                
                Element palabraNode = document.createElement("Palabra"); 
                Text palabraValue = document.createTextNode(palabras.get(i));
                palabraNode.appendChild(palabraValue);  
                /**
                 * 
                 */
                Element linkNode = document.createElement("Link"); 
                Text linkValue = document.createTextNode(links.get(i));
                linkNode.appendChild(linkValue); 
                /**
                 * 
                 */
                itemNode1.appendChild(itemNode2);
                itemNode2.appendChild(palabraNode);
                itemNode2.appendChild(linkNode);
                
                
            }                
            //Generate XML
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(name+".xml")); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        }
    }
    
}
