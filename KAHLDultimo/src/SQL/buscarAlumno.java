package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.esc.model.Interface.Alumnos;

public class buscarAlumno {
	
	MySQLBD sql = new MySQLBD();
	
	public buscarAlumno(Alumnos al){
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT a.DNI,nombre,apellido"
				+" FROM personas p INNER JOIN alumnos a ON a.DNI = p.DNI"
				+" WHERE apellido like '%"+al.getApellido()+"%'");
		try {
			while(rs.next()){
				al.setDni(rs.getInt("DNI"));
				al.setNombre(rs.getString("nombre"));
				al.setApellido(rs.getString("apellido"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
