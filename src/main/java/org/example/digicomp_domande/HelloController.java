package org.example.digicomp_domande;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class HelloController {
    int gen1;
    int gen2;
    int gen3;
    int gen4;
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
    public void initialize() {
        txtDomanda.setText("Domanda!");
        toggleGroup = new ToggleGroup();
        radioButtona.setToggleGroup(toggleGroup);
        radioButtonb.setToggleGroup(toggleGroup);
        radioButtonc.setToggleGroup(toggleGroup);
        radioButtond.setToggleGroup(toggleGroup);
        ArrayList<Integer>numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(4);
        Collections.shuffle(numeri);
        gen1 = numeri.get(0);
        gen2 = numeri.get(1);
        gen3 = numeri.get(2);
        gen4 = numeri.get(3);
        System.out.println("gen1 = " + gen1+ " gen2 = " + gen2+ " gen3 = " + gen3+ " gen4 = " + gen4);
        radioButtona.setText(String.valueOf(gen1));
        radioButtonb.setText(String.valueOf(gen2));
        radioButtonc.setText(String.valueOf(gen3));
        radioButtond.setText(String.valueOf(gen4));
        String answer = String.valueOf(gen1);

    }
        @FXML
        public void indovina() {
            System.out.println(toggleGroup.getSelectedToggle());
        }
        @FXML
        public Button btnIndovina;

        }




