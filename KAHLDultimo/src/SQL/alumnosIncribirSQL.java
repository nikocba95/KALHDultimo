package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Tablas.tablaCursos;

public class alumnosIncribirSQL {
	
	MySQLBD sql = new MySQLBD();
	
	public void llenarTablaCursos(ArrayList<tablaCursos> lc){
		
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT anio,division,turno,Especialidad "
				+ "FROM Cursos c INNER JOIN Preceptores p ON c.DNIPreceptor = p.DNI "
				+ "INNER JOIN Especialidades e ON e.codEspecialidad = c.codEsp ");
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

}
