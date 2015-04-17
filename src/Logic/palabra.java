                 package Logic;

/**
 * Clase para la lista de keywords
 * @author Gerald M, Jairo O
 */
public class palabra <G>{
    
    private String name;
    private listKey listaReferencia;
    private node url;
    /**
     * Constructor de la clase
     * @param palabra
     * @param URL 
     */
    public palabra(String palabra, node URL){
       this.name=palabra;
       this.url=URL;
    }
    /**
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
    /**
     * Funcion para la obtencion de url
     * @return node url
     */
    public node getUrl(){
        return url;
    }
    /**
     * Funcion para la obtencion de la lista
     * @return listaReferencia
     */
    public listKey getListaReferencia(){
        return listaReferencia;
    }
    
    public void insertar (){
        listaReferencia.insertHead(url);
    }
    
}
