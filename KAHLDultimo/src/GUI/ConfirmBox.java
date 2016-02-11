package GUI;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;


public class ConfirmBox {
	
	
	static boolean answer = false;
	
	public static boolean display(String title, String message){
		Button yes, no;
		
		Stage window = new Stage();
		window.setTitle(title);
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinWidth(400);
		window.setMinHeight(300);
		
		Label label = new Label(message);
		
		yes = new Button("Si");
		yes.setOnAction(e -> {
			answer=true;
			window.close();});
		
		no = new Button("No");
		no.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		
		
		
		
		
		VBox layout = new VBox(10);
		HBox botones = new HBox(10);
		botones.getChildren().addAll(yes,no);
		layout.getChildren().addAll(label, botones);
		botones.setAlignment(Pos.CENTER);
		layout.setPadding(new Insets(15));
		layout.setAlignment(Pos.CENTER);
		
		
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
		
		return answer;
	
}
	
}

	
