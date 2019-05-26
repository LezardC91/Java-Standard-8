package Clase06;

import sun.security.util.Length;

public class Clase06Parte2 {
    
    public static void main(String[] args) {
        
        //Clase Object
        class Dato{
        int dato;
        
             public Dato(int dato)
             {
               this.dato=dato;
             }//Fin Metodo

            @Override
            public String toString() {
                return "Dato{" + "dato=" + dato + '}';
            }

            @Override
            public int hashCode() {
               return toString().hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return hashCode()==obj.hashCode();
            }
            
            
        
        
        
        }//Fin Dato
       
        
        Dato d1=new Dato(2);
        Dato d2=d1;
        Dato d3=new Dato(2);
        Dato d4=new Dato(3);
        String d5="2";
        
        
        //Metodo hashcode();
        //Devuelce un entero que representa al objeto
        System.out.println("d1.hashCode()="+d1.hashCode());
        System.out.println("d2.hashCode()="+d2.hashCode());
        System.out.println("d3.hashCode()="+d3.hashCode());
        System.out.println("d4.hashCode()="+d4.hashCode());
        System.out.println("d5.hashCode()="+d5.hashCode());
        
        
        //Metodo equals()
        //Devuelve un boolean que representa si es igual o no 
        //(Compara objetos, no estado)
        System.out.println("d1.equals(d1):"+d1.equals(d1));
        System.out.println("d1.equals(d2):"+d1.equals(d2));
        System.out.println("d1.equals(d3):"+d1.equals(d3));
        System.out.println("d1.equals(d4):"+d1.equals(d4));
        System.out.println("d1.equals(d5):"+d1.equals(d5));
        
        //Clase String
        /*
        -Un String es una List de caracteres
        
        */
        String texto1="Esto es una cadena de texto";
        String texto2=new String("Hola");
        char[] vector={'h','o','l','a'};
        String texto3=new String(vector);
        
        //.length()
        System.out.println(texto1.length());
           
        //.charAt(int index)
        System.out.println(texto1.charAt(10));
                
        //.subString()
        System.out.println(texto1.substring(10));
        System.out.println(texto1.substring(10, 15));
        
        //.startsWith()   .endsWith()
        System.out.println(texto1.startsWith("hola"));
        System.out.println(texto1.startsWith("es"));
        System.out.println(texto1.endsWith("chau"));
        System.out.println(texto1.endsWith("xto"));
        
        //.contains()
        System.out.println(texto1.contains("cadena"));
        System.out.println(texto1.contains("zas"));
        
        //.indexOf()
        System.out.println(texto1.indexOf("t"));
        
        //.trim()
        System.out.println("    Hola    Hola    ".trim());
        
        //.replaceAll()
        System.out.println(texto1.replaceAll(" ", "."));
        
        //.toLowerCase    .toUpperCase
        System.out.println(texto1.toLowerCase());
        System.out.println(texto1.toUpperCase());
        
        //.split()
        String[] palabras=texto1.split(" ");
        for (int a = 0; a < palabras.length; a++) {
            System.out.println(palabras[a]);
        }
        
        String texto="";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="h";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="o";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="l";
        System.out.println(texto+"\t"+texto.hashCode());
        texto+="a";
        System.out.println(texto+"\t"+texto.hashCode());
     
        //StringBuilder() - StringBuffer()
        StringBuilder sb=new StringBuilder(); //Java5
        
        //StringBuffer sbf=new StringBuffer();//Java1
        
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("h");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("o");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("l");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("a");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        
        texto="";
        sb=new StringBuilder();
        for (int a = 0; a < 100000; a++) {
            sb.append("x"); 
        }
        System.out.println(texto);
        
        
        
        //Clase System
        
        //.exit()
        //System.exit(0);
        // System.out.println("Esta linea no se ejecuta");
        
        //getProperties
        System.out.println(System.getProperties());
        
        //getProperty
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.languaje"));
        
        
        
        
        
        
        
        
        
        
    }
    
}
