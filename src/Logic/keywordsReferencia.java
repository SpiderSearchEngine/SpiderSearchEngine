/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Logic.List;

/**
 *
 * @author Gerald M, Jairo O
 */
public class keywordsReferencia <G>{
    private G URL;
    private String name;
    private List lista;
    /**
     * Constructor de la clase
     * @param palabra
     * @param URL 
     */
    public keywordsReferencia(String palabra,G URL){
       
    }
    /**
     * Metodo que setear los URL's
     * @param URL 
     */
    public void setURL(G URL){
        this.URL=URL;
    }
    /**
     * Funcion para obtener los URL's
     * @return 
     */
    public G getURL(){
        return URL;
    }/**
     * Metodo para modificar nombre
     * @param palabra 
     */
    public void setname(String palabra){
        this.name=palabra;
    }
    /**
     * Funcion para la obtencion de nombre
     * @return 
     */
    public String getName(){
        return name;
    }
    
}
