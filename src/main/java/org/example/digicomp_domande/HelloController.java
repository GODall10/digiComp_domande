package org.example.digicomp_domande;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
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
    public void initialize(){
        txtDomanda.setText("Domanda!");
        toggleGroup = new ToggleGroup();
        radioButtona.setToggleGroup(toggleGroup);
        radioButtonb.setToggleGroup(toggleGroup);
        radioButtonc.setToggleGroup(toggleGroup);
        radioButtond.setToggleGroup(toggleGroup);
        }
        @FXML
        public void indovina() {
            System.out.println(toggleGroup.getSelectedToggle());
        }
        @FXML
        public Button btnIndovina;

        }




