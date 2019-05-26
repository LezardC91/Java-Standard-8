
package ar.com.eduit.curso.java.entities;

public class Cliente extends Persona{
    
    //Atributos
    private int nroCliente;
    private Cuenta cuenta;
    
    
    //Metodos
    public Cliente(int nroCliente, Cuenta cuenta, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }

    @Override
    public void saludar() {
        System.out.println("Hopa! Soy un cliente");
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "nroCliente=" + nroCliente + ", cuenta=" + cuenta + '}';
    }

 
    
}
