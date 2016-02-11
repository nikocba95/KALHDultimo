package GUI;

import java.util.ArrayList;

import org.esc.model.Tablas.tableSanciones;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class alumnoVerSancionesController {

	
	@FXML
	private TableView<tableSanciones> tablaSanciones;
	@FXML
	private TableColumn<tableSanciones, String> fecha;
	@FXML
	private TableColumn<tableSanciones, String> tipo;
	@FXML
	private TableColumn<tableSanciones, Integer> cantidad;
	@FXML
	private TableColumn<tableSanciones, String> observacion;
	@FXML
	private Button buttonVolver;
	@FXML
	private Label lblNombreAlumno;
	@FXML
	private Label lblFelicitaciones;
	//ObservableList
	private ObservableList<tableSanciones> dataSanciones;
	
	
	public void initialize(){
		
		fecha.setCellValueFactory(
				new PropertyValueFactory<tableSanciones, String>("fecha"));
		tipo.setCellValueFactory(
				new PropertyValueFactory<tableSanciones, String>("tipo"));
		cantidad.setCellValueFactory(
				new PropertyValueFactory<tableSanciones, Integer>("cantidad"));
		observacion.setCellValueFactory(
				new PropertyValueFactory<tableSanciones, String>("observacion"));
		llenarTablaSanciones();
	}
	
	public void llenarTablaSanciones(){
		
		ArrayList<tableSanciones> ls = new ArrayList<tableSanciones>();
		dataSanciones = FXCollections.observableArrayList(ls);
		tablaSanciones.setItems(dataSanciones);
		
	}
	
	public void actionVolver(ActionEvent event){
		
	}
}
