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
public class NodeKey <G> {
    
    private G pdata;
    private NodeKey _next;
    private NodeKey _prev;
    private Node url;
    private Node _num;
    
    
    public NodeKey(G pdata, NodeKey next,NodeKey prev, Node num){
    this.pdata=pdata;
    this._next=next;
    this._prev=prev;
    this._num=num;
    }
    /**
    *
    * @param _num
    */
public void setNumNode(Node _num){
    this._num=_num;
}
/**
* @return the _num
*/
public Node getNumNode() {
    return _num;
}
/**
* @return the pdata
*/
public G getData() {
    return pdata;
    }
/**
* @param pdata the pdata to set
*/
public void setData(G pdata) {
    this.pdata = pdata;
    }
/**
* @return the _next
*/
public NodeKey getNextNode() {
    return _next;
    }
/**
* @param _next the _next to set
*/
public void setNextNode(NodeKey _next) {
    this._next = _next;
    }
/**
* @return the _prev
*/
public NodeKey getPrevNode() {
    return _prev;
    }
/**
* @param _prev the _prev to set
*/
public void setPrevNode(NodeKey _prev) {
    this._prev = _prev;
    }
}