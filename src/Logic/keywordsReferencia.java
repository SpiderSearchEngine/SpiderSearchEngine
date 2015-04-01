/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Logic.List;

/**
 *
 * @author gerald and jairo
 */
public class keywordsReferencia <G>{
    private G URL;
    private String name;
    private List lista;
    /**
     * 
     * @param palabra
     * @param URL 
     */
    public keywordsReferencia(String palabra,G URL){
       
    }
    /**
     * 
     * @param URL 
     */
    public void setURL(G URL){
        this.URL=URL;
    }
    /**
     * 
     * @return 
     */
    public G getURL(){
        return URL;
    }/**
     * 
     * @param palabra 
     */
    public void setname(String palabra){
        this.name=palabra;
    }
    /**
     * 
     * @return 
     */
    public String getName(){
        return name;
    }
    
}
