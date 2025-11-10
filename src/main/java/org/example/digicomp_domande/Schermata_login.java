package org.example.digicomp_domande;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.digicomp_domande.*;

import java.io.IOException;
import java.sql.SQLException;

public class Schermata_login {
    db_login db_login= new db_login();
    @FXML
    private TextField nome_login;
    @FXML
    private PasswordField pasword_login;
    @FXML
    private Button login;
    @FXML
    private Button register;
    @FXML
    public void initialize(){
        db_login.connect();
    }
    @FXML
    private void Register() throws IOException, SQLException {
        int result= db_login.controllaUtente(nome_login.getText(),pasword_login.getText());
        if(result==0) {
            db_login.aggiungiUtente(nome_login.getText(),pasword_login.getText());
            Platform.runLater(()->{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("dati inseriti");
                alert.setHeaderText("Successo!");
                alert.setContentText("i tuoi dati sono stati registati con successo: \n nome: " + nome_login.getText() + "\n pasword:  " + pasword_login.getText());
                alert.showAndWait();
                System.out.println("Registrazione: " + nome_login.getText() + "\n" + pasword_login.getText());
            });

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("dati inseriti");
            alert.setHeaderText("Error!");
            alert.setContentText("Hai già effettuato il login, prova ad accedere");
            alert.showAndWait();
        }
    };
    @FXML
    private void Login() throws IOException, SQLException {
        System.out.println("Login: "+nome_login.getText()+"\n"+pasword_login.getText());
        int result= db_login.controllaUtente(nome_login.getText(),pasword_login.getText());
        if(result==0){
            int psw = db_login.controllaPassword(nome_login.getText());
            if(psw==0){
                System.out.println("utente non trovato eseguire il login");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Errore");
                alert.setHeaderText("Errore");
                alert.setContentText("Login non trovato, registrati prima");
                alert.showAndWait();
                nome_login.clear();
                pasword_login.clear();
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Errore");
                alert.setHeaderText("Errore");
                alert.setContentText("password errata");
                alert.showAndWait();
                pasword_login.clear();
            }

        }else {
            System.out.println("tutto apposto");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Successo");
            alert.setHeaderText("Successo");
            alert.setContentText("Benvenuto nel testing aica digComp2.2");
            alert.showAndWait();
            apriSecondoStage();
        }
    }
    @FXML
    private void apriSecondoStage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            // Crea e mostra il nuovo stage
            Stage stage = new Stage();
            stage.setTitle("Seconda Finestra");
            stage.setScene(new Scene(root));
            stage.show();

            // Chiudi lo stage corrente
            Stage currentStage = (Stage) login.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
