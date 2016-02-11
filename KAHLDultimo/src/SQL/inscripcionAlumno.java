package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.model.Interface.Curso;
import org.esc.model.Interface.Inscripcion;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class inscripcionAlumno {
	
	public static int codCurso;
	public String ingreso = null;
	
	MySQLBD sql = new MySQLBD();
	
	public void inscribirAlumno(Inscripcion i){
		
		if(i.isIngresoConPase())
			ingreso = "Con Pase";
		if(i.isIngresoDirecto())
			ingreso = "Directo";
		sql.conectar();
		sql.ejecutar("UPDATE alumnos SET codCurso = "+codCurso+" WHERE DNI = "+i.getDni());
		sql.ejecutar("INSERT INTO inscripcion (codInscripcion,fecha,cicloLectivo,tipoIngreso)"
				+ " VALUES (null,'"+i.getFechaInscripcion()+"',"+i.getCicloLectivo()+",'"+ingreso+"')");
		sql.ejecutar("INSERT INTO inscripcionhistorica (Dni,codInscripcion)"
				+ " VALUES ("+i.getDni()+","+buscaCodInscripcion()+")");
	
	}
	

	public void buscaCodCurso(int curso,String division){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT codCurso FROM cursos WHERE anio="+curso+" AND division='"+division+"'");
		try {
			while(rs.next()){
				codCurso = rs.getInt("codCurso");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int buscaCodInscripcion(){
		
		
		sql.conectar();
		ResultSet rs = sql.consultar(" SELECT MAX(codInscripcion) FROM inscripcion");
		try {
			while(rs.next()){
				return rs.getInt("MAX(codInscripcion)");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	
	
	
}
