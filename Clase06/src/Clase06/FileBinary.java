
package Clase06;

public class FileBinary implements I_File{

    @Override
    public void setText(String text) 
    {
        System.out.println("Escribiendo archivo binario");
    }

    @Override
    public String getText() 
    {
        return "Leyendo archivo binario";
    }
    
}
