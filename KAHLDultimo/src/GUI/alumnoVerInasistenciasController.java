package GUI;

import java.util.ArrayList;

import org.esc.model.Tablas.tableInasistencias;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class alumnoVerInasistenciasController {

	@FXML
	private TableView<tableInasistencias> tablaFaltas;
	@FXML
	private TableColumn<tableInasistencias, String> columnaFecha;
	@FXML
	private TableColumn<tableInasistencias, String> columnaTipo;
	@FXML
	private TableColumn<tableInasistencias, String> columnaJustificada;
	@FXML
	private Button buttonVolver;
	@FXML
	private Label lblNombreAlumno;
	//ObservableList
	private ObservableList<tableInasistencias> dataFaltas;
	
	
	public void initialize(){
		
		columnaFecha.setCellValueFactory(
				new PropertyValueFactory<tableInasistencias, String>("fecha"));
		columnaTipo.setCellValueFactory(
				new PropertyValueFactory<tableInasistencias, String>("tipo"));
		columnaJustificada.setCellValueFactory(
				new PropertyValueFactory<tableInasistencias, String>("justificada"));
		llenarTablaFaltas();
	}
	
	public void llenarTablaFaltas(){
		
		ArrayList<tableInasistencias> lc = new ArrayList<tableInasistencias>();
		dataFaltas = FXCollections.observableArrayList(lc);
		tablaFaltas.setItems(dataFaltas);
		
	}
	
	public void actionVolver(ActionEvent event){
		
		
	}
}
