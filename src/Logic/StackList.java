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
public class StackList <G>{
    
    private Node _head;
    
    public StackList (Node head){
        this._head=head;
    }
    
    public void push (G pData){
        _head=new Node (pData, _head, null);
    }
    public Node pop (){
        Node tmp = _head;
        _head = _head.getNextNode();
        tmp.setNextNode(null);
        return tmp;
    }
    public Node top (){
        return _head;
    }
}
