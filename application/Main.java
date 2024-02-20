package application;

import javafx.application.Application;
import javafx.stage.Stage;
import views.Login;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		new Login();
	}

	public static void main(String[] args) {
		launch(args);
	}
}