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
public class obtimizador {
    private list _l;
    private circularList _cl = new circularList(null);
        
    public obtimizador(){
    }
    /**
     * @return the _l
     */
    public list getL() {
        return _l;
    }

    /**
     * @param _l the _l to set
     */
    public void setL(list _l) {
        this._l = _l;
    }
    /**
     * @return the cl
     */
    public circularList getCl() {
        return _cl;
    }

    /**
     * @param cl the cl to set
     */
    public void setCl(circularList cl) {
        this._cl = cl;
    }
    public void Obtimiza(circularList cl, list l){
        node tmp= cl.getHead();
        while(tmp.getNextNode()!=cl.getHead()){
            _cl.insertHead(new paginas(((urlProcesado)(tmp.getData())).getDireccion(),((urlProcesado)(tmp.getData())).getReferencia(),1000));
            
            tmp=tmp.getNextNode();
            
        }
        _cl.insertHead(new paginas(((urlProcesado)(tmp.getData())).getDireccion(),((urlProcesado)(tmp.getData())).getReferencia(),1000));
        
    }
}
