package org.example.digicomp_domande;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
        probl.setContentText("la quarta area di competenza riguarderà Sicurezza");
        toggleGroup = new ToggleGroup();
        radioButtona.setToggleGroup(toggleGroup);
        radioButtonb.setToggleGroup(toggleGroup);
        radioButtonc.setToggleGroup(toggleGroup);
        radioButtond.setToggleGroup(toggleGroup);
        setDomanda(1,1);

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
                                    problemi = "base 1";
                                    break;
                            }
                            area++;
                            cont=0;
                            //vabbè di qua fai la gen per l'area 2 con l'alert
                            switch(area){
                                case 2:

                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                            }
                        }
                        break;
                    case 2:
                       conferma.showAndWait();
                        if (selezione.equals(corretta)) {
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
                        }else {
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
                                cont= 0;
                                area++;
                                intermed= 0;
                                // qua sempre la gen con lo switch per i messaggi

                            }else if (selezione.equals(corretta)) {
                                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                                alert.setTitle("Congratulazioni");
                                alert.setHeaderText("Congratulazioni");
                                alert.setContentText("livello base 2 completato, può proseguire con intermedio 2");
                                alert.showAndWait();
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
                            area++;
                            cont=0;
                            intermed= 0;
                            // sempre qua messaggi in base all'area con la generazione

                        }
                       break;
                    case 4: // intermedio 3
                        conferma.showAndWait();// primo messaggio
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
                        conferma.showAndWait();//secondo messaggio
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
                        conferma.showAndWait();
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
                            area++;
                            cont = 0;
                            intermed = 0;
                            // qua sempre la gen con la nuova area
                        }
                        break;
                    case 8:
                        conferma.showAndWait();
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
                        conferma.showAndWait();
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
                        conferma.showAndWait();
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
                            }
                            area++;
                            intermed= 0;
                            cont= 0;
                            // sempre la gen
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
}




