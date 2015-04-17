package Logic;

/**
 * Clase para sacar una palabra
 * @author Gerald M, Jairo O
 */
public class keyByKey <G>{
    private String dato;
    list lista=new list(null,null);

    
    /**
     * Constructor de la clase
     * @param a_procesar 
     */
    public keyByKey(String a_procesar){
         this.dato=a_procesar;
    }

    /**
     * Une las palabra
     * @param args the command line arguments
     */
    
    public void procesar(){
        String nombre="";
        //keywords_referencia objeto_keyword;
        while(!dato.equals("")){
            Character chardato =dato.charAt(0);
            if(Character.toString(chardato).equals(" ")){
                if (nombre!="")
                    
                    System.out.print(nombre);
                dato=dato.substring(1,dato.length());
                nombre="";
            }
            else{
                nombre=nombre+chardato;
                dato=dato.substring(1,dato.length());
            }
        }
        
    }
}
