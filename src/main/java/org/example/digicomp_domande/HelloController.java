package org.example.digicomp_domande;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.digicomp_domande.*;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
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
    String prob;
    String selezione;
    String corretta;
    database db = new database();

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
    public void initialize() throws SQLException, ClassNotFoundException {
        db.connect();
        toggleGroup = new ToggleGroup();
        radioButtona.setToggleGroup(toggleGroup);
        radioButtonb.setToggleGroup(toggleGroup);
        radioButtonc.setToggleGroup(toggleGroup);
        radioButtond.setToggleGroup(toggleGroup);
        idgen =db.idDomandaCasuale(1,1);
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
        public void indovina() throws SQLException, ClassNotFoundException {
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
                            toggleGroup.selectToggle(null);
                            idgen =db.idDomandaCasuale(area,2);
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
                        }else {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Congratulazioni");
                            alert.setHeaderText("Congratulazioni");
                            alert.setContentText("il suo livello di certificazione per questa area è base 1");
                            alert.showAndWait();
                            toggleGroup.selectToggle(null);
                            switch (area){
                                case 1:
                                    alf = "base 1";
                                    break;
                                case 2:
                                    com = "base 1";
                                case 3:
                                    creaz = "base 1";
                                    break;
                                case 4:
                                    sicurezza = "base 1";
                                    break;
                                case 5:
                                    prob = "base 1";
                                    break;
                            }
                            area++;
                            cont=0;
                            //vabbè di qua fai la gen per l'area 2 con l'alert
                        }
                        break;
                    case 2:
                        Alert  alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("attenzione");
                        alert.setContentText("risposta inviata");
                        alert.showAndWait();
                        if (selezione.equals(corretta)) {
                            System.out.println("ma va qua??");
                            toggleGroup.selectToggle(null);
                            idgen =db.idDomandaCasuale(area,2);
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
                            intermed++;
                        }// va qua vabbè devi generare comunque le domande
                        break;
                    case 3:
                        if (selezione.equals(corretta)) {
                            if(intermed==0){
                                //niente dai base 2 con l'alert

                            }else {
                                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                                alert1.setTitle("Congratulazioni");
                                alert1.setHeaderText("Congratulazioni");
                                alert1.setContentText("livello base 2 completato, può proseguire con intermedio 2");
                                alert1.showAndWait();
                                toggleGroup.selectToggle(null);
                                intermed= 0;
                                idgen =db.idDomandaCasuale(area,3);
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

                        }else {
                            // vabbè qua niente sempre dai base 2
                        }
                       break;
                    case 4:
                        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
                        alert2.setHeaderText("attenzione");
                        alert2.setContentText("risposta inviata");
                        alert2.showAndWait();// primo messaggio
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        toggleGroup.selectToggle(null);
                        idgen =db.idDomandaCasuale(area,3);      //seconda generazione
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
                        break;
                    case 5:
                        Alert  alert3 = new Alert(Alert.AlertType.INFORMATION);
                        alert3.setHeaderText("attenzione");
                        alert3.setContentText("risposta inviata");
                        alert3.showAndWait();//secondo messaggio
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        toggleGroup.selectToggle(null);
                        idgen =db.idDomandaCasuale(area,3);      //terza generazione
                        txtDomanda.setText(db.getDomanda(idgen));
                        answer = db.rispostaCorr(idgen);
                        answers = new ArrayList<>();
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
                        break;
                    case 6:
                        Alert  alert4 = new Alert(Alert.AlertType.INFORMATION);
                        alert4.setHeaderText("attenzione");
                        alert4.setContentText("risposta inviata");
                        alert4.showAndWait();
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        toggleGroup.selectToggle(null);
                        idgen =db.idDomandaCasuale(area,3);      //quarta generazione
                        txtDomanda.setText(db.getDomanda(idgen));
                        answer = db.rispostaCorr(idgen);
                        answers = new ArrayList<>();
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
                        break;
                    case 7:
                        Alert  alert5 = new Alert(Alert.AlertType.INFORMATION);
                        alert5.setHeaderText("attenzione");
                        alert5.setContentText("risposta inviata");
                        alert5.showAndWait();
                        if (selezione.equals(corretta)) {
                            intermed++;
                        }
                        if(intermed>=3){
                            //passa al livello intermedio 4
                            toggleGroup.selectToggle(null);
                            intermed=0;
                            idgen =db.idDomandaCasuale(area,4);      //prima generazione
                            txtDomanda.setText(db.getDomanda(idgen));
                            answer = db.rispostaCorr(idgen);
                            answers = new ArrayList<>();
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

                        }else{
                            // dai intermedio 3
                        }
                        break;
                    case 8:
                        Alert  alert6 = new Alert(Alert.AlertType.INFORMATION);
                        alert6.setHeaderText("attenzione");
                        alert6.setContentText("risposta inviata");
                        alert6.showAndWait();
                        if (selezione.equals(corretta)) { // primo messaggio
                            intermed++;
                        }
                        toggleGroup.selectToggle(null);
                        idgen =db.idDomandaCasuale(area,4);      //seconda generazione
                        txtDomanda.setText(db.getDomanda(idgen));
                        answer = db.rispostaCorr(idgen);
                        answers = new ArrayList<>();
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
                        break;
                    case 9:
                        Alert  alert7 = new Alert(Alert.AlertType.INFORMATION);
                        alert7.setHeaderText("attenzione");
                        alert7.setContentText("risposta inviata");
                        alert7.showAndWait();
                        if (selezione.equals(corretta)) { // secondo messaggio
                            intermed++;
                        }
                        toggleGroup.selectToggle(null);
                        idgen =db.idDomandaCasuale(area,4);      //terza generazione
                        txtDomanda.setText(db.getDomanda(idgen));
                        answer = db.rispostaCorr(idgen);
                        answers = new ArrayList<>();
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
                        break;
                    case 10:
                        Alert  alert8 = new Alert(Alert.AlertType.INFORMATION);
                        alert8.setHeaderText("attenzione");
                        alert8.setContentText("risposta inviata");
                        alert8.showAndWait();
                        if (selezione.equals(corretta)) { // terzo messaggio
                            intermed++;
                        }
                        toggleGroup.selectToggle(null);
                        idgen =db.idDomandaCasuale(area,4);      //quarta generazione
                        txtDomanda.setText(db.getDomanda(idgen));
                        answer = db.rispostaCorr(idgen);
                        answers = new ArrayList<>();
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
                        break;
                    case 11:// la prossima area va comunque generata qua
                        Alert  alert9 = new Alert(Alert.AlertType.INFORMATION);
                        alert9.setHeaderText("attenzione");
                        alert9.setContentText("risposta inviata");
                        alert9.showAndWait();
                        if (selezione.equals(corretta)) {//quarto messaggio
                            intermed++;
                        }
                        if(intermed>=3){
                            //dai avanzato 5
                            area++;
                            intermed= 0;
                            cont= 0;
                        }else{
                            //dai intermedio 4
                            area++;
                            intermed = 0;
                            cont= 0;
                        }
                        if(area ==5){
                            // vai alla pagina di certificazione
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
}




