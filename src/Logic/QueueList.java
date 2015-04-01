package Logic;

/**
 * Clase para manipular la cola.
 * @author Gerald M, Jairo O.
 */
public class QueueList <G>{
    private Node _head;
    private Node _tail;
    /**
     * Constructor de la clase
     * @param head. Primer elemento de la cola.
     * @param tail. Ultimo elemento de la cola.
     */
    public QueueList (Node head, Node tail){
        this._head=head;
        this._tail=tail;
    }
    /**
     * Metodo para encolar.
     * @param pData. Dato para encolar.
     */
    public void enqueue (G pData){
        if (_head == null)
            _head=_tail=new Node (pData, null, null);
        else{
            _tail.setNextNode(new Node (pData, null, _tail));
            _tail=_tail.getNextNode();
        }
    }
    /**
     * Metodo para desencolar
     * @return Nodo desencolado.
     */
    public Node dequeue (){
        if (_head == null)
            return null;
        else{
            Node tmp=_head;
            _head=_head.getNextNode();
            _head.setPrevNode(null);
            tmp.setNextNode(null);
            return tmp;
        }
    }
}