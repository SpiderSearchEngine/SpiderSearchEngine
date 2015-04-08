/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author gerald
 */
public class NodoKey <G> extends Node {
    private Node _num;
    
    public NodoKey(G pdata,Node next,Node prev, Node _num){
        super(pdata,next,prev);
        this._num=_num;
        
    }
    /**
     * 
     * @param _num 
     */
    public void setNum(Node _num){
        this._num=_num;
    }

    /**
     * @return the _num
     */
    public Node getNum() {
        return _num;
    }
    
    
}
