package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Curso;
import org.esc.model.Tablas.tablaAlumnos;
import org.esc.model.Tablas.tablaApercibimientos;
import org.esc.model.Tablas.tablaCursos;
import org.esc.model.Tablas.tablaSanciones;

import javafx.collections.FXCollections;

public class alumnosSancionSQL {

	MySQLBD sql = new MySQLBD();
	
	public void mandarTablaCursos(ArrayList<tablaCursos> lc){
		
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
	
	public void mandarTablaAlumos(ArrayList<tablaAlumnos> al,Curso c){
		
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT nombre,apellido FROM personas p, alumnos a WHERE p.DNI = a.DNI AND codCurso = "+c.getCodCurso());
		try {
			while(cons.next()){
				
				tablaAlumnos ta = new tablaAlumnos();
				ta.nombre.set(cons.getString("nombre"));
				ta.apellido.set(cons.getString("apellido"));
				al.add(ta);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mandarTablaApercibimientos(ArrayList<tablaApercibimientos> la,Alumnos al){
		
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT fecha,nroSanciones,observacion"
				+" FROM sanciones s LEFT JOIN tipossanciones ts ON s.idSanciones = ts.codSancion"
				+" WHERE s.codSancion = 2 AND DNIAlumno = "+al.getDni());
		try {
		while(cons.next()){
			
			tablaApercibimientos ta = new tablaApercibimientos();
			ta.fecha.set(cons.getDate("fecha").toString());
			ta.cantidad.set(cons.getInt("nroSanciones"));
			ta.observacion.set(cons.getString("observacion"));
			la.add(ta);
		}
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	
	public void mandarTablaSanciones(ArrayList<tablaSanciones> ls,Alumnos al){
	
		
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT fecha,nroSanciones,observacion"
				+" FROM sanciones s LEFT JOIN tipossanciones ts ON s.idSanciones = ts.codSancion"
				+" WHERE s.codSancion = 1 AND DNIAlumno = "+al.getDni());
		try {
			while(cons.next()){
			
			tablaSanciones ts = new tablaSanciones();
			ts.fecha.set(cons.getDate("fecha").toString());
			ts.cantidad.set(cons.getInt("nroSanciones"));
			ts.observacion.set(cons.getString("observacion"));
			ls.add(ts);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
