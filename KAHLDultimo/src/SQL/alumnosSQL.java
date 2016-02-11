package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Interface.Curso;
import org.esc.model.Tablas.tablaAlumnos;
import org.esc.model.Tablas.tablaCursos;

public class alumnosSQL {
	
	MySQLBD sql = new MySQLBD();
	
	public void llenarTablaCursos(ArrayList<tablaCursos> lc){
		
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT anio,division,turno,Especialidad "
				+ "FROM Cursos c LEFT JOIN Preceptores p ON c.DNIPreceptor = p.DNI "
				+ "LEFT JOIN Especialidades e ON e.codEspecialidad = c.codEsp ");
		try {
			while(cons.next()){
				
				tablaCursos tc = new tablaCursos();
				tc.anio.set(cons.getInt("anio"));
				tc.division.set(cons.getString("division"));
				tc.turno.set(cons.getString("turno"));
				tc.especialidad.set(cons.getString("especialidad"));
				lc.add(tc);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void llenarTablaAlumnos(ArrayList<tablaAlumnos> la,Curso c){
		
		sql.conectar();
		ResultSet consulta = sql.consultar("SELECT a.DNI,apellido,nombre"
				+ " FROM personas p,alumnos a"
				+ " WHERE p.DNI = a.DNI"
				+ " AND codCurso = "+c.getCodCurso());
		try {
			while(consulta.next()){
				
				tablaAlumnos ta = new tablaAlumnos();
				ta.documento.set(consulta.getInt("DNI"));
				ta.apellido.set(consulta.getString("apellido"));
				ta.nombre.set(consulta.getString("nombre"));
				la.add(ta);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
