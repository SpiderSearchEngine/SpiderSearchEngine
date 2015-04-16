/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Gerald M, Jairo O.
 */
public class WordsClass <G>{
    private G ListaUrl;
    private String Word;
    
    public WordsClass(String Word,G ListaURL){
        this.ListaUrl=null;
        this.Word=Word;
    }
    public void setWord(String Word){
        this.Word=Word;
    }
    public void setUrl(G Url){
        this.ListaUrl=Url;
    }
    public String getWord(){
        return Word;
    }
    public G getUrl(){
        return ListaUrl;
    }
}
