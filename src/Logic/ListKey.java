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
public class ListKey  <G>{
    private NodeKey _head;
    private NodeKey _tail;
    /**
     * Constructor de la clase.
     * @param _head. Primer elemento de la lista.
     * @param _tail. Ultimo elemento de la lista.
     */
    public ListKey (NodeKey _head, NodeKey _tail){
        this._head=_head;
        this._tail=_tail;
    }
    /**
     * Metodo para obtener el head de la lista.
     * @return el nodo head.
     */
    public NodeKey getHead (){
        return this._head;
    }
    /**
     * Metodo para obtener el tail de la lista.
     * @return el nodo tail
     */
    public NodeKey getTail (){
        return this._tail;
    }
    /**
     * Metodo para modificar el head de la lista.
     * @param head. Nuevo valor del head.
     */
    public void setHead(NodeKey head){
        this._head=head;
    }
    /**
     * Metodo para modificar el tail de la lista.
     * @param tail. Nuevo valor del tail.
     */
    public void setTail(NodeKey tail){
        this._tail=tail;
    }
    /**
     * Metodo para insertar por el head en la lista.
     * @param pData. Dato a insertar.
     */
    public void insertHead(G pData){
        if (_head==null){
            _head=(new NodeKey (pData, _head, _tail, null ));
            _tail=_head;
        }
        else{
            _head=(new NodeKey (pData, _head, null, null));
            _head.getNextNode().setPrevNode(_head);
        }       
    }
    /**
     * Metodo para insertar por el tail en la lista.
     * @param pData. Dato a insertar.
     */
    public void insertTail (G pData){
        if(_head==null){
            _head= new NodeKey(pData, _head, _tail, null);
            _tail=_head;
        }
        else{
            NodeKey tmp = _head;
            while(tmp.getNextNode()!=null)
                tmp=tmp.getNextNode();
            tmp.setNextNode(new NodeKey(pData, null, tmp, null));
            _tail=tmp.getNextNode();
        }
    }/**
     * Metodo para eliminar un dato de la lista.
     * @param pData. Dato a eliminar.
     * @return nodo eliminado.
     */
    public NodeKey delete (G pData){
        NodeKey tmp = null;
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
    /**
     * Metodo para verificar si esta un elemento especifico en la lista.
     * @param pData. Dato a verificar.
     * @return valor booleano (true, si esta; false, en caso contrario).
     */
    public boolean find (G pData){
        NodeKey tmp = _head;
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
    /**
     * Metodo para imprimir la lista.
     */
    public void print (){
        NodeKey tmp=_head;
        int i=0;
        while(tmp!=null){
            System.out.println("pos= "+(i++)+" dato = "+tmp.getData());
            tmp=tmp.getNextNode();
        }
    }
}
