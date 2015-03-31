

package Logic;

/**
 * Clase para crear los nodos.
 * @author Jairo O, Gerald M.
 */
public class Node <G>{
    private G pdata;
    private Node _next;
    private Node _prev;
    /**
     * Constructor de la clase.
     * @param pdata. dato para  insertar.
     * @param next. Siguiente nodo.
     * @param prev. anterior nodo.
     */
    public Node (G pdata, Node next,  Node prev){
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
    public Node getNextNode (){
        return _next;
    }
    /**
     * Metodo para obtener el anterior nodo.
     * @return el nodo anterior
     */
    public Node getPrevNode (){
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
    public void setNextNode (Node next){
        this._next=next;
    }
    /**
     * Metodo para modificar el nodo previo.
     * @param prev. Nodo previo
     */
    public void setPrevNode (Node prev){
        this._prev=prev;
    }
}