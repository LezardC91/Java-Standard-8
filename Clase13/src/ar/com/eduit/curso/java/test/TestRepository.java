package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.conector.ConectorMySQL;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enums.Dia;
import ar.com.eduit.curso.java.enums.Turno;
import ar.com.eduit.curso.java.repositories.jdbc.AlumnoR;
import ar.com.eduit.curso.java.repositories.jdbc.CursoR;

public class TestRepository {
    public static void main(String[] args) {
//        CursoR cr=new CursoR(ConectorMySQL.getConnection());
//        Curso curso=new Curso("C++", "Uriel", Dia.lunes, Turno.tarde);
//        cr.save(curso);
//        System.out.println(curso);
         

//        cr.getLikeTitulo("ja").forEach(System.out::println);
//        cr.getLikeProfesor("G").forEach(System.out::println);
//        cr.getLikeTituloProfesorDiaTurno("", "", Dia.lunes, Turno.tarde).forEach(System.out::println);

//          //cr.remove(cr.getById(3));
//          Curso cursoX=cr.getById(5);
//          if(cursoX!=null){
//              cursoX.setTitulo("C#");
//              cr.update(cursoX);
//          }  
//          cr.getAll().forEach(System.out::println);

          AlumnoR ar=new AlumnoR(ConectorMySQL.getConnection());
          Alumno alumno=new Alumno("Gabriel", "Lopez", 22, 1);
          ar.save(alumno);
          ar.getAll();
          ar.getAll().forEach(System.out::println);
          
    }
}
