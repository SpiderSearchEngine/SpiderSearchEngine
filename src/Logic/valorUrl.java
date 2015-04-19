/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

import java.util.StringTokenizer;

/**
 *
 * @author jairo
 */
public class valorUrl {
    private list lKeywords;
    private String dato;
    
    public valorUrl( String busqueda, list lista){
        this.lKeywords=lista;
        this.dato=busqueda;
    }
    public int cantidadPalabras (){
        int cant=0;
        StringTokenizer st = new StringTokenizer(dato);
        while (st.hasMoreTokens()) {
            dato=st.nextToken();
            if (lKeywords.findSpecial(dato))
                cant=cant+1;
        }
        return cant;
    }
    public int cantidadReferencias(String url){
        int cant=0;
        nodeKey tmp= ((palabra)(lKeywords.getHead().getData())).getListaReferencia().getHead();
        while(((urlProcesado)(((node)(tmp.getData())).getData())).getDireccion()!=url)
            tmp=tmp.getNextNode();
        cant=((urlProcesado)(((node)(tmp.getData())).getData())).getReferencia();
        return cant;
    }
    public int cantidadRepeticiones(String url){
        int cant=0;
        nodeKey tmp= ((palabra)(lKeywords.getHead().getData())).getListaReferencia().getHead();
        while(((urlProcesado)(((node)(tmp.getData())).getData())).getDireccion()!=url)
            tmp=tmp.getNextNode();
        cant=(Integer)tmp.getNumNode().getData();
        return cant;
    }
}
