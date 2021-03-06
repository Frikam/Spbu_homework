package group144.tetin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
            Scene scene = new Scene(root, 338, 200);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Simple calculator");
            primaryStage.centerOnScreen();
            primaryStage.setMinHeight(200);
            primaryStage.setMinWidth(338);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
