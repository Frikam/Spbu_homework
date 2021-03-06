package group144.tetin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RunClient extends Application {
    private ControllerClient controller;

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Client.fxml"));
        Parent root = loader.load();
        controller = loader.getController();
        primaryStage.setTitle("You play as O");
        primaryStage.setScene(new Scene(root, 350, 300));
        primaryStage.show();
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(325);
    }

    @Override
    public void stop() throws Exception {
        controller.sendMessageAboutDisconnect();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
