

package Logic;

/**
 *
 * @author jairo
 */
public class Node <G>{
    private G pdata;
    private Node _next;
    private Node _prev;
    
    public Node (G pdata, Node next,  Node prev){
        this.pdata=pdata;
        this._next=next;
        this._prev=prev;        
    }
    public G getData (){
        return pdata;
    }
    public Node getNextNode (){
        return _next;
    }
    public Node getPrevNode (){
        return _prev;
    }
    public void setData (G pdata){
        this.pdata=pdata;
    }
    public void setNextNode (Node next){
        this._next=next;
    }
    public void setPrevNode (Node prev){
        this._prev=prev;
    }
}