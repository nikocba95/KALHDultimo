package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Sanciones;

public class conductaAlumno {

	
	MySQLBD sql = new MySQLBD();
	
	public void totalAmonestaciones(Sanciones s,Alumnos al){
		
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
	public void totalSanciones(Sanciones s,Alumnos al){
		ResultSet rs = sql.consultar("SELECT SUM(nroSanciones) FROM sanciones WHERE DNIAlumno = "+al.getDni()+" AND codSancion = 2");
		try {
			while(rs.next()){
				s.setNroSanciones(rs.getInt("SUM(nroSanciones)"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
