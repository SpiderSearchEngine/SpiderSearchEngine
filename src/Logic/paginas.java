/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 *@author Gerald M, Jairo O
 */
public class paginas extends url{
    
    private int _trustworthy;
    /**
     * Constructor de la clase
     * @param NumAsoc
     * @param direccion
     * @param trustworthy 
     */
    public paginas (int NumAsoc, String direccion, int trustworthy){
        super(NumAsoc, direccion);
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
        this._trustworthy=trustworthy;
    }
    
}
