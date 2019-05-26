package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.utils.files.FileText;
import ar.com.eduit.curso.java.utils.files.I_File;
import java.util.ArrayList;
import java.util.List;

public class TestFileText {
    public static void main(String[] args) {
        String file="texto.txt";
        I_File fileText=new FileText(file);
        //fileText.print();
        fileText.setText("Curso de Java Mayo 2019\nTodo bien.");
        
        fileText.appenText("Primavera\n");
        fileText.appenText("Invierno\n");
        fileText.appenText("Otoño\n");
        fileText.appenText("Verano\n");
        
        //fileText.clear();
        List<String>semana=new ArrayList();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miercoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Viernes");
        semana.add("Domingo");
        semana.add("Lunes");
        semana.add("Sabado");
        
        fileText.addLines(semana);
        
        fileText.getLines();
        System.out.println("------------");
        //fileText.getLines("le").forEach(System.out::println);
        // System.out.println(fileText.getText());
        
        //fileText.getSortedLines().forEach(System.out::println);
        fileText.getReversedLines().forEach(System.out::println);
        System.out.println("------------");
        fileText.getLinkedHashSetLines().forEach(System.out::println);
        System.out.println("------------");
        fileText.getTreeSet().forEach(System.out::println);
        System.out.println("------------");
        
        
    }
}
