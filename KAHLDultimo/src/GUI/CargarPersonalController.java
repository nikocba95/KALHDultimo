package GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.esc.BO.SQL.AlumnoSQL;
import org.esc.model.Implementacion.AlumnosImpl;
import org.esc.model.Implementacion.DomicilioImpl;
import org.esc.model.Implementacion.NacionalidadImpl;
import org.esc.model.Interface.Alumnos;
import org.esc.model.Interface.Domicilio;
import org.esc.model.Interface.Nacionalidad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class CargarPersonalController {

	@FXML
	private TextField textDocumento;
	@FXML 
	private ChoiceBox<String> textSexo;
	@FXML
	private TextField textNombre;
	@FXML
	private TextField textApellido;
	@FXML
	private DatePicker textNacimiento;
	@FXML
	private TextField textNacionalidad;
	@FXML
	private TextField textPais;
	@FXML
	private TextField textCorreo;
	@FXML
	private TextField textProvincia;
	@FXML
	private TextField textLocalidad;
	@FXML
	private TextField textCalle;
	@FXML
	private TextField textBarrio;
	@FXML
	private TextField textNro;
	@FXML
	private TextField textPiso;
	@FXML
	private TextField textDepto;
	@FXML
	private TextField textTelefono;
	@FXML
	private ImageView foto;
	@FXML
	private TextField textLegajo;
	@FXML
	private TextField textCuil;
	@FXML
	private TextField textTitulo;
	@FXML
	private TextField textEgresado;
	@FXML
	private Label lblEstado;
	@FXML
	private Button buttonActivo;
	@FXML
	private Button buttonPasivo;
	@FXML
	private Button buttonImagen;
	
	private ObservableList<String> dataSexo;
	
	
	Alumnos al = new AlumnosImpl();
	Domicilio dom = new DomicilioImpl();
	Nacionalidad nac = new NacionalidadImpl();
	AlumnoSQL aSQL = new AlumnoSQL();
	
	public void initialize(){
		
		dataSexo = FXCollections.observableArrayList("M","F");
		textSexo.setItems(dataSexo);
	}
	
	
	public void actionGuardar(ActionEvent event){
		
		try{
			
			al.setDni(Integer.parseInt(textDocumento.getText()));
			al.setSexo(textSexo.getValue());
			al.setNombre(textNombre.getText());
			al.setApellido(textApellido.getText());
			al.setFechaNacimiento(textNacimiento.getValue());
			nac.setNacionalidad(textNacionalidad.getText());
			nac.setPais(textPais.getText());
			al.setCorreo(textCorreo.getText());
			nac.setProvincia(textProvincia.getText());
			nac.setLocalidad(textLocalidad.getText());
			dom.setBarrio(textBarrio.getText());
			dom.setCalle(textCalle.getText());
			dom.setNumero(Integer.parseInt(textNro.getText()));
			dom.setPiso(Integer.parseInt(textPiso.getText()));
			dom.setDpto(textDepto.getText());
			al.setTelefono(Integer.parseInt(textTelefono.getText()));
			al.setNombreMadre(textNombreMadre.getText());
			al.setApellidoMadre(textApellidoMadre.getText());
			al.setNombrePadre(textNombrePadre.getText());
			al.setApellidoPadre(textApellidoPadre.getText());
			al.setMatricula(Integer.parseInt(textMatricula.getText()));
			al.setEstado(estado());
			al.setEstablecimientoAnterior(textEstablecimientoAnterior.getText());
			al.setConstanciaSexto(textConstanciaSexto.getText());
			al.setFechaEmision(textFechaEmision.getValue());
			al.setObservacion(textObservaciones.getText());
			
			//EJECUTO SENTENCIAS
			aSQL.nuevoAlumno(al, dom, nac);
			
		//Exepciones.
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public boolean estado(){
		
		if(lblEstado.getText().equals("Activo"))
			return true;
		else
			return false;
	}
	
	//Metodos para botones del estado del alumno
	public void actionActivo(ActionEvent event){
		lblEstado.setText("Activo");
	}
	public void actionPasivo(ActionEvent event){
		lblEstado.setText("Pasivo");
	}
	
	//Metodo boton cancelar;
	public void actionCancelar(ActionEvent event){
		
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}
	//Metodo boton cargar Imagen;
	public void actionImagen() throws FileNotFoundException{
		
		FileChooser fileChooser = new FileChooser();
		Stage stage = null;
		
		try{
			File file = fileChooser.showOpenDialog(stage);
			
			String thumbURL = file.toURI().toURL().toString();
			Image imgLoad = new Image(thumbURL,161,144,false,true,true);
			
			File imagen = new File(thumbURL);
			foto.setImage(imgLoad);
			
			
			FileInputStream fis = new FileInputStream(imagen);
			al.setFoto(fis);

		}catch(MalformedURLException ex){
			Logger.getLogger(CargarPersonalController.class.getName()).log(Level.SEVERE,null, ex);
		}
	}
	
	
}
