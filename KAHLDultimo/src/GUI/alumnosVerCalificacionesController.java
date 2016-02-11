package GUI;

import java.util.ArrayList;

import org.esc.model.Tablas.tableAlumnos;
import org.esc.model.Tablas.tableAtencion;
import org.esc.model.Tablas.tableHistorial;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class alumnosVerCalificacionesController {
	
	@FXML
	private TableView<tableHistorial> tablaHistorial;
	@FXML
	private TableColumn<tableHistorial,String> columnaMateriaH;
	@FXML
	private TableColumn<tableHistorial,Integer> columnaNotaH;
	@FXML
	private TableColumn<tableHistorial,String> columnaFechaH;
	@FXML
	private TableColumn<tableHistorial,String> columnaTipoExamenH;
	@FXML
	private TableView<tableAtencion> tablaAtencion;
	@FXML
	private TableColumn<tableAtencion,String> columnaMateriaA;
	@FXML
	private TableColumn<tableAtencion,Integer> columnaPromedioA;
	@FXML
	private TableView<tableHistorial> tablaMaterias;
	@FXML
	private TableColumn<tableHistorial,String> columnaMateriaM;
	@FXML
	private TableColumn<tableHistorial,Integer> columnaNotaM;
	@FXML
	private TableColumn<tableHistorial,String> columnaFechaM;
	@FXML
	private TableColumn<tableHistorial,String> columnaTipoExamenM;
	@FXML
	private ComboBox<String> comboMateria;
	@FXML
	private Button buttonVolver;
	@FXML
	private Label lblNombreAlumno;
	//ObservableList.
	private ObservableList<tableHistorial> dataHistorial;
	private ObservableList<tableAtencion> dataAtencion;
	private ObservableList<String> dataMaterias;

	public void initialize(){
		
		llenarComboMaterias();
		columnaMateriaH.setCellValueFactory(
				new PropertyValueFactory<tableHistorial,String>("materia"));
		columnaNotaH.setCellValueFactory(
				new PropertyValueFactory<tableHistorial,Integer>("nota"));
		columnaFechaH.setCellValueFactory(
				new PropertyValueFactory<tableHistorial, String>("fecha"));
		columnaTipoExamenH.setCellValueFactory(
				new PropertyValueFactory<tableHistorial, String>("tipoExamen"));
		llenarTablaHistorial();
		
		columnaMateriaA.setCellValueFactory(
				new PropertyValueFactory<tableAtencion,String>("materia"));
		columnaPromedioA.setCellValueFactory(
				new PropertyValueFactory<tableAtencion,Integer>("promedio"));
		llenarTablaAtencion();
	
	}



	private void llenarComboMaterias() {
		
		ArrayList<String> lm = new ArrayList<String>();
		dataMaterias = FXCollections.observableArrayList(lm);
		comboMateria.setItems(dataMaterias);

	}



	public void llenarTablaAtencion() {
		
		ArrayList<tableAtencion> ta = new ArrayList<tableAtencion>();
		dataAtencion = FXCollections.observableArrayList(ta);
		tablaAtencion.setItems(dataAtencion);
		
	}



	public void llenarTablaHistorial() {
		
		ArrayList<tableHistorial> th = new ArrayList<tableHistorial>();
		dataHistorial = FXCollections.observableArrayList(th);
		tablaHistorial.setItems(dataHistorial);
		
	}
	
	
	public void actionComboMateria(ActionEvent event){
		
		
		
	}
}
