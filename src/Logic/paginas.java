
package Logic;

/**
 * Clase para el objeto de paginas web que se presenta al usuario
 * @author Gerald M, Jairo O
 */
public class paginas extends url{
    
    private int _trustworthy;
    /**
     * Constructor de la clase
     * @param numReferencia
     * @param direccion
     * @param trustworthy 
     */
    public paginas (String direccion, int numReferencia, int trustworthy){
        super(direccion, numReferencia);
        this._trustworthy=trustworthy;
    }
    /**
     * Funcion para obtener el Trustworthy
     * @return 
     */
    public int getTrustworthy (){
        return this._trustworthy;
    }
    /**
     * Metodo para mpodificar el trustworthy
     * @param trustworthy 
     */
    public void setTrustworthy (int trustworthy){
        this._trustworthy=_trustworthy+trustworthy;
    }    
}
