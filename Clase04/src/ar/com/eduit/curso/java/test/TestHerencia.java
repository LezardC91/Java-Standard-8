
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.Cliente;
import ar.com.eduit.curso.java.entities.Cuenta;
import ar.com.eduit.curso.java.entities.Direccion;
import ar.com.eduit.curso.java.entities.Empleado;
import ar.com.eduit.curso.java.entities.Persona;
import com.sun.org.apache.bcel.internal.Repository;

public class TestHerencia {
    
    public static void main(String[] args) {
       
        System.out.println("-- direccion1 --");
        Direccion direccion1=new Direccion("Lavalle", 648, "8", "a", "CABA");
        System.out.println(direccion1);
        
        System.out.println("-- direccion2 --");
        Direccion direccion2=new Direccion("Lima", 222, "1", "d", "CABA");
        System.out.println(direccion2);
        
         /*
        System.out.println("-- persona1 --");    
        Persona persona1=new Persona("Javier", "Alvarez", 26, direccion1);
        System.out.println(persona1);
        persona1.saludar();
        
        System.out.println("-- persona2 --");
        Persona persona2=new Persona("Ana", "Godoy", 21, new Direccion("Viel",345,"1","a","CABA"));
        System.out.println(persona2);
        persona2.saludar();
        
        System.out.println("-- persona3--");
        Persona persona3=new Persona("Juan", "Mel", 22, direccion1);
        System.out.println(persona3);
        persona3.saludar();
        
        System.out.println("-- persona4--");
        Persona persona4=new Persona("Lia", "Garay", 45, persona2.getDireccion());
        System.out.println(persona4);
        persona4.saludar();
        persona4.setDireccion(direccion2);
        persona2.setDireccion(persona1.getDireccion());
        
        System.out.println("-- empleado1 --");
        Empleado empleado1=new Empleado(1, "Vendedor", 50000, "Susana", "Gallardo", 30, direccion2);
        empleado1.saludar();
        System.out.println(empleado1);
        empleado1.despedir();
        
        System.out.println("-- cliente1 --");
        Cliente cliente1=new Cliente(1, new Cuenta(1, "arg$"), "Karina", "Molina", 20, direccion2);
        cliente1.saludar();
        cliente1.getCuenta().depositar(50000);
        System.out.println(cliente1);
        cliente1.despedir();*/
        
        
        //Polimorfismo
        Persona p1=new Empleado(2, "Jefe", 80000, "Liliana", "Vargas", 40, direccion2);
        Persona p2=new Cliente(2, new Cuenta(2, "arg$"), "Sebastian", "Salas", 50, direccion2);
        
        p1.saludar();
        p2.saludar();
        
        //Se almacena en la clase Persona pero actua como empleado o un cliente
        //CASTEO
        
        
        
        
        //Ejemplo de casteo, no reconoce a p1 como Empleado y no lo castea
        //Empleado e1=(Empleado)p1;

        Empleado e2=(p1 instanceof Empleado)?(Empleado)p1:null;
        
        
        System.out.println(p1.getClass());
        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSimpleName());
        System.out.println(p1.getClass().getSuperclass().getName());
        System.out.println(p1.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(p1.getClass().getSuperclass().getSuperclass().getSuperclass());
        
        String texto="Hola";
        System.out.println(texto.getClass().getSuperclass().getName());
        
        
        //Pendiente para clase 6 Interfaces
        
        
    }
}
