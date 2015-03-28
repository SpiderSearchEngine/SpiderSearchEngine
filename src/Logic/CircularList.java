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
public class CircularList <generic>{
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
    
    public void insertHead (generic pData){
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
    public void insertTail(generic pData){
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
    public void insertInOrder(generic pData){
        if (_head==null){
            _head=new Node (pData, _head, _head);
            _head.setNextNode(_head);
            _head.setPrevNode(_head);
        }
        else if ((Integer)pData<(Integer)_head.getData()){            
            _head=(new Node(pData, _head,_head.getPrevNode()));
            _head.getNextNode().setPrevNode(_head);
            _head.getPrevNode().setNextNode(_head);            
        }
        else{
            Node tmp=_head;
            while(tmp.getNextNode()!=_head && (Integer)tmp.getNextNode().getData()<(Integer)pData)
                tmp=tmp.getNextNode();
            tmp.setNextNode(new Node (pData, tmp.getNextNode(), tmp));
            tmp.getNextNode().getNextNode().setPrevNode(tmp.getNextNode());
        }
    }
    public Node delete (generic pData){
        Node tmp=null;
        if (_head==null)
            return null;
        else if ((Integer)_head.getData()==(Integer)pData && _head.getNextNode()==_head){
            tmp=_head;
            _head=null;
        }
        else{
            tmp=_head;
            _head=_head.getNextNode();
            while(tmp!=_head &&(Integer) _head.getData()!=(Integer)pData)
                _head=_head.getNextNode();
            if (tmp==_head && (Integer)_head.getData()!=(Integer)pData)
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
    public boolean find (generic pData){
        Node tmp = _head;
        boolean condition = false;
        while(tmp.getNextNode()!=_head){
            if ((Integer)tmp.getData()!= (Integer)pData)
                tmp=tmp.getNextNode();
            else{
                condition=true;
                break;
            }
        }
        if ((Integer)tmp.getData()== (Integer)pData)
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
