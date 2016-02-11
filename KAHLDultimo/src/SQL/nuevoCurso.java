package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.esc.model.Interface.Curso;
import org.esc.model.Interface.Especialidad;

public class nuevoCurso {

	static MySQLBD sql = new MySQLBD();
	
	public nuevoCurso(Curso c, Especialidad e){
	
		
		sql.conectar();
		
		if(sql.ejecutar("INSERT INTO especialidades(codEspecialidad,especialidad) VALUES (NULL,'"+e.getEspecialidad()+"')"))
			JOptionPane.showMessageDialog(null, "Se introdujo la especialidad");
		else
			JOptionPane.showMessageDialog(null, "No se introdujo especialidad");
		if(sql.ejecutar("INSERT INTO cursos(codCurso,anio,division,codEsp,DNIPreceptor,legajoPreceptor)"
				+ "VALUES (NULL,"+c.getAnio()+",'"+c.getDivision()+"',NULL,null,null)"))
			JOptionPane.showMessageDialog(null, "Se pudo introducir curso");
		else
			JOptionPane.showMessageDialog(null, "No se pudo introducir el curso");
		
		
	}
	

	

}
