
package Clase06;

public interface I_File {
    
    /*
    -En la interface no se declaran atributos ni metodos constructores.
    
    -Una interface contiene constantes o metodos abstractos.
    
    -Todos los mienbros de una interface son publicos
    
    -Un metodo abstracto no tienbe codigo, la clase que implementa la 
     interface agrega el codigo al metodo.
    
    -Una clase puede implementar todas las interfaces que necesite.
    
    -No se pueden crear objetos de una interface 
    
    -Se puede hacer polimorfismo por interface.
    
    La Javadoc es heredada a todas las implementaciones
    
    */
    
    /**
     * Este metodo escribe en el archivo
     * @param text texto a escribr
     */
    void setText(String text);
    String getText();
    
    /*
    Metodos default: Estos metodos existen desde Java 8
        Son metodos que tienen codigo, t son heredados a las clases que omplementan 
    la interface. Como una clase puede implementar multiples interfaces, se 
    produce una herencia multiple
    */
    
    default void info()
    {
        System.out.println("Interface I_File, metodo default");
    }
    
    
    
    
    
    
    
    
    
    
}
