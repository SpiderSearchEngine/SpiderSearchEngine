package Logic;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * Clase para realizar el spiderBot.
 * @author Jairo O, Gerald M.
 */
public class spiderBot {
    
    private String _url; 
    private int _maxthreads;
    private int _maxprofundidad;
    private int _reindex;   
    /**
     * Constructor de la clase
     */
    public spiderBot(){
    }
    /**
     * Metodo para obtener los datos de un xml, en este caso,el de "targets".
     * @param url. Direccion del xml.
     * @param indice. Numero asociado a la pagina.
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException 
     */
    public void obtenerurl(String url, int indice, int numAsoc) throws ParserConfigurationException, SAXException, IOException{
        leerxml lxml =new leerxml();
        queueList cola = new queueList(null, null);
        stackList pilaUrl = new stackList (null);        
        stackList pilaTexto = new stackList (null);        
        procesarURLS procUrl = new procesarURLS();        
        list l = new list(null, null);
        circularList cl = new circularList(null);
        formatoTexto ft = new formatoTexto();
        listKey lk = new listKey(null, null);
        
        for (int i=indice; i<=19; i+=2){
            cola.enqueue(new url (lxml.leer(url, i), numAsoc));
        }        
        
        url URL = ((url)(cola.dequeue().getData()));
        pilaUrl=procUrl.procesar(URL);
        
        while (pilaUrl.top()!=null)
            cola.enqueue((url)pilaUrl.pop().getData());
        
        cl.insertHead(URL.getDireccion());
        
        pilaTexto=ft.eliminarLinks((String)cl.getHead().getData());
        
        while(pilaTexto.top()!=null){
            if (l.find((String)pilaTexto.top().getData())==false){
                l.insertHead(new palabra ((String)pilaTexto.pop().getData(), cl.getHead()));
                ((palabra)(l.getHead().getData())).getListaReferencia().getHead().getNumNode().setData(0);
            }
            else{
                node tmp= l.getHead();
                while(((palabra)tmp.getData()).getName()!=(String)pilaTexto.top().getData())
                    tmp=tmp.getNextNode();
                if (((palabra)tmp.getData()).getListaReferencia().find((String)cl.getHead().getData())==true){
                    nodeKey tmp2 = ((palabra)tmp.getData()).getListaReferencia().getHead();
                    while (tmp2.getData()!=(String)cl.getHead().getData())
                        tmp2=tmp2.getNextNode();
                    tmp2.getNumNode().setData((Integer)tmp2.getNumNode().getData()+1);
                }
                else{
                    node tmp3= l.getHead();
                    while(((palabra)tmp3.getData()).getName()!=(String)pilaTexto.top().getData())
                        tmp3=tmp3.getNextNode();
                    ((palabra)(tmp3.getData())).getListaReferencia().insertHead((String)cl.getHead().getData());
                    ((palabra)(tmp3.getData())).getListaReferencia().getHead().getNumNode().setData(0);
                }
            }
        }
    }
}