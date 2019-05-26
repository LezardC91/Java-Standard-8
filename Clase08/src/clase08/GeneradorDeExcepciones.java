package clase08;
public class GeneradorDeExcepciones {
    public static void generar(){
        int[] vector=new int[5];
        vector[20]=10;
    }
    public static void generar(boolean x){
    if(x) System.out.println(10/0);
    }
    public static void generar(String nro){
    Integer.parseInt(nro);
    }
    public static void generar(String texto, int pos){
        //if(texto==null || texto.length()<pos || pos<0) return;
        System.out.println(texto.charAt(pos));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
