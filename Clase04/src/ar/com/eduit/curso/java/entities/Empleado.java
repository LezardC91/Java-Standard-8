package ar.com.eduit.curso.java.entities;

public class Empleado extends Persona{
    
    //Atributos
    private int nroLegajo;
    private String puesto;
    private float sueldoBasico;
    
    //Metodos

    public Empleado(int nroLegajo, String puesto, float sueldoBasico, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion); // Atributos de la clase persona
        this.nroLegajo = nroLegajo;
        this.puesto = puesto;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola! Soy un Empleado!");
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "nroLegajo=" + nroLegajo + ", puesto=" + puesto + ", sueldoBasico=" + sueldoBasico + '}';
                //El super.toString() ademas muest5ra el metodo toString de la clase padre
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
/*
    @Override
    public void despedir()
    da error porque los metodos FINAL no pueden ser sobreescritos
    */

    
    
}
