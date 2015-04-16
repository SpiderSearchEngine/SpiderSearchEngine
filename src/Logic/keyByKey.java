package Logic;

/**
 * Clase para sacar una palabra
 * @author Gerald M, Jairo O
 */
public class keyByKey <G>{
    private String dato;
    List lista=new List(null,null);
    //CircularList cir_lis=new CircularList(null);
    //Node nodo;
    //keys_referencias objeto_keyword=new keywords_referencia(nombre, null);
    /**
     * Lo que pasa aqui es que se va a hacer referencia a la clase Texto para 
     * obtener puramente el texto plano en html
     */
    
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
