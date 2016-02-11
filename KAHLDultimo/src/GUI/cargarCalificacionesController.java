package GUI;

import java.util.ArrayList;

import org.esc.model.Tablas.tableAlumnos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class cargarCalificacionesController {
	
	@FXML
	private ComboBox<String> comboCurso;
	@FXML
	private ComboBox<Integer> comboDivision;
	@FXML
	private ComboBox<String> comboMateria;
	@FXML
	private ComboBox<String> comboTipoExamen;
	@FXML
	private TableView<tableAlumnos> tablaAlumnos;
	@FXML
	private TableColumn<tableAlumnos, String> columnaApellido;
	@FXML
	private TableColumn<tableAlumnos, String> columnaNombre;
	@FXML
	private TableColumn<tableAlumnos, Integer> columnaDocumento;
	@FXML
	private Label lblNombreAlumno;
	@FXML
	private ComboBox<Integer> comboNota;
	@FXML
	private DatePicker textFecha;
	@FXML
	private TextField textMesa;
	@FXML
	private TextField textObservaciones;
	@FXML
	private Button buttonCargar;
	@FXML
	private Button buttonCancelar;
	//observableList
	private ObservableList<String> dataCurso;
	private ObservableList<Integer> dataDivision;
	private ObservableList<String> dataMateria;
	private ObservableList<String> dataTipoExamen;
	private ObservableList<tableAlumnos> dataAlumnos;
	private ObservableList<Integer> dataNotas;

	
	public void initialize(){
		
		columnaApellido.setCellValueFactory(
				new PropertyValueFactory<tableAlumnos, String>("apellido"));
		columnaNombre.setCellValueFactory(
				new PropertyValueFactory<tableAlumnos, String>("nombre"));
		columnaDocumento.setCellValueFactory(
				new PropertyValueFactory<tableAlumnos, Integer>("documento"));
		ArrayList<String> lc = new ArrayList<String>();
		dataCurso = FXCollections.observableArrayList(lc);
		comboCurso.setItems(dataCurso);
	}
	
	public void actionCurso(ActionEvent event){
		
		ArrayList<Integer> ld = new ArrayList<Integer>();
		dataDivision = FXCollections.observableArrayList(ld);
		comboDivision.setItems(dataDivision);
	}
	
	public void actionDivision(ActionEvent event){
		
		ArrayList<String> lm = new ArrayList<String>();
		dataMateria = FXCollections.observableArrayList(lm);
		comboMateria.setItems(dataMateria);
		
	}
	
	public void actionMateria(ActionEvent event){
		
		ArrayList<String> lte = new ArrayList<String>();
		dataTipoExamen = FXCollections.observableArrayList(lte);
		comboTipoExamen.setItems(dataTipoExamen);
		
	}
	
	public void llenarTablaAlumnos(){
		
		ArrayList<tableAlumnos>
	}
}
