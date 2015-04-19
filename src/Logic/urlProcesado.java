/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author jairo
 */
public class urlProcesado {
    private int _referencia;
    private String _direccion;
    private int _trustworthy;
    
    public urlProcesado (String direccion, int referencia, int trustworthy){
        this._referencia=referencia;
        this._direccion=direccion;
        this._trustworthy=trustworthy;
    }
    public void setReferencia (int numAsoc){
        this._referencia=numAsoc;
    }
    
    public int getReferencia(){
        return _referencia;
    }
    /**
     * Metodo para cambiar la direccion
     * @param direccion 
     */
    public void setDireccion (String direccion){
        this._direccion=direccion;
    }
    /**
     * Funcion para obtener direccion
     * @return 
     */
    public String getDireccion (){
        return _direccion;
    }

    /**
     * @return the _trustworthy
     */
    public int getTrustworthy() {
        return _trustworthy;
    }

    /**
     * @param _trustworthy the _trustworthy to set
     */
    public void setTrustworthy(int _trustworthy) {
        this._trustworthy = _trustworthy;
    }
    
}
