package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.ClienteEmpresa;
import ar.com.eduit.curso.java.entities.ClientePersona;
import ar.com.eduit.curso.java.entities.Cuenta;
import java.util.ArrayList;

public class TestRelaciones {

    public static void main(String[] args) {

        /*
        modificadores de visibilidad
        
        Modificador                 Alcance
        default(No ponemos)         El Miembro de la clase es visible desde
                                    la misma clase y desde clases 
                                    del mismo paquete.
        
        +public                     El Miembro es visible desde la misma clase
                                    y desde clases de cualquier paquete.
                                    
        -private                    El miembro es visible solo desde la misma 
                                    clase.
        
        *protected                  El miembro es visible desde la misma clase y
                                    desde las clases hijas y desde clases del 
                                    mismo paquete.
        */
        
        System.out.println("-- cuenta1 --");
        
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(50000);
        cuenta1.depositar(30000);
        cuenta1.debitar(20000);
        System.out.println(cuenta1);
        
        System.out.println("-- cuenta2 --");
        Cuenta cuenta2=new Cuenta(2, "arg$");
        cuenta2.depositar(40000);
        cuenta2.debitar(10000);
        System.out.println(cuenta2);
        
        System.out.println("-- clientePersona1 --");
        ClientePersona clientePersona1=new ClientePersona(1, "Ana", "Ledesma", 3);
        
        //Con creacion de variable de referencia
        Cuenta cuentaCliente =clientePersona1.getCuenta();
        cuentaCliente.depositar(15000);
        
        //Sin variable de referencia
        clientePersona1.getCuenta().depositar(20000);
        
        System.out.println(clientePersona1);
        
        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(1, "Todo Limpio SRL", "Lima 222");
                
                ArrayList<Cuenta> cuentas=clienteEmpresa1.getCuentas();
                //cuentas es la variable de referencia para "clienteEmpresa1.getCuentas()"
                cuentas.add(new Cuenta(10, "arg$"));
                cuentas.add(new Cuenta(11, "reales"));
                cuentas.add(new Cuenta(12, "U$D"));
                
                //los get llevan el 0, 1, 2, por ser el INDICE del ArrayList.
                cuentas.get(0).depositar(80000);
                cuentas.get(0).depositar(40000);
                cuentas.get(0).debitar(10000);
                
                cuentas.get(1).depositar(30000);
                
                cuentas.get(2).depositar(12000);
                     
                System.out.println(clienteEmpresa1);
                for (int a = 0; a < cuentas.size(); a++) {
                    System.out.println(cuentas.get(a));
        }
        
        
        
    }
}
