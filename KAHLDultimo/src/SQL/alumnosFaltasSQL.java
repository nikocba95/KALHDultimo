package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Tablas.tablaFaltas;
import org.esc.model.Tablas.tablaLlegadasTarde;

public class alumnosFaltasSQL {
	
	MySQLBD sql = new MySQLBD();
	
	public void mandarTablaFaltas(ArrayList<tablaFaltas> lf,Alumnos al){
	
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT fecha,Justificada FROM inasistencias WHERE llegadasTarde = 0 AND DNIAlumno= "+al.getDni());
		try {
			while(cons.next()){

				tablaFaltas tf = new tablaFaltas();
				tf.fechaFalta.set(cons.getDate("fecha").toString());
				if(cons.getBoolean("Justificada")){
					tf.justificada.set("SI");
					tf.injustificada.set("NO");
				}
				else{
					tf.justificada.set("NO");
					tf.injustificada.set("SI");
				}
				lf.add(tf);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mandarTablaLlegadasTarde(ArrayList<tablaLlegadasTarde> llt, Alumnos al){
		
		sql.conectar();
		ResultSet cons = sql.consultar("SELECT fecha,Justificada FROM inasistencias WHERE llegadasTarde != 0  AND DNIAlumno="+al.getDni());
		try {
			while(cons.next()){
				
				tablaLlegadasTarde tt = new tablaLlegadasTarde();
				tt.fechaLlegadaTarde.set(cons.getDate("fecha").toString());;
				llt.add(tt);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
