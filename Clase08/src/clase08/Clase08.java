package clase08;

import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase08 {
    public static void main(String[] args) {
        // Clase 08 Manejo de excepciones
        //System.out.println(10/0);
        //System.out.println("Esta linea no se ejecuta.");
        
        /*
        Estructura Try Catch Finally
        try {
            -Colocar las sentencias que pueden arrojar un error Excepcion)
            -Estas sentencias tienen mas costo de Hardware
        }catch(Exception e){
            -Si no hubo error el bloque catch no se ejecuta
            -Estas sentencias se ejecutan en caso de exception
            -Se recibe como parametro un objeto de Exception (e)
        }Finally{
            -Si se ejecuta sin error va directamente al Finally
            -Este bloque se ejecuta siempre, haya o no Exception
            -Los objetos creados en try, o catch, no son accesibles
             Desde el bloque Finally. Son destruidos
            -Este bloque es opcional
        }
        Estas lineas se ejecutan siempre
        El progrma sigue normalmente
        */
        /*
        try{
            System.out.println(10/0);
            System.out.println("Esta sentencia no se ejecuta");
        }catch(Exception e){
            System.out.println("Ocurrio un error");
            System.out.println(e);
        }finally{
            System.out.println("El programa finaliza normalmente");
        }
        */
        /*
        try {
            //GeneradorDeExcepciones.generar();
            //GeneradorDeExcepciones.generar(true);
            //GeneradorDeExcepciones.generar("22x");
            //GeneradorDeExcepciones.generar(null, 10);
            GeneradorDeExcepciones.generar("hola", 10);
        } catch (Exception e) {
            System.out.println(e);
            //e.printStackTrace();
        }
        System.out.println("El programa termina normalmente");
        */
        
        
        
        
        
        //Captura Personalizada de excepciones
        
        try {
            //FileReader in = new FileReader(new File("Texto.txt"));              
            //System.exit(20); Error de JVM, Imposible de capturar
            //GeneradorDeExcepciones.generar(true);
            //GeneradorDeExcepciones.generar("22x");
            //GeneradorDeExcepciones.generar(null, 4);
            //GeneradorDeExcepciones.generar("hola", 20);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango");
        } catch (ArithmeticException e){
            System.out.println("Error al Dividir /0");
        } catch (NumberFormatException e){
            System.out.println("Formato de numero incorrecto");
        } catch(NullPointerException e){
            System.out.println("Puntero nulo");
        } catch (Exception e){
            System.out.println("Ocurrio un error no esperado");
        }
        
        //Uso de excepciones para validad reglas de negocio
        
        
        Vuelo v1=new Vuelo("AER1234", 100);
        Vuelo v2=new Vuelo("Latan111", 100);
        try {
            v1.venderPasajes(40);
            //v1.venderPasajes(-4);
            v2.venderPasajes(20);
            v1.venderPasajes(50);
            v2.venderPasajes(30);
            v1.venderPasajes(30); //lanza Excepcion
            v2.venderPasajes(10); //esta venta no se realiza 
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        } catch (IllegalArgumentException ex) {
            System.out.println("La cantidad de pasajes debe ser mayor a 0");
        }
        
        //try with resourses JDK 7+
        
        //Interface Closeable
        
        try (FileReader read=new FileReader(new File("texto.txt"))) {
            //Sentencias que leen el archivo
            //la interface Closeable se encarga de cerrar el objeto ocurra
            //excepcion o no
            //read.close(); //este metodo se va a ejecutar dos veces
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
