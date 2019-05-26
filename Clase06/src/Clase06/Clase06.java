package Clase06;

import java.util.Scanner;

public class Clase06  {

    public static void main(String[] args) throws Exception {
        
        //Uso de interface
        
        I_File archivo=null; //Referencia a la interface
        
        //archivo=new FileText();
        //archivo=new FileBinary();
        
        System.out.println("Ingrese 'FileText' o 'FileBinary': ");
        String ingreso=new Scanner(System.in).next();
        
        //if (ingreso.equalsIgnoreCase("FileText"))   archivo=new FileText();
        //if (ingreso.equalsIgnoreCase("FileBinary")) archivo=new FileBinary();
        
        //Crea un objeto de un String
        archivo=(I_File)Class.forName("Clase06."+ingreso).newInstance();
        
        
        //aplicacion
        archivo.setText("texto");
        System.out.println(archivo.getText());
        archivo.info();
        
    }
    
}
