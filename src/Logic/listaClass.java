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
public class listaClass <G> {
    private nodoClass _head;
    private nodoClass _tail;
    /**
     * Constructor de la clase.
     * @param _head. Primer elemento de la lista.
     * @param _tail. Ultimo elemento de la lista.
     */
    public listaClass (nodoClass _head, nodoClass _tail){
        this._head=_head;
        this._tail=_tail;
    }
    /**
     * Metodo para obtener el head de la lista.
     * @return el nodo head.
     */
    public nodoClass getHead (){
        return this._head;
    }
    /**
     * Metodo para obtener el tail de la lista.
     * @return el nodo tail
     */
    public nodoClass getTail (){
        return this._tail;
    }
    /**
     * Metodo para modificar el head de la lista.
     * @param head. Nuevo valor del head.
     */
    public void setHead(nodoClass head){
        this._head=head;
    }
    /**
     * Metodo para modificar el tail de la lista.
     * @param tail. Nuevo valor del tail.
     */
    public void setTail(nodoClass tail){
        this._tail=tail;
    }
    /**
     * Metodo para insertar por el head en la lista.
     * @param pData. Dato a insertar.
     */
    /**public void insertHead(G pData){
        if (_head==null){
            _head=(new nodoClass (pData, _head, _tail));
            _tail=_head;
        }
        else{
            _head=(new nodoClass (pData, _head, null));
            _head.getNextNode().setPrevNode(_head);
        }       
    }*/
    public void insertHead(G pData){
        if (_head==null){
            _head=(new nodoClass (pData, _head, _tail));
            _tail=_head;
        }
        else{
            if (find(pData)){
                System.out.println("");
            }else{
            /*
            
            */
                _head=(new nodoClass (pData, _head, null));
                _head.getNextNode().setPrevNode(_head);}
            
        }       
    }
    /**
     * Metodo para insertar por el tail en la lista.
     * @param pData. Dato a insertar.
     */
    public void insertTail (String pData){
        if(_head==null){
            _head= new nodoClass(pData, _head, _tail);
            _tail=_head;
        }
        else{
            nodoClass tmp = _head;
            while(tmp.getNextNode()!=null)
                tmp=tmp.getNextNode();
            tmp.setNextNode(new nodoClass(pData, null, tmp));
            _tail=tmp.getNextNode();
        }
    }
    /**
     * Metodo para verificar si esta un elemento especifico en la lista.
     * @param pData. Dato a verificar.
     * @return valor booleano (true, si esta; false, en caso contrario).
     */
    /**public boolean find (G pData){
        nodoClass tmp = _head;
        boolean condition = false;
        while(tmp!=null){
            if ((String)tmp.getData()!=(String)pData)
                tmp=tmp.getNextNode();
            else{
                condition=true;
                break;
            }
        }
        return condition;
     * @param pData}
     * @return */
    public boolean find (G pData){
        System.out.println("hea::::"+_head);
        nodoClass tmp = _head;
        System.out.println("tem::::"+tmp);
        boolean condition = false;
        
        while(tmp!=null){
            G pD=pData;
            //System.out.println("Ingresa: "+pData);
            //System.out.println("Almacenado: "+tmp.getData());
            if (!(pD.equals((G)(tmp.getData())))){
                //System.out.println("Ingresa: "+pD);
                tmp=tmp.getNextNode();
                //System.out.println("QQ/qq");
            }
            else{
                condition=true;
                System.out.println("                                                Ingresa: "+pD);
                break;
            }
        }
        return condition;        
    }
    /**
     * Metodo para imprimir la lista.
     */
    
    public void print (){
        nodoClass tmp=_head;
        WordsClass ejemplo=new WordsClass(null,null);
        int i=0;
        while(tmp!=_head){
            
            System.out.println("pos= "+(i++)+" dato = "+((WordsClass)tmp.getData()).getWord());
            tmp=tmp.getNextNode();
        }
        System.out.println("pos= "+(i++)+" dato = "+((WordsClass)tmp.getData()).getWord());
    }
}
