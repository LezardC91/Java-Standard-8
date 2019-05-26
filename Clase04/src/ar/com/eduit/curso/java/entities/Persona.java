
package ar.com.eduit.curso.java.entities;

public abstract class Persona {
    
    /*
    Abstract es una clase de la cual no se puede instanciar objetos
    */
    
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;
    
    //Metodo
    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    /*
    public void saludar(){
        System.out.println("Hola soy una persona");
    }
    */
    public abstract void saludar();
        /*
        Es un metodo que solo puede estar en una clase astrcta.
        Es un metodo que no tiene codigo y debe ser redefinido 
        en las clases hijas.
        */
    public final void despedir(){
        System.out.println("Chau a todos");
        /*
        Un metodo final es un metodo que no se puede 
        sobreescribir en ninguna de sus clases hijas.
        */
    }
}
