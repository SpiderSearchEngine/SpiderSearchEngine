/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author jairo
 */
public class spiderEngine {
    private list _busqueda;
    private circularList cl = new circularList(null);
    private list l = new list(null,null);
    private queueList topBusqueda = new queueList(null, null);
    private queueList busquedasRecientes = new queueList(null, null);
    
    public spiderEngine(list busqueda){
        this._busqueda=busqueda;
    }
    public void buscar(list _busqueda){
        
    }
            
    public void optimizarDatos(){
        optimizarUrls();
        optimizarKeywords();
    }
    
    private void optimizarUrls(){
        
    }
    
    private void optimizarKeywords(){
        
    }
}
