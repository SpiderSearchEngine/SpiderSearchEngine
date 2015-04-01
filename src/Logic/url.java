/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author Gerald M, Jairo O
 */
public class url {
    
    private int _NumAsoc;
    private String _direccion;
    /**
     * Constructor de la clase
     * @param NumAsoc
     * @param direccion 
     */
    public url (int NumAsoc, String direccion){
        this._NumAsoc=NumAsoc;
        this._direccion=direccion;
    }/**
     * Metodo para cambiar el numero asociado
     * @param numAsoc 
     */
    public void setNumAsoc (int numAsoc){
        this._NumAsoc=numAsoc;
    }
    /**
     * Funcion para obtener el numero asociado
     * @return 
     */
    public int getNumAsoc(){
        return _NumAsoc;
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
