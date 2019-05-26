
package Clase06;

public class FileText implements I_File{

    @Override
    public void setText(String text) 
    {
        System.out.println("Escribiendo archivo de texto");
    }

    @Override
    public String getText() 
    {
        return("Leyendo archivo de texto");
    }
    
}
