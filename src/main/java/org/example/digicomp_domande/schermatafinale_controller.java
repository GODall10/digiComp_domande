package org.example.digicomp_domande;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.example.digicomp_domande.*;

import java.sql.SQLException;

public class schermatafinale_controller {
    HelloController app = new HelloController();
    String alf;
    String com;
    String creaz;
    String sic;
    String prob;
    int a, b, c, d, e;
    int somma;
    int risultato;
    String ris;
    String username;
    db_certificazione db = new db_certificazione();
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
    Utils utils = new Utils();

    @FXML
    public void genera() throws SQLException {
        db.connect();
        username = utils.getUsername();
        alfabetizzazione.setText(alf);
        comunicazione.setText(com);
        creazione.setText(creaz);
        sicurezza.setText(sic);
        problemi.setText(prob);
        a = calcoloMedia(alf);
        b = calcoloMedia(com);
        c = calcoloMedia(creaz);
        d = calcoloMedia(sic);
        e = calcoloMedia(prob);
        somma = a + b + c + d + e;
        risultato = Math.round(somma / 5);
        switch (risultato) {
            case 1:
                ris = "base 1";
                break;
            case 2:
                ris = "base 2";
                break;
            case 3:
                ris = "intermedio 3";
                break;
            case 4:
                ris = "intermedio 4";
                break;
            case 5:
                ris = "avanzato 5";
                break;
        }
        System.out.println(ris);
        generale.setText(ris);
        db.insertRisultati(username, alf, com, creaz, sic, prob, ris);
        db.chiudiTabella();


    }

    public void setAlf(String livello) {
        alf = livello;
    }

    public void setCom(String livello) {
        com = livello;
    }

    public void setCreaz(String livello) {
        creaz = livello;
    }

    public void setSicurezza(String livello) {
        sic = livello;
    }

    public void setProb(String livello) {
        prob = livello;
    }

    public void setUsername(String user) {
        username = user;
    }

    public int calcoloMedia(String area) {
        switch (area) {
            case "base 1":
                return 1;
            case "base 2":
                return 2;
            case "intermedio 3":
                return 3;
            case "intermedio 4":
                return 4;
            case "avanzato 5":
                return 5;
            default:
                return -1;
        }

    }
}
