package ar.com.eduit.curso.java.utils.swing;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TxtValidator {
    private JTextField txt;

    public TxtValidator(JTextField txt) { this.txt = txt; }
    
    private boolean error(String msg){
        txt.selectAll();
        txt.requestFocus();
        JOptionPane.showMessageDialog(txt, msg, "Error de Datos!", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    public boolean length(int length){
        if(txt.getText().length()==length) 
        return true;
        return error("La longitud debe ser de "+length+" caracteres");
}    
    
    public boolean length(int min, int max){
        if(txt.getText().length()>=min && txt.getText().length()<=max) 
            return true;
            return error("La llongitud debe ser entre "+min+" y "+max+" caracteres");
    }
    
    public boolean isInteger() {
        try {
            Integer.parseInt(txt.getText());
            return true;
        } catch (Exception e) {
            return error("Debe ser un numero entero");
        }
    }
    
    public boolean isInteger(int min, int max){
        if(!isInteger()) return false;
        int nro=Integer.parseInt(txt.getText());
        if (nro>=min && nro<=max) return true;
        return error("Debe ser um numero entero entre "+min+" y "+max);
    
        
    }
    
    
    
    
    
    
}
