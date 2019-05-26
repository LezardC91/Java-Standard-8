
package ar.com.eduit.curso.java.entities;

public class ClientePersona {
    
    //Atributos
    private int nro;
    private String nombre;
    private String direccion;
    private Cuenta cuenta;

    //Metodos

    public ClientePersona(int nro, String nombre, String direccion, int nroCuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta=new Cuenta(nroCuenta,"arg$");
    }

    @Override
    public String toString() {
        return "ClientePersona{" + "nro=" + nro + ", nombre=" + nombre + ", direccion=" + direccion + ", cuenta=" + cuenta + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

}
