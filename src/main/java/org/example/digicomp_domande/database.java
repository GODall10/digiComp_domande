package org.example.digicomp_domande;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database {

    // 🔹 Costanti di connessione
    private final static String URL = "jdbc:mysql://database-1.cx0gqu8gcqef.eu-central-1.rds.amazonaws.com:3306/login"
            + "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private final static String USER = "admin";
    private final static String PASSWORD = "Alessio12$";
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";

    // 🔹 Query SQL
    private final static String CREATE_TABLE = """
            CREATE TABLE tabella (
                id MEDIUMINT NOT NULL AUTO_INCREMENT,
                domanda varchar(255) NOT NULL,
                risposta_corr varchar(255) NOT NULL,
                risposte_sbagliate varchar(1000) not null,
                area integer not null,
                livello integer not null,
                PRIMARY KEY (id)
            );
    
            
            """;

    private final static String DROP_TABLE = "DROP TABLE IF EXISTS tabella";
    private static String INSERT = "INSERT INTO tabella (domanda) VALUES (?)";
    private final static String SELECT = "SELECT * FROM tabella";


    private static Connection conn;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    /*public static void main(String[] args) {

        try {
            // Carico il driver (opzionale nelle versioni moderne, ma buono per compatibilità)
            Class.forName(DRIVER);

            // Apro la connessione
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Connessione riuscita!");

            // Inizializzo Statement e PreparedStatement
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(INSERT);

            // Esempio di utilizzo

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    //  Metodo per creare la tabella
    private static void creaTabella() throws SQLException {
        stmt.executeUpdate(DROP_TABLE);
        stmt.executeUpdate(CREATE_TABLE);
    }

    // Metodo per inserire un record
    // Metodo per inserire una riga completa nella tabella
    private static void inserisciDomanda(String domanda, String rispostaCorr, String risposteSbagliate, int area, int livello) throws SQLException {
        String INSERT = "INSERT INTO tabella (domanda, risposta_corr, risposte_sbagliate, area, livello) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(INSERT)) {
            pstmt.setString(1, domanda);
            pstmt.setString(2, rispostaCorr);
            pstmt.setString(3, risposteSbagliate);
            pstmt.setInt(4, area);
            pstmt.setInt(5, livello);
            pstmt.executeUpdate();
        }
    }



    // Metodo per visualizzare tutti i dati nella tabella
    private static void mostraDati() throws SQLException {
        String SELECT = "SELECT * FROM tabella";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT)) {

            System.out.println("\n Dati nella tabella:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Domanda: " + rs.getString("domanda") +
                        " | Risposta corretta: " + rs.getString("risposta_corr") +
                        " | Risposte sbagliate: " + rs.getString("risposte_sbagliate") +
                        " | Area: " + rs.getInt("area") +
                        " | Livello: " + rs.getInt("livello"));
            }
        }
    }
    public static void chiudiTabella(){
        try {
            if (pstmt != null) pstmt.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("Connessione chiusa.");
        } catch (SQLException e) { e.printStackTrace();
        }
    }
    public static String rispostaCorr(int id) throws SQLException {
        String SELECT = "SELECT risposta_corr FROM tabella WHERE id = ? ";
        try (PreparedStatement pstmt = conn.prepareStatement(SELECT)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("risposta_corr"); // Leggi la colonna
                } else {
                    return null; // Nessun record trovato
                }}}}

    public static String[] risposteSbagliate(int id) throws SQLException {
        String SELECT = "SELECT risposte_sbagliate FROM tabella WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(SELECT)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String risposte = rs.getString("risposte_sbagliate");
                    // Dividi la stringa in array, separando per virgola e spazio
                    String[] split = risposte.split(",\\s*");
                    return split;
                }else {
                    return null;
                }}}}
    public static String getDomanda(int id) throws SQLException {
        String SELECT = "SELECT domanda FROM tabella WHERE id=?";
        try (PreparedStatement pstmt = conn.prepareStatement(SELECT)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("domanda");
                }else  {
                    return null;
                }}}}
public static void connect() throws SQLException, ClassNotFoundException {
    if (conn == null || conn.isClosed()) {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        stmt = conn.createStatement();
        pstmt = conn.prepareStatement(INSERT);
        creaTabella();
        inserisciDomanda(
                "Che cos’è un browser?",
                "Un programma che permette di navigare su Internet",
                "Un motore di ricerca, Un sistema operativo, Un social network",
                1,
                1);
        inserisciDomanda(
                "Che cosa indica il dominio .gov in un sito web?",
                "Un sito appartenente a un ente governativo",
                "Un sito scolastico, Un social network, Un blog personale",
                1,
                2
        );
        inserisciDomanda(
                "Come si verifica l’affidabilità di una fonte online?",
                "Controllando autore, data e dominio del sito",
                "Guardando solo le immagini, Se ha molti commenti, Se appare su social media",
                1,
                3
        );
        inserisciDomanda(
                "Che cosa si intende per ‘algoritmo di raccomandazione’?",
                "Un sistema che suggerisce contenuti in base ai dati dell’utente",
                "Un programma di traduzione, Un antivirus, Un file di configurazione",
                1,
                4
        );
        inserisciDomanda(
                "Come si può verificare l’autenticità di un documento digitale?",
                "Controllando la firma digitale o il certificato del documento",
                "Guardando il nome del file, Stampandolo, Condividendolo online",
                1,
                4
        );
        inserisciDomanda(
                "Cosa rappresenta l’icona della lente di ingrandimento in un sito web?",
                "Lo strumento di ricerca",
                "\"Il pulsante per chiudere\", \"Il menu delle impostazioni\", \"Il tasto di download\"",
                1,
                1
        );
        inserisciDomanda(
                "Qual è lo scopo principale di una email?",
                "Comunicare messaggi in forma scritta",
                "Creare video, Modificare documenti, Disegnare immagini",
                2,
                1
        );
        inserisciDomanda(
                "Qual è lo scopo principale di un editor di testo?",
                "Scrivere e modificare documenti",
                "Creare video, Modificare immagini, Gestire email",
                3,
                1
        );
        inserisciDomanda(
                "Cosa significa avere una password sicura?",
                "Usare una combinazione di lettere, numeri e simboli",
                "Usare solo il proprio nome, Scrivere la password su un foglio, Usare solo numeri facili da ricordare",
                4,
                1
        );
        inserisciDomanda(
                "Cosa fare se il computer non si accende?",
                "Verificare l’alimentazione e i cavi collegati",
                "Reinstallare il sistema operativo subito, Cercare virus online, Cambiare il mouse",
                5,
                1
        );
        inserisciDomanda(
                "Qual è un vantaggio principale dei calendari condivisi online?",
                "Permettono di coordinare riunioni e scadenze tra più persone",
                "Proteggono il computer dai virus, Creano backup automatici, Modificano i file PDF",
                2,
                2
        );
        inserisciDomanda(
                "Cosa significa ‘protocollo di comunicazione’ in informatica?",
                "Regole che consentono lo scambio di informazioni tra sistemi",
                "Un tipo di computer, Un software di grafica, Un file musicale",
                2,
                3
        );
        inserisciDomanda(
                "Cosa significa ‘gestione dei conflitti online’?",
                "Risolvere controversie tra utenti rispettando le regole",
                "Cancellare tutti i messaggi, Bloccare gli utenti a caso, Modificare il contenuto del server",
                2,
                4
        );
        inserisciDomanda(
                "Quale funzione permette di ridimensionare un’immagine senza distorcerla?",
                "Mantieni proporzioni",
                "Ritaglia automatico, Inverti colori, Duplica livello",
                3,
                2
        );
        inserisciDomanda(
                "Cosa significa ‘effetto trasparenza’ in un’immagine?",
                "Rendere parti dell’immagine semi-trasparenti",
                "Modificare solo il colore, Aumentare la dimensione del file, Bloccare il livello",
                3,
                3
        );
        inserisciDomanda(
                "Cosa significa 'masking avanzato' in grafica digitale?",
                "Applicare maschere precise per modificare parti specifiche dell’immagine",
                "Stampare un’immagine, Ridurre il peso del file, Aggiungere filtri automatici",
                3,
                4
        );
        inserisciDomanda(
                "Qual è la funzione di un backup regolare?",
                "Salvare copie dei dati per proteggerli da perdita",
                "Aumentare la velocità del computer, Cancellare file vecchi, Modificare la password automaticamente",
                4,
                2
        );
        inserisciDomanda(
                "Cosa significa sniffing di rete?",
                "Intercettare e analizzare i dati che transitano in rete",
                "Stampare dati online, Cancellare dati dal server, Bloccare virus locali",
                4,
                3
        );
        inserisciDomanda(
                "Cosa significa sandboxing?",
                "Eseguire programmi in un ambiente isolato per testare o contenere minacce",
                "Eliminare tutti i virus, Aggiornare sistema operativo, Cancellare file temporanei",
                4,
                4
        );
        inserisciDomanda(
                "Cosa fare se il browser non carica pagine?",
                "Verificare la connessione e cancellare cache e cookie",
                "Spegnere il computer, Cambiare monitor, Disinstallare il sistema operativo",
                5,
                2
        );
        inserisciDomanda(
                "Cosa fare se un software mostra errori sconosciuti?",
                "Consultare il log degli errori e la documentazione ufficiale",
                "Disinstallare tutto il computer, Ignorare l’errore, Spegnere il monitor",
                5,
                3
        );
        inserisciDomanda(
                "Come risolvere problemi complessi di rete aziendale?",
                "Analizzare topologia, log dei dispositivi e configurazioni avanzate",
                "Spegnere tutti i computer, Cambiare solo i cavi, Ignorare il problema",
                5,
                4
        );




    }
}
    public static int idDomandaCasuale(int area,int livello)throws SQLException, ClassNotFoundException {
        String SELECT = "SELECT id FROM tabella WHERE area=? AND livello= ? ORDER BY RAND() LIMIT 1";
        try (PreparedStatement pstmt = conn.prepareStatement(SELECT)) {
            pstmt.setInt(1, area);
            pstmt.setInt(2, livello);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }else{
                    return -1;
                }
            }
        }
    }
}
