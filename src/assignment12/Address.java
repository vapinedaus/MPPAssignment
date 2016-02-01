package assignment12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Address extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		try{
			
			Parent root = FXMLLoader.load(getClass().getResource("Address.fxml"));
			Scene scene = new Scene(root,650,200);
			primaryStage.setScene(scene);
			primaryStage.show();	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
