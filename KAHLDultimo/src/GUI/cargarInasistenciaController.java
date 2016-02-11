package GUI;

import org.esc.model.Implementacion.InasistenciasImpl;
import org.esc.model.Interface.Inasistencias;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

public class cargarInasistenciaController {

	@FXML
	private DatePicker fechaInasistencia;
	@FXML
	private DatePicker fechaLlegadaTarde;
	@FXML
	private RadioButton radioJustificadaI;
	@FXML
	private RadioButton radioInjustificadaI;
	@FXML
	private RadioButton radioJustificadaL;
	@FXML
	private RadioButton radioInjustificadaL;
	@FXML
	private Button buttonGuardar;
	@FXML
	private Button buttonCancelar;
	
	Inasistencias i = new InasistenciasImpl();
	
	public void actionGuardar(){
		
		if(fechaInasistencia.getValue().equals(null))
			llegadaTarde();
		else
			inasistencia();
		
	}
	
	public void inasistencia(){
	
		i.setFecha(fechaInasistencia.getValue());
		if(radioJustificadaI.isSelected())
			i.setJustificada(true);
		if(radioInjustificadaI.isSelected())
			i.setJustificada(false);
	}
	
	public void llegadaTarde(){
		
		i.setFecha(fechaLlegadaTarde.getValue());
		if(radioJustificadaL.isSelected())
			i.setJustificada(true);
		if(radioInjustificadaL.isSelected())
			i.setJustificada(false);
	}
	
	
}
