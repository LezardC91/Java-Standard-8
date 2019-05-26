package ar.com.eduit.curso.java.entities;

import java.util.ArrayList;

public class ClienteEmpresa {
    
    //Atributos
    private int nro;
    private String razonSocial;
    private String direccion;
    private ArrayList<Cuenta> cuentas=new ArrayList();
    
    //Metodos

    public ClienteEmpresa(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "nro=" + nro + ", razonSocial=" + razonSocial + ", direccion=" + direccion + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
