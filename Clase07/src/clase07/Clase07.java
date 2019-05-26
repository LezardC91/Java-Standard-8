
package clase07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Clase07 {

    public static void main(String[] args) {
        //Clase 07 Collections
        
        Auto[] autos=new Auto[4];
        autos[0]=new Auto("Fiat", "Duna", "Blanco");
        autos[1]=new Auto("Chevrolet", "400", "Azul");
        autos[2]=new Auto("Volkswagen", "Golf", "Bordo");
        autos[3]=new Auto("Ford", "Fiesta", "Negro"); 
               
        //recorrido por4 indices        
        //for (int a = 0; a < autos.length; a++) {
        //    System.out.println(autos[a]);}
        
        //For Each
        for (Auto auto : autos)System.out.println(auto);
        
        //Interface List
        List lista=new ArrayList();
        lista.add(new Auto("Renault", "Kangoo", "Bordo"));
        lista.add(new Auto("Fiat", "500", "Verde"));
        lista.add("hola");
        lista.add(23);
        //remove, borra el indice que se le indica
        lista.remove(3);
        
        //copiar
        //for (Auto a : autos) lista.add(a);
        System.out.println("*************************************************************");
        
        //for (Object object : lista)System.out.println(object); 
        //METODO DEFAULT FOREACH a partir de JAVA 8
        
        //Para varias sentencias usar este
        //lista.forEach(item->{
        //    System.out.println(item);
        //});
        
        
        //Para una sola usar este
        lista.forEach(System.out::println); //Variacion Lambda
        
        //uso de Generics<> Java 5
        List<Auto>lista2=new LinkedList();
        lista2.add(new Auto("Renault", "12", "Amarillo"));
        lista2.add(new Auto("Peugeot", "504", "Negro"));
        lista2.add(new Auto("Fiat", "600", "Rojo"));
        
        Auto auto1=(Auto) lista.get(0);
        Auto auto2=lista2.get(0);
        
        //copiar los autos de lista a lista2
        lista.forEach(item->{
            if (item instanceof Auto) lista2.add((Auto)item);
        });
        
        System.out.println("***********************************************************");
        lista2.forEach(System.out::println);
        
        
        /*
         *------------------------------------------------------------------------------- 
         */
        
        //SET (CONJUNTO)
        Set<String> set;
        
        /*
        implementacion HashSet
        -Es la mas veloz de todas, y no garantiza el orden de los elementos
        */
        
        set=new HashSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
        System.out.println("**** HashSet Sin Orden Garantizado ****");
        set.forEach(System.out::println);

        //LinkedHashSet
        //Almacena en una lista enlazada por orden de ingreso
                
        set=new LinkedHashSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
        System.out.println("**** LinbkedHashSet Orden Garantizado segun ingresa****");
        set.forEach(System.out::println);
        
        //TreeSet
        //Almacena en un arbol por orden natural )Por orden de codigo Hash
        
        set=new TreeSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Sabado");
        set.add("Domingo");
        System.out.println("**** TreeSet Orden por codigo Hash ****");
        System.out.println("**** EN este caso alfabeticamente por ser String ****");
        set.forEach(System.out::println);
        
        Set<Auto>setAutos=new TreeSet();
        setAutos.addAll(lista2);
        setAutos.add(new Auto("Renault", "Kangoo", "Bordo"));
        System.out.println("****************************************");
        setAutos.forEach(System.out::println);
        setAutos.forEach(item->System.out.println(item+"\t"+item.hashCode()));
        
        //pilas clase Stack (LIFO) Last In First Out
        Stack<Auto>pila=new Stack();
        pila.push(new Auto("Ford", "Fiesta", "Amarillo"));
        //El metodo push() apila un elemento.
        
        pila.addAll(lista2);
        
        System.out.println("**********************************************");
        pila.forEach(System.out::println);
        while(!pila.isEmpty()){
            pila.pop();
            //Metodo pop desapila el ultimo elemento y lo devuelve
        }
        
        System.out.println("Longitud de pila: "+pila.size());
        
        //Clase ArrayDeque Cola (FIFO) First In First Out
        ArrayDeque<Auto>cola=new ArrayDeque();
        cola.offer(new Auto("Mercedez", "Clase C", "Azul"));
        //Metodo .offer() Encila un elemento al final de la lista
        cola.addAll(lista2);
        System.out.println("***********************************");
        cola.forEach(System.out::println);
    System.out.println("Longitud de la Cola: "+cola.size());
    while(!cola.isEmpty()){
        System.out.println(cola.poll());
        //poll desencola un elemento
    }
    System.out.println("Longitud de la Cola: "+cola.size());    
        
    //Ejemplo de API Stream    
    //select * from lista2 where color = 'Rojo';
    lista2.stream()
            .filter(a->a.getColor()
            .equalsIgnoreCase("rojo"))
            .forEach(System.out::println);
        
        
    //select * from lista2 where marcalike'%f%' or color='negro0;    
        
    lista2.stream().filter(a->a.getMarca().toLowerCase().contains("f")
            || a.getColor().equalsIgnoreCase("Negro"))
            .forEach(System.out::println);
    
     //Interface Map
     //Permite representar un vector asociativo del tipo llave valor
     Map<String,String>mapaSemana;
     
     //Implementacion HashMap: Es la mas veloz, no hay garantia del orden
     mapaSemana=new HashMap();
     mapaSemana.put("lu", "Lunes");
     mapaSemana.put("ma", "Martes");
     mapaSemana.put("mi", "Miercoles");
     mapaSemana.put("ju", "Jueves");
     mapaSemana.put("vi", "Viernes");
     
     //   System.out.println(mapaSemana.get("lu"));
        System.out.println("*********************************");   
        mapaSemana.forEach((k,v)->System.out.println(k+" "+v));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
              
        
    }
    
}
