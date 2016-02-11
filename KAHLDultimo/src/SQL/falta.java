package SQL;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Inasistencias;

public class falta {

	
	MySQLBD sql = new MySQLBD();
	
	public falta(Inasistencias i,Alumnos al){
		sql.conectar();
		sql.ejecutar("INSERT INTO inasistencias (idInasistencias,fecha,DNIAlumno,totalFaltas,llegadasTarde,Justificada)"
				+ " VALUES (null,'"+i.getFecha()+"',"+al.getDni()+",1,0,"+i.getJustificada()+")");
	}
}
