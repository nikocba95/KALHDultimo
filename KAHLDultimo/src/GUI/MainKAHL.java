package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class MainKAHL extends Application {

	public void start(final Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("/GUI/CargarAlumno.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setResizable(true);
			primaryStage.setScene(scene);
			
			
			
			primaryStage.setTitle("Kahl.D - Sistema de Gestion Academica");
			primaryStage.setOnCloseRequest(e ->  {
				e.consume();
				closeProgram(primaryStage);
			});
			primaryStage.show();
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void closeProgram(Stage window){
		Boolean closure = ConfirmBox.display("Atención!", "¿Seguro desea salir?");
		if(closure)
			window.close();
		
		
	}
}