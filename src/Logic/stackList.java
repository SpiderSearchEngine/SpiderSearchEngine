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
public class stackList <G>{
    
    private node _head;
    
    public stackList (node head){
        this._head=head;
    }
    
    public void push (G pData){
        _head=new node (pData, _head, null);
    }
    public node pop (){
        node tmp = _head;
        _head = _head.getNextNode();
        tmp.setNextNode(null);
        return tmp;
    }
    public node top (){
        return _head;
    }
}
