package Logic;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * Clase para realizar el spiderBot.
 * @author Jairo O, Gerald M.
 */
public class spiderBot {
    
    private queueList cola = new queueList(null, null);
    private listKey lk = new listKey(null, null);
    private list l = new list(null, null);
    private circularList cl = new circularList(null);
    private boolean permiso = false;
    private String _url; 
    private int _maxthreads;
    private int _maxprofundidad;
    private int _reindex;
    
    /**
     * Constructor de la clase
     */
    public spiderBot(){
    }
    
    public synchronized void generarCola (String url, int indice, int numAsoc) throws ParserConfigurationException, SAXException, IOException{
        while(permiso==true){
            try{
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        leerxml lxml =new leerxml();
        for (int i=indice; i<=19; i+=2){
            cola.enqueue(new url (lxml.leer(url, i), numAsoc));
        }
        permiso=true;
        notify();
    }
    /**
     * Metodo para obtener los datos de un xml, en este caso,el de "targets".
     * @param url. Direccion del xml.
     * @param indice. Numero asociado a la pagina.
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException 
     */
    public synchronized void obtenerDatos() throws IOException{
        
        while(permiso==false){
            try{
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        permiso=false;
        stackList pilaUrl = new stackList (null);        
        stackList pilaTexto = new stackList (null);        
        procesarURLS procUrl = new procesarURLS(); 
        formatoTexto ft = new formatoTexto();
        
        url URL = ((url)(cola.dequeue().getData()));
        if (cl.getHead()!=null && cl.find((String)URL.getDireccion())==true){
            node tmp=cl.getHead();
            while(!((urlProcesado)(tmp.getData())).getDireccion().equals(URL.getDireccion()))
                tmp=tmp.getNextNode();
            ((urlProcesado)(tmp.getData())).setReferencia(((urlProcesado)(tmp.getData())).getReferencia()+1);
        }
        else{
        pilaUrl=procUrl.procesar(URL);
        
        while (pilaUrl.top()!=null)
            cola.enqueue((url)pilaUrl.pop().getData());
        cl.insertHead(new urlProcesado(URL.getDireccion(), 0));
        pilaTexto=ft.eliminarLinks(((urlProcesado)cl.getHead().getData()).getDireccion());
                
        while(pilaTexto.top()!=null){
            if (l.findSpecial((String)pilaTexto.top().getData())==false){
                l.insertHead(new palabra ((String)pilaTexto.pop().getData(), lk));
                ((palabra)l.getHead().getData()).insertar(cl.getHead());
                ((palabra)(l.getHead().getData())).getListaReferencia().getHead().setNumNode(new node(0, null, null));
            }
            else{
                node tmp= l.getHead();
                while(((palabra)tmp.getData()).getName()!=(String)pilaTexto.top().getData())
                    tmp=tmp.getNextNode();
                if (((palabra)tmp.getData()).getListaReferencia().find(((urlProcesado)(cl.getHead().getData())).getDireccion())==true){
                    nodeKey tmp2 = ((palabra)tmp.getData()).getListaReferencia().getHead();
                    while (tmp2.getData()!=((urlProcesado)(cl.getHead().getData())).getDireccion())
                        tmp2=tmp2.getNextNode();
                    tmp2.getNumNode().setData((Integer)tmp2.getNumNode().getData()+1);
                }
                else{
                    ((palabra)(tmp.getData())).getListaReferencia().insertHead(((urlProcesado)(cl.getHead().getData())).getDireccion());
                    ((palabra)(tmp.getData())).getListaReferencia().getHead().setNumNode(new node(0, null, null));
                }
            }
        }
        }
        permiso=true;
        notify();
    }
    public void generarIndice(){
        /**
        
    public void hacerXmlIndice1(circularList cirList) throws Exception{
        cirList.print();
        createXmlForUrlProcess cfup=new createXmlForUrlProcess();
        node tmp= cirList.getHead();
        ArrayList key = new ArrayList();
        ArrayList Url = new ArrayList();
        ArrayList UrlsProcesadas = new ArrayList();
        key.add("w");
        Url.add("w");
        UrlsProcesadas.add(tmp.getData());
        while (tmp.getNextNode()!=cirList.getHead()){
            key.add(" ");
            Url.add(" ");
            UrlsProcesadas.add(tmp.getData());
            cfup.generate("indice1", key,Url,UrlsProcesadas);
            System.out.println(tmp.getData());
            tmp=tmp.getNextNode();
            tmp=tmp.getNextNode();
            if (tmp.getNextNode()==cirList.getHead()){
                key.add(" ");
                Url.add(" ");
                UrlsProcesadas.add(tmp.getData());
                cfup.generate("indice1", key,Url,UrlsProcesadas);
            }
        }
        cfup.generate("indice1", key,Url,UrlsProcesadas);
    }
    public void hacerXmlIndice2(list doubleList) throws Exception{
        doubleList.print();
        System.out.println("Ya se metio donde yo queria: ");
        createXmlForKeywords cfkw=new createXmlForKeywords();
        node tmp= doubleList.getHead();
        nodeKey tmp2= ((palabra)(doubleList.getHead().getData())).getListaReferencia().getHead();
        ArrayList key = new ArrayList();
        ArrayList links = new ArrayList();
        ArrayList palabras = new ArrayList();
        //key.add(" ");
        //links.add(" ");
        //palabras.add(((palabra)tmp.getData()).getName());
        while (tmp.getNextNode()!=null){
            key.add(" ");
            while (tmp2.getNextNode()!=null){
                links.add(((urlProcesado)(((node)(tmp2.getData())).getData())).getDireccion()+" , "+((urlProcesado)(((node)(tmp2.getData())).getData())).getReferencia());
                tmp2=tmp2.getNextNode();
            }
           links.add(((urlProcesado)(((node)(tmp2.getData())).getData())).getDireccion()+" , "+((urlProcesado)(((node)(tmp2.getData())).getData())).getReferencia());
            palabras.add(((palabra)tmp.getData()).getName());        
            cfkw.generate("indice2", key,links,palabras);
            System.out.println(tmp.getData());
            tmp=tmp.getNextNode();
        }
        key.add(" ");
        while (tmp2.getNextNode()!=null){
            links.add(((urlProcesado)(((node)(tmp2.getData())).getData())).getDireccion()+" , "+((urlProcesado)(((node)(tmp2.getData())).getData())).getReferencia());
            tmp2=tmp2.getNextNode();
        }
        links.add(((urlProcesado)(((node)(tmp2.getData())).getData())).getDireccion()+" , "+((urlProcesado)(((node)(tmp2.getData())).getData())).getReferencia());
        palabras.add(((palabra)tmp.getData()).getName());
        cfkw.generate("indice2", key,links,palabras);
    
        
    }*/
        
    }
}