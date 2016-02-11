package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Curso;
import org.esc.model.Interface.Sanciones;

public class sancionesAlumnos {

	MySQLBD sql = new MySQLBD();
	public static int codCurso;
	
	
	public void buscaCodCurso(Curso c){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT codCurso FROM cursos WHERE anio="+c.getAnio()+" AND division='"+c.getDivision()+"'");
		try {
			while(rs.next()){
				c.setCodCurso(rs.getInt("codCurso"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buscaAlumno(Alumnos al){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT a.DNI FROM personas p INNER JOIN alumnos a ON p.DNI = a.DNI"
				+" WHERE nombre = '"+al.getNombre()+"' AND apellido = '"+al.getApellido()+"'");
		try {
			while(rs.next()){
				al.setDni(rs.getInt("DNI"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void totalSanciones(Sanciones s,Alumnos al){
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT SUM(nroSanciones) FROM sanciones WHERE DNIAlumno = "+al.getDni()+" AND codSancion = 1");
		try {
			while(rs.next()){
				s.setTotal(rs.getInt("SUM(nroSanciones)"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
