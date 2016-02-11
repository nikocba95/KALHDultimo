package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Materias;
import org.esc.model.Tablas.tablaNotas;

public class notasAlumnosSQL {
	
	MySQLBD sql = new MySQLBD();
	
	public void buscaNotas(Alumnos al,ArrayList<tablaNotas> ln,Materias m){
		
		sql.conectar();
		System.out.println(al.getDni()+" "+m.getCodMateria());
		ResultSet rs = sql.consultar("SELECT fecha,examen,nota"
				+" FROM materias m INNER JOIN calificaciones c ON m.codMateria = c.codMateria"
				+" INNER JOIN examenes e ON c.mesa = e.mesa INNER JOIN tiposexamenes tx"
				+" ON e.codExamen = tx.codExamen"
				+" WHERE DNIAlumno = "+al.getDni()+" AND m.codMateria = "+m.getCodMateria());
		try {
			while(rs.next()){
				
				tablaNotas tn = new tablaNotas();
				tn.fecha.set(rs.getDate("fecha").toString());
				tn.nota.set(rs.getInt("nota"));
				tn.tipo.set(rs.getString("examen"));
				ln.add(tn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
	public void buscaCodMateria(Materias m){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT codMateria FROM materias WHERE materia = '"+m.getMateria()+"'");
		try {
			while(rs.next()){
				m.setCodMateria(rs.getInt("codMateria"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buscaMaterias(ArrayList<String> lm){
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT materia FROM materias");
		try {
			while(rs.next()){
				String s = rs.getString("materia");
				lm.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
