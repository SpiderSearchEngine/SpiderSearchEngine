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
public class nodeKey <G> {
    
    private G pdata;
    private nodeKey _next;
    private nodeKey _prev;
    private node _num;
    
    
    public nodeKey(G pdata, nodeKey next,nodeKey prev, node num){
    this.pdata=pdata;
    this._next=next;
    this._prev=prev;
    this._num=num;
    }
    /**
    *
    * @param _num
    */
public void setNumNode(node _num){
    this._num=_num;
}
/**
* @return the _num
*/
public node getNumNode() {
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
public nodeKey getNextNode() {
    return _next;
    }
/**
* @param _next the _next to set
*/
public void setNextNode(nodeKey _next) {
    this._next = _next;
    }
/**
* @return the _prev
*/
public nodeKey getPrevNode() {
    return _prev;
    }
/**
* @param _prev the _prev to set
*/
public void setPrevNode(nodeKey _prev) {
    this._prev = _prev;
    }
}