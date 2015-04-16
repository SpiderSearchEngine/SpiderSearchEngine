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
public class nodoClass <G> {
    
    private G pdata;
    private nodoClass _next;
    private nodoClass _prev;
    /**
     * Constructor de la clase.
     * @param pdata. dato para  insertar.
     * @param next. Siguiente nodo.
     * @param prev. anterior nodo.
     */
    public nodoClass (G pdata, nodoClass next,  nodoClass prev){
        this.pdata=pdata;
        this._next=next;
        this._prev=prev;        
    }
    /**
     * Metodo para obtener el dato de un elemento.
     * @return elemento deseado.
     */
    public G getData (){
        return pdata;
    }
    /**
     * Metodo para obtener el siguiente nodo.
     * @return. siguiente nodo.
     */
    public nodoClass getNextNode (){
        return _next;
    }
    /**
     * Metodo para obtener el anterior nodo.
     * @return el nodo anterior
     */
    public nodoClass getPrevNode (){
        return _prev;
    }
    /**
     * Metodo para modificar el dato.
     * @param pdata. Dato para modificar.
     */
    public void setData (G pdata){
        this.pdata=pdata;
    }
    /**
     * Metodo para modificar el siguiente nodo
     * @param next. Siguiente nodo para modifcar.
     */
    public void setNextNode (nodoClass next){
        this._next=next;
    }
    /**
     * Metodo para modificar el nodo previo.
     * @param prev. Nodo previo
     */
    public void setPrevNode (nodoClass prev){
        this._prev=prev;
    }
}