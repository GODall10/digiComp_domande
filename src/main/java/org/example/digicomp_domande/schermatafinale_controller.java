package org.example.digicomp_domande;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class schermatafinale_controller {
    HelloController app = new HelloController();
    String alf;
    String com;
    String creaz;
    String sic;
    String prob;
    int a,b,c,d,e;
    int somma;
    int risultato;
    String ris;
    @FXML
    private TextField alfabetizzazione;
    @FXML
    private TextField comunicazione;
    @FXML
    private TextField creazione;
    @FXML
    private TextField sicurezza;
    @FXML
    private TextField problemi;
    @FXML
    private TextField generale;
    @FXML
    private Button genera;
    @FXML
    public void genera(){
        alfabetizzazione.setText(alf);
        comunicazione.setText(com);
        creazione.setText(creaz);
        sicurezza.setText(sic);
        problemi.setText(prob);
        switch (alf){
            case "base 1":
                a=1;
                break;
            case "base 2":
                a=2;
                break;
            case "intermedio 3":
                a=3;
                break;
            case "intermedio 4":
                a=4;
                break;
            case "avanzato 5":
                a=5;
                break;
        }
        switch (com){
            case "base 1":
                b=1;
                break;
            case "base 2":
                b=2;
                break;
            case "intermedio 3":
                b=3;
                break;
            case "intermedio 4":
                b=4;
                break;
            case "avanzato 5":
                b=5;
                break;
        }
        switch (creaz) {
            case "base 1":
                c = 1;
                break;
            case "base 2":
                c = 2;
                break;
            case "intermedio 3":
                c = 3;
                break;
            case "intermedio 4":
                c = 4;
                break;
            case "avanzato 5":
                c = 5;
                break;
        }
        switch(sic){
            case "base 1":
                d=1;
                break;
            case "base 2":
                d=2;
                break;
            case "intermedio 3":
                d=3;
                break;
            case "intermedio 4":
                d=4;
                break;
            case "avanzato 5":
                d=5;
                break;
        }
        switch(prob){
            case "base 1":
                e=1;
                break;
            case "base 2":
                e=2;
                break;
            case "intermedio 3":
                e=3;
                break;
            case "intermedio 4":
                e=4;
                break;
            case "avanzato 5":
                e=5;
                break;
        }
        somma=a+b+c+d+e;
        risultato=Math.round(somma/5);
        switch(risultato){
            case 1:
                ris="base 1";
                generale.setText(ris);
                break;
            case 2:
                ris="base 2";
                generale.setText(ris);
                break;
            case 3:
                ris ="intermedio 3";
                generale.setText(ris);
                break;
            case 4:
                ris ="intermedio 4";
                generale.setText(ris);
                break;
            case 5:
                ris ="avanzato 5";
                generale.setText(ris);
                break;
        }


    }
    public void setAlf(String livello){
        alf=livello;
    }
    public void setCom(String livello){
        com=livello;
    }
    public void setCreaz(String livello){
        creaz=livello;
    }
    public void setSicurezza(String livello){
        sic=livello;
    }
    public void setProb(String livello){
        prob=livello;
    }
}
