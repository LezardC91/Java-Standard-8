
package ar.com.eduit.curso.java.entities;

public class Cuenta {
    
    // Atributos
    private int nro;
    private String moneda;
    private float saldo;
    
    //Metodos

    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }
    
    public final void depositar(float monto){
        saldo+=monto;
    }
    
    public final void debitar(float monto){
        if(saldo>=monto) saldo-=monto;
        else System.out.println("No hay saldo suficiente.");
        }
    
    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public float getSaldo() {
        return saldo;
    }

}
