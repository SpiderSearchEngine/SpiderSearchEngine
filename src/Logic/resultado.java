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
public class resultado {
    
    private String url;
    private double pageRank;
    private int dos=2;
    private double medio=0.5;
    
    public resultado(String name){
        this.url=name;
    }
    public String getUrl(){
        return this.url;
    }
    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * @return the pageRank
     */
    public double getPageRank() {
        return pageRank;
    }

    public void calcularPageRank (int trustworhy, int cantidadPalabras,
            int cantidadRepeticiones, int contadorReferencias){
        pageRank=trustworhy+cantidadPalabras*dos+cantidadRepeticiones*medio+contadorReferencias;
    }
    
}
