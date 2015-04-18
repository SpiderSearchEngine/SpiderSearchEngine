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
    public palabra(String palabra, listKey lista){
       this.name=palabra;
       this.listaReferencia=lista;
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
    
    public void insertar (node URL){
        listaReferencia.insertHead(URL);
    }
    
}
