package Logic;

/**
 * Clase para manipular la cola.
 * @author Gerald M, Jairo O.
 */
public class queueList <G>{
    private node _head;
    private node _tail;
    /**
     * Constructor de la clase
     * @param head. Primer elemento de la cola.
     * @param tail. Ultimo elemento de la cola.
     */
    public queueList (node head, node tail){
        this._head=head;
        this._tail=tail;
    }
    /**
     * Metodo para encolar.
     * @param pData. Dato para encolar.
     */
    public void enqueue (G pData){
        if (_head == null)
            _head=_tail=new node (pData, null, null);
        else{
            _tail.setNextNode(new node (pData, null, _tail));
            _tail=_tail.getNextNode();
        }
    }
    /**
     * Metodo para desencolar
     * @return Nodo desencolado.
     */
    public node dequeue (){
        if (_head == null)
            return null;
        else{
            node tmp=_head;
            _head=_head.getNextNode();
            _head.setPrevNode(null);
            tmp.setNextNode(null);
            return tmp;
        }
    }
    public node getHead(){
        return this._head;
    }
    public void print (){
        node tmp=_head;
        int i=0;
        while(tmp!=null){
            i=i+1;
            tmp=tmp.getNextNode();
        }
        System.out.println("links en cola: "+i);
    }
}