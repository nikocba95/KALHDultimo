package GUI;

import org.esc.model.Implementacion.SancionesImpl;
import org.esc.model.Interface.Sanciones;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class cargarSancionController {

	@FXML
	private DatePicker textFecha;
	@FXML
	private RadioButton radioFirma;
	@FXML
	private RadioButton radioTareaReparadora;
	@FXML
	private RadioButton radioObservacion;
	@FXML
	private RadioButton radioAmonestacion;
	@FXML
	private TextArea textObservaciones;
	@FXML
	private TextField textAmonestaciones;
	@FXML
	private Button buttonGuardar;
	@FXML
	private Button buttonCancelar;
	
	Sanciones s = new SancionesImpl();
	
	public void actionGuardar(ActionEvent event){
		
		s.setIdSanciones(idSancion());
		s.setObservacion(textObservaciones.getText());
		s.setNroSanciones(Integer.parseInt(textAmonestaciones.getText()));
		s.setFecha(textFecha.getValue());
		
	}
	
	public String idSancion(){
		if(radioFirma.isSelected())
			return "Firma";
		if(radioTareaReparadora.isSelected())
			return "TareaReparadora";
		if(radioObservacion.isSelected())
			return "Observacion";
		else
			return "Amonestacion";
	}
}
