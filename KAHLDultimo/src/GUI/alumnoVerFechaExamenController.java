package GUI;

import java.util.ArrayList;

import org.esc.model.Tablas.tableHistorial;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class alumnoVerFechaExamenController {

	@FXML
	private TableView<tableHistorial> tablaColoquios;
	@FXML
	private TableColumn<tableHistorial, String> columnaMaterias;
	@FXML
	private TableColumn<tableHistorial, String> columnaFecha;
	@FXML
	private TableColumn<tableHistorial, String> columnaTipoExamen;
	@FXML
	private Button buttonVolver;
	@FXML
	private Label lblNombreAlumno;
	
	//ObservableList
	private ObservableList<tableHistorial> dataColoquios;
	
	
	public void initialize(){
		
		columnaMaterias.setCellValueFactory(
				new PropertyValueFactory<tableHistorial,String>("materia"));
		columnaFecha.setCellValueFactory(
				new PropertyValueFactory<tableHistorial,String>("fecha"));
		columnaTipoExamen.setCellValueFactory(
				new PropertyValueFactory<tableHistorial,String>("tipoExamen"));
		llenarTablaColoquios();
	}
	
	public void llenarTablaColoquios(){
		
		ArrayList<tableHistorial> lc = new ArrayList<tableHistorial>();
		dataColoquios = FXCollections.observableArrayList(lc);
		tablaColoquios.setItems(dataColoquios);
	}
	
	public void actionVolver(ActionEvent event){
		
		
	}
}
