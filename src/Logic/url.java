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
public class url {
    
    private int _NumAsoc;
    private String _direccion;
    
    public url (int NumAsoc, String direccion){
        this._NumAsoc=NumAsoc;
        this._direccion=direccion;
    }
    public void setNumAsoc (int numAsoc){
        this._NumAsoc=numAsoc;
    }
    public int getNumAsoc(){
        return _NumAsoc;
    }
    
    public void setDireccion (String direccion){
        this._direccion=direccion;
    }
    public String getDireccion (){
        return _direccion;
    }
}
