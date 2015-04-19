/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.util.StringTokenizer;

/**
 *
 * @author jairo
 */
public class usuario {
    private list buscar = new list(null,null);
    private String _dato;    
    
    public usuario(String dato){
        this._dato=dato;
    }
    
    public list busqueda(){
        StringTokenizer st = new StringTokenizer(_dato);
        while (st.hasMoreTokens()) {
            _dato = st.nextToken();
            buscar.insertHead(_dato);
        }
        return buscar;
    }          
}
