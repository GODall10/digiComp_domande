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
    int area;
    int currid;
    int cont;
    int idgen;
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
        public void indovina() {
            if(toggleGroup.getSelectedToggle()!=null) {
                cont++;
                switch (cont) {
                    case 1:
                        System.out.println("ciao");
                        break;
                    case 2:
                        System.out.println("vediamo");
                        break;
                }
                toggle = toggleGroup.getSelectedToggle();
               RadioButton radioButton = (RadioButton) toggle;
               selezione = radioButton.getText();
               if (selezione.equals(corretta)) {
                   System.out.println("corretta");
               }else {
                   System.out.println("sbagliata");
               }


            }else{
                System.out.println("qualcosa");
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




