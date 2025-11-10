package org.example.digicomp_domande;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("schermata_login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 372,306);
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 372,306);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
