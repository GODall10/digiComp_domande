package org.example.digicomp_domande;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class HelloController {
    int area=1;
    int currid;
    int cont;
    int idgen;
    int intermed;
    String alf;
    String com;
    String creaz;
    String sicurezza;
    String problemi;
    String selezione;
    String corretta;
    Alert conferma = new Alert(Alert.AlertType.INFORMATION);
    Alert comunicazione = new Alert(Alert.AlertType.INFORMATION);
    Alert creazione = new Alert(Alert.AlertType.INFORMATION);
    Alert sic = new  Alert(Alert.AlertType.INFORMATION);
    Alert probl = new Alert(Alert.AlertType.INFORMATION);
    database db = new database();
    String a,b,c,d,e;

    @FXML
    private TextField txtDomanda;
    @FXML
    private RadioButton radioButtona;
    @FXML
    private RadioButton radioButtonb;
    @FXML
    private RadioButton radioButtonc;
    @FXML
    private RadioButton radioButtond;
    private ToggleGroup toggleGroup;
    private Toggle toggle;
    @FXML
    public void initialize() throws Exception {
        db.connect();
        conferma.setTitle("Attenzione");
        conferma.setHeaderText("Attenzione");
        conferma.setContentText("risposta inviata");
        comunicazione.setTitle("Benvenuto");
        comunicazione.setHeaderText("Benvenuto");
        comunicazione.setContentText("la seconda area di competenza riguarderà Comunicazione e Collaborazione");
        creazione.setTitle("Benvenuto");
        creazione.setHeaderText("Benvenuto");
        creazione.setContentText("la terza area di competenza riguarderà Creazione di contenuti digitali");
        sic.setTitle("Benvenuto");
        sic.setHeaderText("Benvenuto");
        sic.setContentText("la quarta area di competenza riguarderà Sicurezza");
        probl.setTitle("Benvenuto");
        probl.setHeaderText("Benvenuto");
        probl.setContentText("la quinta area di competenza riguarderà Sicurezza");
        toggleGroup = new ToggleGroup();
        radioButtona.setToggleGroup(toggleGroup);
        radioButtonb.setToggleGroup(toggleGroup);
        radioButtonc.setToggleGroup(toggleGroup);
        radioButtond.setToggleGroup(toggleGroup);
        setDomanda(1,1);

    }
        @FXML
        public void indovina() throws Exception {
            if(toggleGroup.getSelectedToggle()!=null) {
                cont++;
                toggle = toggleGroup.getSelectedToggle();
                RadioButton radioButton = (RadioButton) toggle;
                selezione = radioButton.getText();

                switch (cont) {
                    case 1:
                        if (selezione.equals(corretta)) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Congratulazioni");
                            alert.setHeaderText("Congratulazioni");
                            alert.setContentText("Il livello base 1 è stato passato può procedere al livello base 2 \n le saranno chieste 2 domande stavolta");
                            alert.showAndWait();
                            setDomanda(area, 2);
                        }else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            setLivello(area,"base 1");
                            alert.setTitle("Congratulazioni");
                            alert.setHeaderText("Congratulazioni");
                            alert.setContentText("il suo livello di certificazione per questa area è base 1");
                            alert.showAndWait();
                            resetArea();

                        }
                        break;
                    case 2:
                       conferma.showAndWait();
                        if (selezione.equals(corretta)) {
                           setDomanda(area, 2);
                           intermed++;
                        }else {
                            setDomanda(area, 2);
                        }
                        break;
                    case 3:
                        if (selezione.equals(corretta)) {
                            if(intermed==0){
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Congratulazioni");
                                alert.setHeaderText("Congratulazioni");
                                alert.setContentText("il suo livello di certificazione per questa area è base 2");
                                alert.showAndWait();
                                switch (area){
                                    case 1:
                                        alf = "base 2";
                                        break;
                                    case 2:
                                        com = "base 2";
                                        break;
                                    case 3:
                                        creaz = "base 2";
                                        break;
                                    case 4:
                                        sicurezza = "base 2";
                                        break;
                                    case 5:
                                        problemi = "base 2";
                                        break;
                                }
                                resetArea();

                            }else if (selezione.equals(corretta)) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Congratulazioni");
                                alert.setHeaderText("Congratulazioni");
                                alert.setContentText("livello base 2 completato, può proseguire con intermedio 2");
                                alert.showAndWait();
                                setDomanda(area,3);
                            }

                        }else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Congratulazioni");
                            alert.setHeaderText("Congratulazioni");
                            alert.setContentText("il suo livello di certificazione per questa area è base 2");
                            alert.showAndWait();
                            switch (area){
                                case 1:
                                    alf = "base 2";
                                    break;
                                case 2:
                                    com = "base 2";
                                    break;
                                case 3:
                                    creaz = "base 2";
                                    break;
                                case 4:
                                    sicurezza = "base 2";
                                    break;
                                case 5:
                                    problemi = "base 2";
                                    break;
                            }
                            resetArea();

                        }
                       break;
                    case 4: // intermedio 3
                        conferma.showAndWait();// primo messaggio
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        setDomanda(area,3);
                        break;
                    case 5:
                        conferma.showAndWait();//secondo messaggio
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        setDomanda(area,3);
                        break;
                    case 6:
                        conferma.showAndWait();
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        setDomanda(area,3);
                        break;
                    case 7:
                        conferma.showAndWait();
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        if(intermed>=3){
                            //passa al livello intermedio 4
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Congratulazioni");
                            alert.setHeaderText("Congratulazioni");
                            alert.setContentText("è possibile procedere al livello intermedio 4");
                            alert.showAndWait();
                            intermed=0;
                            setDomanda(area,4);

                        }else{
                           Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Congratulazioni");
                            alert.setHeaderText("Congratulazioni");
                            alert.setContentText("livello di certificazione raggiunto per questa area: intermedio 3");
                            alert.showAndWait();
                            switch(area){
                                case 1:
                                    alf = "intermedio 3";
                                    break;
                                case 2:
                                    com = "intermedio 3";
                                    break;
                                case 3:
                                    creaz = "intermedio 3";
                                    break;
                                case 4:
                                    sicurezza = "intermedio 3";
                                    break;
                                case 5:
                                    problemi = "intermedio 3";
                                    break;
                            }
                            resetArea();
                        }
                        break;
                    case 8:
                        conferma.showAndWait();
                        if (selezione.equals(corretta)) { // primo messaggio
                            intermed++;
                        }
                        setDomanda(area,4);
                        break;
                    case 9:
                        conferma.showAndWait();
                        if (selezione.equals(corretta)) { // secondo messaggio
                            intermed++;
                        }
                        setDomanda(area,4);
                        break;
                    case 10:
                        conferma.showAndWait();
                        if (selezione.equals(corretta)) { // terzo messaggio
                            intermed++;
                        }
                        setDomanda(area,4);
                        break;
                    case 11:
                        conferma.showAndWait();
                        if (selezione.equals(corretta)) {//quarto messaggio
                            intermed++;
                        }
                        if(intermed>=3){
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Information");
                            alert.setHeaderText("Information");
                            alert.setContentText("ha raggiunto il livello massimo ottenibile: Avanzato 5");
                            alert.showAndWait();
                            switch (area){
                                case 1:
                                    alf = "avanzato 5";
                                    break;
                                case 2:
                                    com = "avanzato 5";
                                    break;
                                case 3:
                                    creaz = "avanzato 5";
                                    break;
                                case 4:
                                    sicurezza = "avanzato 5";
                                    break;
                                case 5:
                                    problemi = "avanzato 5";
                                    break;
                                default:
                                    System.out.println("ma non è che va qua??");
                                    break;
                            }
                            resetArea();
                        }else{
                            //dai intermedio 4
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Information");
                            alert.setHeaderText("Information");
                            alert.setContentText("il livello da lei ottenuto per questa area è: Intermedio 4");
                            alert.showAndWait();
                            switch (area){
                                case 1:
                                    alf = "intermedio 4";
                                    break;
                                case 2:
                                    com = "intermedio 4";
                                    break;
                                case 3:
                                    creaz = "intermedio 4";
                                    break;
                                case 4:
                                    sicurezza = "intermedio 4";
                                    break;
                                case 5:
                                    problemi = "intermedio 4";
                                    break;

                            }
                            resetArea();
                        }
                }


            }else{
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Errore");
               alert.setHeaderText("Errore");
                alert.setContentText("seleziona una risposta");
                alert.showAndWait();
            }
        }
        @FXML
        public Button btnIndovina;
        @FXML
        public void mostraMsg() {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("benvenuto");
            alert.setHeaderText("Benvenuto nel testing AICA digComp2.2");
            alert.setContentText("inizierai dalla prima area: Alfabetizzazione su informazioni e dati \n tempo limite: 90 minuti");
            alert.showAndWait();
        }
        @FXML
        public void setDomanda(int Area,int livello) throws Exception{
            toggleGroup.selectToggle(null);
            idgen =db.idDomandaCasuale(Area,livello);
            txtDomanda.setText(db.getDomanda(idgen));
            String answer = db.rispostaCorr(idgen);
            ArrayList<String> answers = new ArrayList<>();
            String rispostesb[];
            rispostesb= db.risposteSbagliate(idgen);
            answers.add(answer);
            answers.add(rispostesb[0]);
            answers.add(rispostesb[1]);
            answers.add(rispostesb[2]);
            Collections.shuffle(answers);
            corretta = db.rispostaCorr(idgen);
            radioButtona.setText(answers.get(0));
            radioButtonb.setText(answers.get(1));
            radioButtonc.setText(answers.get(2));
            radioButtond.setText(answers.get(3));
        }
        @FXML
        public void resetArea() throws Exception{
            area++;
            cont=0;
            intermed= 0;
            switch(area){
                case 2:
                    comunicazione.showAndWait();
                    break;
                case 3:
                    creazione.showAndWait();
                    break;
                case 4:
                    sic.showAndWait();
                    break;
                case 5:
                    probl.showAndWait();
                    break;
                case 6:
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Risultati");
                    alert.setHeaderText("Risultati");
                    alert.setContentText("congratulazioni, hai finito il test. procederai al risultato");
                    alert.showAndWait();
                    System.out.println(alf);
                    System.out.println(com);
                    System.out.println(creaz);
                    System.out.println(sicurezza);
                    System.out.println(problemi);
                    a=alf;
                    b=com;
                    c=creaz;
                    d=sicurezza;
                    e=problemi;

                    apriSecondoStage();
            }
            if(area!=6){
                setDomanda(area,1);
            }
        }
    private void apriSecondoStage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("schermata_finale.fxml"));
            Parent root = loader.load();

            // Crea e mostra il nuovo stage
            Stage nuovoStage = new Stage();
            nuovoStage.setTitle("Seconda Finestra");
            nuovoStage.setScene(new Scene(root));
            nuovoStage.show();
            schermatafinale_controller controller = loader.getController();
            controller.setAlf(alf);


            // Chiudi lo stage corrente cercando lo stage attivo tra tutte le finestre
            for (Window window : Stage.getWindows()) {
                if (window.isShowing() && window != nuovoStage) {
                    ((Stage) window).close();
                    break; // chiudiamo solo la finestra attuale
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getalf(){
            return a;
    }
    public String getcom(){
        return b;
    }
    public String getcreaz(){
            return c;
    }
    public String getsic(){
            return d;
    }
    public String getprob(){
            return e;
    }
    public void setLivello(int area, String livello) throws Exception{
            switch (area){
                case 1->alf=livello;
                case 2->com=livello;
                case 3->creaz=livello;
                case 4->sicurezza=livello;
                case 5->problemi=livello;
            }
    }


}




