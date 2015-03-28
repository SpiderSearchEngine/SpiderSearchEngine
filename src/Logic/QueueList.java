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
public class QueueList {
    private Node _head;
    private Node _tail;
    
    public QueueList (Node head, Node tail){
        this._head=head;
        this._tail=tail;
    }
    
    public void enqueue (int pData){
        if (_head == null)
            _head=_tail=new Node (pData, null, null);
        else{
            _tail.setNextNode(new Node (pData, null, _tail));
            _tail=_tail.getNextNode();
        }
    }
    public Node dequeue (){
        if (_head == null)
            return null;
        else{
            Node tmp=_head;
            _head=_head.getNextNode();
            _head.setPrevNode(null);
            tmp.setNextNode(null);
            return tmp;
        }
    }
}
