package GUI;

import org.esc.model.Implementacion.CursoImpl;
import org.esc.model.Implementacion.EspecialidadImpl;
import org.esc.model.Interface.Curso;
import org.esc.model.Interface.Especialidad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class cargarCursoController {

	@FXML
	private TextField textCurso;
	@FXML
	private TextField textDivision;
	@FXML
	private TextField textEspecialidad;
	@FXML
	private Button buttonGuardar;
	@FXML
	private Button buttonCancelar;
	
	Curso c = new CursoImpl();
	Especialidad e = new EspecialidadImpl();
	
	public void actionGuardar(ActionEvent event){
		
		c.setAnio(Integer.parseInt(textCurso.getText()));
		c.setDivision(textDivision.getText());
		e.setEspecialidad(textEspecialidad.getText());
		
	}
	
	
}