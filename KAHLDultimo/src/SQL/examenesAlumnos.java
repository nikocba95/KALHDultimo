package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.esc.model.Implementacion.CursoImpl;
import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Curso;
import org.esc.model.Interface.Examenes;
import org.esc.model.Interface.Materias;
import org.esc.model.Tablas.listaExamenes;
import org.esc.model.Tablas.tablaAlumnos;

public class examenesAlumnos {
	
	MySQLBD sql = new MySQLBD();
	
	public void sqlCursos(listaExamenes lc){
		
		sql.conectar();
		ResultSet rs = sql.consultar("Select anio,division FROM cursos ORDER BY anio ASC, division ASC");
		try {
			while(rs.next()){
				
				String s = (rs.getInt("anio")+" "+rs.getString("division"));
				lc.setListaCursos(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sqlMaterias(listaExamenes lc){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT materia FROM materias");
		try {
			while(rs.next()){
				
				String s = (rs.getString("materia"));
				lc.setListaMaterias(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buscaCodCurso(Curso curso){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT codCurso FROM cursos WHERE anio="+curso.getAnio()+" AND division='"+curso.getDivision()+"'");
		try {
			while(rs.next()){
				curso.setCodCurso(rs.getInt("codCurso"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sqlExamen(listaExamenes le,Examenes e){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT examen FROM tiposexamenes");
		try {
			while(rs.next()){
				String s = rs.getString("examen");
				le.setListaExamenes(s);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void mandarTabla(ArrayList<tablaAlumnos> al,Curso c){
		
		sql.conectar();
		ResultSet rs = sql.consultar("SELECT a.DNI,nombre,apellido"
				+" FROM personas p INNER JOIN alumnos a ON p.DNI = a.DNI"
				+" INNER JOIN cursos c ON c.codCurso = a.codCurso"
				+" WHERE a.codCurso = "+c.getCodCurso());
		try {
			while(rs.next()){
				tablaAlumnos ta = new tablaAlumnos();
				ta.documento.set(rs.getInt("DNI"));
				ta.nombre.set(rs.getString("nombre"));
				ta.apellido.set(rs.getString("apellido"));
				al.add(ta);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guardarNota(Examenes e,Alumnos al,Materias m){
		sql.conectar();
		sql.ejecutar("INSERT INTO examenes (mesa,fecha,codExamen,obs) VALUES ('"+e.getMesa()+"','"+e.getFecha()+"',"+e.getCodExamen()+",'"+e.getObs()+"')");
		sql.ejecutar("INSERT INTO calificaciones (DNIAlumno,mesa,codMateria,nota) "
				+ " VALUES ("+al.getDni()+",'"+e.getMesa()+"',"+m.getCodMateria()+","+e.getNota()+") ");
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

}
