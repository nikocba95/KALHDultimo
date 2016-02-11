package SQL;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Inasistencias;

public class llegadaTarde {

	MySQLBD sql = new MySQLBD();
	
	public llegadaTarde(Inasistencias i,Alumnos al){
		
		sql.conectar();
		sql.ejecutar("INSERT INTO inasistencias (idInasistencias,fecha,DNIAlumno,totalFaltas,llegadasTarde,Justificada)"
				+ " VALUES (null,'"+i.getFecha()+"',"+al.getDni()+",0,1,null)");
	}
}
