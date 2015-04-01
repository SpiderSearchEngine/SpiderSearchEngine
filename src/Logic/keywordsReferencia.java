
package Logic;

import Logic.List;

/**
 * Clase para la lista de keywords
 * @author Gerald M, Jairo O
 */
public class keywordsReferencia <G>{
    private G URL;
    private String name;
    private List lista;
    /**
     * Constructor de la clase
     * @param palabra
     * @param URL 
     */
    public keywordsReferencia(String palabra,G URL){
       
    }
    /**
     * Metodo que modificar los URL's
     * @param URL 
     */
    public void setURL(G URL){
        this.URL=URL;
    }
    /**
     * Funcion para obtener los URL's
     * @return 
     */
    public G getURL(){
        return URL;
    }/**
     * Metodo para modificar nombre
     * @param palabra 
     */
    public void setname(String palabra){
        this.name=palabra;
    }
    /**
     * Funcion para la obtencion de nombre
     * @return 
     */
    public String getName(){
        return name;
    }
    
}
