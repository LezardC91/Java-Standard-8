package ar.com.eduit.curso.java.repositories.interfaces;

import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enums.Dia;
import ar.com.eduit.curso.java.enums.Turno;
import java.util.List;

public interface I_CursoR {
    //Clase que resuelve el DAO
    void save(Curso curso);
    void remove(Curso curso);
    void update(Curso curso);
    Curso getById(int id);
    Curso getByAlumno(Alumno alumno);
    List<Curso> getAll();
    List<Curso> getLikeTitulo(String titulo);
    List<Curso> getLikeProfesor(String profesor);
    List<Curso> getLikeTituloProfesor(String titulo, String profesor);
    List<Curso> getLikeTituloProfesorDiaTurno(String titulo,String profesor, Dia dia, Turno turno);
}
