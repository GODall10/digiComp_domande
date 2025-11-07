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
    int gen1;
    int gen2;
    int gen3;
    int gen4;
    int indexwin;
    String selezione;
    String corretta;
    database db = new database();
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
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
    @FXML
    public void initialize() throws SQLException, ClassNotFoundException {
        db.connect();
        txtDomanda.setText("Domanda!");
        toggleGroup = new ToggleGroup();
        radioButtona.setToggleGroup(toggleGroup);
        radioButtonb.setToggleGroup(toggleGroup);
        radioButtonc.setToggleGroup(toggleGroup);
        radioButtond.setToggleGroup(toggleGroup);
        String answer = db.rispostaCorr(1,1,1,1);
        ArrayList<String> answers = new ArrayList<>();
        String rispostesb[];
        rispostesb= db.risposteSbagliate(1);
        answers.add(answer);
        answers.add(rispostesb[0]);
        answers.add(rispostesb[1]);
        answers.add(rispostesb[2]);
        Collections.shuffle(answers);
        corretta = db.rispostaCorr(1,1,1,1);
        System.out.println(answers);
        radioButtona.setText(answers.get(0));
        radioButtonb.setText(answers.get(1));
        radioButtonc.setText(answers.get(2));
        radioButtond.setText(answers.get(3));
        txtDomanda.setText(db.getDomanda(1));
        int idgen =db.idDomandaCasuale(1,1);
        System.out.println(db.getDomanda(idgen));
        db.chiudiTabella();
    }
        @FXML
        public void indovina() {
            System.out.println(toggleGroup.getSelectedToggle());
            if(radioButtona.isSelected()){
                selezione = radioButtona.getText();
                if(!selezione.equals(corretta)){
                    System.out.println("risposta sbagliata");
                }else if(selezione.equals(corretta)){
                    System.out.println("risposta corretta");
                }
            }else if(radioButtonb.isSelected()){
                selezione = radioButtonb.getText();
                if(!selezione.equals(corretta)){
                    System.out.println("risposta sbagliata");
                }else if(selezione.equals(corretta)){
                    System.out.println("risposta corretta");
                }
            }else if (radioButtonc.isSelected()){
                selezione = radioButtonc.getText();
                if(!selezione.equals(corretta)){
                    System.out.println("risposta sbagliata");
                }else if(selezione.equals(corretta)){
                    System.out.println("risposta corretta");
                }
            }else if (radioButtond.isSelected()){
                selezione = radioButtond.getText();
                if(!selezione.equals(corretta)){
                    System.out.println("risposta sbagliata");
                }else if(selezione.equals(corretta)){
                    System.out.println("risposta corretta");
                }
            }
        }
        @FXML
        public Button btnIndovina;
        }




