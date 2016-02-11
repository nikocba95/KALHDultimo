package GUI;

import java.util.ArrayList;

import org.esc.model.Implementacion.AlumnosImpl;
import org.esc.model.Implementacion.CursoImpl;
import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Curso;
import org.esc.model.Tablas.tableAlumnos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class verAlumnoController {
	
	
	@FXML
	private ComboBox<Integer> comboCurso;
	private ObservableList<Integer> dataCurso;
	@FXML
	private ComboBox<String> comboDivision;
	private ObservableList<String> dataDivision;
	@FXML
	private TableView<tableAlumnos> tablaAlumnos;
	@FXML
	private TableColumn<tableAlumnos, String> columnApellidos;
	@FXML
	private TableColumn<tableAlumnos, String> columnNombres;;
	@FXML
	private TableColumn<tableAlumnos, Integer> columnDocumentos;
	
	private ObservableList<tableAlumnos> dataAlumnos;
	@FXML
	private Button buttonSiguiente;
	@FXML
	private Button buttonCancelar;
	
	Curso c = new CursoImpl();
	Alumnos a = new AlumnosImpl();
	
	public void initialize(){
		
		columnNombres.setCellValueFactory(
				new PropertyValueFactory<tableAlumnos,String>("nombre"));
		columnApellidos.setCellValueFactory(
				new PropertyValueFactory<tableAlumnos,String>("apellido"));
		columnDocumentos.setCellValueFactory(
				new PropertyValueFactory<tableAlumnos, Integer>("documento"));
		llenarCurso();
		
	}
	
	public void llenarCurso(){
		
		ArrayList<Integer> lc = new ArrayList<Integer>();
		dataCurso = FXCollections.observableArrayList(lc);
		comboCurso.setItems(dataCurso);
		
	}
	
	public void llenarDivision(){
		
		ArrayList<String> ld = new ArrayList<String>();
		dataDivision = FXCollections.observableArrayList(ld);
		comboDivision.setItems(dataDivision);
		
	}
	
	public void llenarAlumnos(){
		
		ArrayList<tableAlumnos> ta = new ArrayList<tableAlumnos>();
		dataAlumnos = FXCollections.observableArrayList(ta);
		tablaAlumnos.setItems(dataAlumnos);
		
	}
	
	public void actionCurso(MouseEvent event){
		
		c.setAnio(comboCurso.getValue());
		llenarDivision();
	}
	
	public void actionDivision(MouseEvent event){
		
		c.setDivision(comboDivision.getValue());
		llenarAlumnos();
	}
	
	public void actionSiguiente(ActionEvent event){
		
		a.setDni(columnDocumentos.getCellData(tablaAlumnos.getSelectionModel().getSelectedIndex()));
		// llamar ventana alumnos.
	}
	
	
	
}
