package GUI;

import java.io.IOException;

import org.esc.model.Implementacion.usuariosImpl;
import org.esc.model.Interface.usuarios;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthenticationController {
	
	@FXML
	private Label lblIncorrecto;
	@FXML
	private TextField textUsuario;
	@FXML
	private TextField textPassword;
	@FXML
	private Button buttonLogin;
	@FXML
	private Button buttonCancelar;
	@FXML
	private Button buttonSalir;

	
	usuarios user = new usuariosImpl();
	
	public void actionLogin(ActionEvent event) throws IOException{
		
		user.setUser(textUsuario.getText().trim());
		user.setPassword(textPassword.getText().trim());
		//Ejecuto sentencia bd de usuarios
		
		//No se encontro usuario en la bd = no.
		if(user.getTipoUser().equals("no")){
			lblIncorrecto.setText("Usuario y/o password incorrecta");
		}
		
		if(user.getTipoUser().equals("Alumno")){
			
			
			//Abre el modulo de Alumno
			Stage ta = (Stage) ((Node) event.getSource()).getScene().getWindow();
			ta.close();
			Parent parent = FXMLLoader.load(getClass().getResource("GUI/ModuloAlumno.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add("/org/esc/GUI/application.css");
		}
		
		if(user.getTipoUser().equals("Secretaria")){
			
			
			//Abre el modulo de Secretaria.
			Stage ta = (Stage) ((Node) event.getSource()).getScene().getWindow();
			ta.close();
			Parent parent = FXMLLoader.load(getClass().getResource("GUI/ModuloSecretarioAcademico.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add("/org/esc/GUI/application.css");
		}
		
		if(user.getTipoUser().equals("Preceptor")){
			
			//Abre el modulo de Preceptor
			Stage ta = (Stage) ((Node) event.getSource()).getScene().getWindow();
			ta.close();
			Parent parent = FXMLLoader.load(getClass().getResource("GUI/ModuloPreceptor.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add("/org/esc/GUI/application.css");
		}
		
		if(user.getTipoUser().equals("Docente")){
			
			
			//Abro el modulo del docente
			Stage ta = (Stage) ((Node) event.getSource()).getScene().getWindow();
			ta.close();
			Parent parent = FXMLLoader.load(getClass().getResource("GUI/ModuloDocente.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(parent);
			stage.setScene(scene);
			stage.show();
			scene.getStylesheets().add("/org/esc/GUI/application.css");
		}
		
	}
	
	public void actionCancelar(ActionEvent event){
	
		textUsuario.setText("");
		textPassword.setText("");
		lblIncorrecto.setText("");
	}
	
	public void actionSalir(ActionEvent event){
		
	}
}
