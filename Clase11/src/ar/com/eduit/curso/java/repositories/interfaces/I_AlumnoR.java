package ar.com.eduit.curso.java.repositories.interfaces;

import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import java.util.List;

public interface I_AlumnoR {
    void save(Alumno alumno);
    void remove(Alumno alumno);
    void update(Alumno alumno);
    Alumno getById(int id);
    List<Alumno> getAll();
    List<Alumno> getLikeApellidoNombre(String apellido, String nombre);
    List<Alumno> getByCurso(Curso curso);
    
}
