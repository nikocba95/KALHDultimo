package SQL;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Sanciones;

public class sqlSancion {
	
	MySQLBD sql = new MySQLBD();
	
	public void nuevaAmonestacion(Alumnos al,Sanciones s){
		
		sql.conectar();
		sql.ejecutar("INSERT INTO sanciones(idSanciones,fecha,DNIAlumno,codSancion,observacion,totalSanciones,nroSanciones)"
				+ " VALUES (null,'"+s.getFecha()+"',"+al.getDni()+",1,'"+s.getObservacion()+"',0,"+s.getNroSanciones()+")");
		
	}
	
	public void nuevaSancion(Alumnos al,Sanciones s){
		sql.conectar();
		sql.ejecutar("INSERT INTO sanciones(idSanciones,fecha,DNIAlumno,codSancion,observacion,totalSanciones,nroSanciones)"
				+ " VALUES (null,'"+s.getFecha()+"',"+al.getDni()+",2,'"+s.getObservacion()+"',0,"+s.getNroSanciones()+")");
	}

}
