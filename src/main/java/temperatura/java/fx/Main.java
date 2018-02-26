package temperatura.java.fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/fxml/nowy.fxml"));
		BorderPane stackPane = loader.load();
		Scene scena = new Scene(stackPane);	
		primaryStage.setScene(scena);
		primaryStage.setTitle("Konwerter temperatur");
		primaryStage.show();
		
	}

}
