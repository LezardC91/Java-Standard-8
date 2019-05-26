package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.conector.ConectorMySQL;
import java.sql.Connection;
import java.sql.Statement;

public class TestConector {
    public static void main(String[] args) throws Exception {
        
        Connection conn=ConectorMySQL.getConnection();
        Statement st=conn.createStatement();
        String query="insert into cursos (titulo,profesor,dia,turno) values "
                                      + "('HTML','Gomez','martes','tarde')";
        st.executeQuery(query);
        st.close();
                
        ConectorMySQL.getConnection().createStatement().execute(
                "insert into cursos (titulo,profesor,dia,turno) values "
              + "('Java','Torres','jueves','noche')"
        );
    }
}

