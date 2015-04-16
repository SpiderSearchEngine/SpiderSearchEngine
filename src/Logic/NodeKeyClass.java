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
public class NodeKeyClass <G> {
    private G pdata;
    private nodoClass _num;
    private NodeKeyClass _next;
    private NodeKeyClass _prev;
    
    public NodeKeyClass(G pdata,NodeKeyClass next,NodeKeyClass prev, nodoClass num){
        this.pdata=pdata;
        this._next=next;
        this._prev=prev;
        this._num=num;
        
    }
    /**
     * 
     * @param _num 
     */
    public void setNumNode(nodoClass _num){
        this._num=_num;
    }

    /**
     * @return the _num
     */
    public nodoClass getNumNode() {
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
    public NodeKeyClass getNextNode() {
        return _next;
    }

    /**
     * @param _next the _next to set
     */
    public void setNextNode(NodeKeyClass _next) {
        this._next = _next;
    }

    /**
     * @return the _prev
     */
    public NodeKeyClass getPrevNode() {
        return _prev;
    }

    /**
     * @param _prev the _prev to set
     */
    public void setPrevNode(NodeKeyClass _prev) {
        this._prev = _prev;
    }
    
    
}
