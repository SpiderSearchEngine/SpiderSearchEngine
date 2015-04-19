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
    
    public urlProcesado (String direccion, int referencia){
        this._referencia=referencia;
        this._direccion=direccion;
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
    
}
