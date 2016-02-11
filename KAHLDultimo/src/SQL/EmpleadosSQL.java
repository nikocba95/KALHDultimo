package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Tablas.listaEmpleados;
import org.esc.model.Tablas.tablaAlumnos;

public class EmpleadosSQL {
	
	MySQLBD sql = new MySQLBD();
	private static String sentencia = null;
	
	public void datosTablaPersonal(listaEmpleados le){
		
		sql.conectar();
		ResultSet rs = sql.consultar(sentencia);
		try {
			while(rs.next()){
				
				tablaAlumnos ta = new tablaAlumnos();
				ta.documento.set(rs.getInt("DNI"));
				ta.apellido.set(rs.getString("apellido"));
				ta.nombre.set(rs.getString("nombre"));
				le.setListaEmpleados(ta);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void docentesTodos(){
		
		sentencia = "SELECT d.DNI,nombre,apellido FROM docentes d INNER JOIN personas p ON d.DNI = p.DNI";
	}
	
	public void preceptoresTodos(){
		
		sentencia = "SELECT p.DNI,nombre,apellido"
				+" FROM preceptores p INNER JOIN personas per ON p.DNI = per.DNI";
	}

}
