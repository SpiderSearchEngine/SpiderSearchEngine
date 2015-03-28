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
public class CircularList {
    private Node _head;
    
    public CircularList (Node _head){
        this._head=_head;
    }
    
    public Node getHead (){
        return this._head;
    }
    
    public void setHead(Node head){
        this._head=head;
    }
    
    public void insertHead (int pData){
        if (_head==null){
            _head=new Node (pData, _head,_head );
            _head.setNextNode(_head);
            _head.setPrevNode(_head);
        }
        else {
            _head=(new Node (pData, _head, _head.getPrevNode()));
            _head.getNextNode().setPrevNode(_head);
            _head.getPrevNode().setNextNode(_head);
        }
    }
    public void insertTail(int pData){
        if (_head==null){
            _head=new Node (pData, _head,_head );
            _head.setNextNode(_head);
            _head.setPrevNode(_head);
        }
        else{
            Node tmp=_head;
            while (tmp.getNextNode()!=_head)
                tmp=tmp.getNextNode();
            tmp.setNextNode(new Node (pData, tmp.getNextNode(), tmp));
            tmp.getPrevNode().setPrevNode(tmp.getNextNode());
        }
    }
    public void insertInOrder(int pData){
        if (_head==null){
            _head=new Node (pData, _head, _head);
            _head.setNextNode(_head);
            _head.setPrevNode(_head);
        }
        else if (pData<_head.getData()){            
            _head=(new Node(pData, _head,_head.getPrevNode()));
            _head.getNextNode().setPrevNode(_head);
            _head.getPrevNode().setNextNode(_head);            
        }
        else{
            Node tmp=_head;
            while(tmp.getNextNode()!=_head && tmp.getNextNode().getData()<pData)
                tmp=tmp.getNextNode();
            tmp.setNextNode(new Node (pData, tmp.getNextNode(), tmp));
            tmp.getNextNode().getNextNode().setPrevNode(tmp.getNextNode());
        }
    }
    public Node delete (int pData){
        Node tmp=null;
        if (_head==null)
            return null;
        else if (_head.getData()==pData && _head.getNextNode()==_head){
            tmp=_head;
            _head=null;
        }
        else{
            tmp=_head;
            _head=_head.getNextNode();
            while(tmp!=_head && _head.getData()!=pData)
                _head=_head.getNextNode();
            if (tmp==_head && _head.getData()!=pData)
                tmp=null;
            else{
                tmp=_head;
                tmp.getPrevNode().setNextNode(tmp.getNextNode());
                tmp.getNextNode().setPrevNode(tmp.getPrevNode());
                _head=tmp.getNextNode();
                tmp.setNextNode(null);
                tmp.setPrevNode(null);
            }           
        }
        return tmp;
    }
    public boolean find (int pData){
        Node tmp = _head;
        boolean condition = false;
        while(tmp.getNextNode()!=_head){
            if (tmp.getData()!= pData)
                tmp=tmp.getNextNode();
            else{
                condition=true;
                break;
            }
        }
        if (tmp.getData()== pData)
            condition=true;
        System.out.println(condition);
        return condition;        
    }
    
    public void print (){
        Node tmp=_head;
        int i=0;
        while(tmp.getNextNode()!=_head){
            System.out.println("pos= "+(i++)+" dato = "+tmp.getData());
            tmp=tmp.getNextNode();
        }
        System.out.println("pos= "+(i++)+" dato = "+tmp.getData());
    }
}
