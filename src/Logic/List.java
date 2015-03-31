
package Logic;

/**
 *
 * @author jairo
 */
public class List <G>{
    
    private Node _head;
    private Node _tail;
    
    public List (Node _head, Node _tail){
        this._head=_head;
        this._tail=_tail;
    }
    public Node getHead (){
        return this._head;
    }
    public Node getTail (){
        return this._tail;
    }
    public void setHead(Node head){
        this._head=head;
    }
    public void setTail(Node tail){
        this._tail=tail;
    }
    public void insertHead(G pData){
        if (_head==null){
            _head=(new Node (pData, _head, _tail));
            _tail=_head;
        }
        else{
            _head=(new Node (pData, _head, null));
            _head.getNextNode().setPrevNode(_head);
        }       
    }
    public void insertTail (G pData){
        if(_head==null){
            _head= new Node(pData, _head, _tail);
            _tail=_head;
        }
        else{
            Node tmp = _head;
            while(tmp.getNextNode()!=null)
                tmp=tmp.getNextNode();
            tmp.setNextNode(new Node(pData, null, tmp));
            _tail=tmp.getNextNode();
        }
    }
    public void insertInOrder(G pData){
        if (_head==null){
            _head=new Node(pData, _head, _tail);
            _tail=_head;
        }
        else if ((Integer)pData<(Integer)_head.getData()){
            _head=(new Node(pData, _head,null));
            _head.getNextNode().setPrevNode(_head);
        }
        else{
            Node tmp = _head;
            while(tmp.getNextNode()!=null && ((Integer)tmp.getNextNode().getData()<(Integer)pData))
                tmp=tmp.getNextNode();
            if(tmp.getNextNode()==null){
                tmp.setNextNode(new Node(pData,null,tmp));
                _tail=tmp.getNextNode();
            }
            else{
                tmp.setNextNode(new Node(pData, tmp.getNextNode(),tmp));
                tmp.getNextNode().getNextNode().setPrevNode(tmp.getNextNode());
            }
            
            
        }
    }
    public Node delete (G pData){
        Node tmp = null;
        if (_head == null)
            return _head;
        else if ((Integer)_head.getData()==(Integer)pData){
            tmp=_head;
            if (_head.getNextNode()==null){
                _head=null;
            }
            else{ 
                tmp.getNextNode().setPrevNode(null);
                _head=_head.getNextNode();
                tmp.setNextNode(null);
            }
        }
        else{
            tmp = _head.getNextNode();
            while(tmp!=null && (Integer)tmp.getData()!=(Integer)pData)
                tmp=tmp.getNextNode();
            if (tmp==null)
                return null;
            else{
                if (tmp.getNextNode()==null){
                    tmp.getPrevNode().setNextNode(null);
                    _tail=tmp.getPrevNode();
                    tmp.setPrevNode(null);
                }
                else {
                    tmp.getPrevNode().setNextNode(tmp.getNextNode());
                    tmp.getNextNode().setPrevNode(tmp.getPrevNode());
                    tmp.setNextNode(null);
                    tmp.setPrevNode(null);
                }
            }
        }
        return tmp;
    }
    public boolean find (G pData){
        Node tmp = _head;
        boolean condition = false;
        while(tmp!=null){
            if ((Integer)tmp.getData()!=(Integer)pData)
                tmp=tmp.getNextNode();
            else{
                condition=true;
                break;
            }
        }
        return condition;        
    }
    public void print (){
        Node tmp=_head;
        int i=0;
        while(tmp!=null){
            System.out.println("pos= "+(i++)+" dato = "+tmp.getData());
            tmp=tmp.getNextNode();
        }
    }
}