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
public class paginas extends url{
    
    private int _trustworthy;
    public paginas (int NumAsoc, String direccion, int trustworthy){
        super(NumAsoc, direccion);
        this._trustworthy=trustworthy;
    }
    
    public int getTrustworthy (){
        return this._trustworthy;
    }
    public void setTrustworthy (int trustworthy){
        this._trustworthy=trustworthy;
    }
    
}
