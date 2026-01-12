package org.example.digicomp_domande;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database {

    // 🔹 Costanti di connessione
    private final static String URL = "jdbc:mysql://api.lestingi.it:3306/database";
    private final static String USER = "alessio";
    private final static String PASSWORD = "UYTrfu56yljk!IYJU5";
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

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

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
        creaTabella();
        connect();
        chiudiTabella();
    }

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
        inserisciDomanda(
                "Cosa significa ‘cliccare su un link’?",
                "Aprire una nuova pagina o risorsa collegata",
                "Cancellare un file, Creare un collegamento, Aprire le impostazioni",
                1,
                1
        );

        inserisciDomanda(
                "Che cos’è un motore di ricerca?",
                "Un servizio online per trovare informazioni su Internet",
                "Un programma per disegnare, Un’app di messaggistica, Un antivirus",
                1,
                1
        );

        inserisciDomanda(
                "Cosa indica l’estensione .pdf?",
                "Un documento portatile leggibile su molti dispositivi",
                "Un’immagine, Un file audio, Un video",
                1,
                1
        );

        inserisciDomanda(
                "Che cos’è un file?",
                "Un insieme di dati salvato su un dispositivo",
                "Un tipo di connessione Internet, Una password, Un programma di posta elettronica",
                1,
                1
        );

        inserisciDomanda(
                "Cosa significa ‘scaricare un file’?",
                "Copiare un file da Internet al proprio dispositivo",
                "Cancellare un file, Condividere un file, Criptare un file",
                1,
                1
        );
        inserisciDomanda(
                "Cosa significa l’icona del lucchetto nella barra dell’indirizzo?",
                "Il sito utilizza una connessione sicura (HTTPS)",
                "Il sito è privato, Il sito è bloccato, Il sito richiede login",
                1,
                2
        );

        inserisciDomanda(
                "Che cos’è un motore di ricerca semantico?",
                "Un motore che comprende il significato delle parole cercate",
                "Un motore che traduce testi, Un motore grafico, Un social network",
                1,
                2
        );

        inserisciDomanda(
                "Cosa serve un file CSV?",
                "A scambiare dati tabellari in formato testuale",
                "A comprimere file, A salvare immagini, A riprodurre video",
                1,
                2
        );

        inserisciDomanda(
                "Cosa significa ‘copiare un testo negli appunti’?",
                "Memorizzarlo temporaneamente per incollarlo altrove",
                "Salvarlo su disco, Stamparlo, Condividerlo online",
                1,
                2
        );

        inserisciDomanda(
                "Quale tra questi è un motore di ricerca?",
                "Google",
                "Facebook, Zoom, Outlook",
                1,
                2
        );

        inserisciDomanda(
                "Cosa si intende per 'dati personali'?",
                "Informazioni che identificano una persona",
                "Numeri casuali, File di sistema, Dati statistici anonimi",
                1,
                2
        );
        inserisciDomanda(
                "Cosa si intende per 'fake news'?",
                "Una notizia falsa o manipolata diffusa online",
                "Un errore di battitura, Un commento negativo, Un post privato",
                1,
                3
        );

        inserisciDomanda(
                "Che cos’è un dato strutturato?",
                "Un’informazione organizzata in modo regolare e leggibile da software",
                "Un dato casuale, Un testo libero, Un file audio",
                1,
                3
        );

        inserisciDomanda(
                "Che cos’è un metadato?",
                "Un’informazione che descrive un altro dato",
                "Un virus informatico, Un link, Un’app di posta",
                1,
                3
        );

        inserisciDomanda(
                "Come si può ridurre il sovraccarico informativo?",
                "Usando filtri, parole chiave e fonti affidabili",
                "Ignorando tutte le notizie, Leggendo tutto, Disattivando Internet",
                1,
                3
        );

        inserisciDomanda(
                "Cos’è la data di pubblicazione di un contenuto online?",
                "Il giorno in cui il contenuto è stato pubblicato o aggiornato",
                "La data di scadenza, La data di registrazione dell’utente, Il numero di commenti",
                1,
                3
        );

        inserisciDomanda(
                "Che cosa significa ‘indicizzazione’ di un sito web?",
                "Il processo con cui un motore di ricerca lo aggiunge al suo database",
                "L’iscrizione a un social, La traduzione automatica, L’invio di un’email",
                1,
                3
        );

        inserisciDomanda(
                "Come si può verificare se un’immagine è autentica?",
                "Facendo una ricerca inversa su Google Immagini",
                "Aprendola in Paint, Scaricandola più volte, Guardando la risoluzione",
                1,
                3
        );
        inserisciDomanda(
                "Come si può identificare un sito di disinformazione?",
                "Analizzando la fonte, il linguaggio e verificando le notizie altrove",
                "Se ha molti annunci, Se ha un logo colorato, Se è condiviso da amici",
                1,
                4
        );

        inserisciDomanda(
                "Cosa significa ‘bias informativo’?",
                "Una distorsione o parzialità nella presentazione dei dati",
                "Un errore del computer, Un virus informatico, Una nuova tecnologia",
                1,
                4
        );

        inserisciDomanda(
                "Come si possono proteggere i propri dati durante la navigazione?",
                "Usando HTTPS, VPN e impostazioni di privacy adeguate",
                "Condividendo meno post, Chiudendo il browser spesso, Usando lo stesso account ovunque",
                1,
                4
        );

        inserisciDomanda(
                "Che cos’è la ‘profilazione degli utenti’?",
                "L’analisi dei comportamenti online per creare profili personalizzati",
                "Un metodo di crittografia, Un formato di file, Un sistema di backup",
                1,
                4
        );

        inserisciDomanda(
                "Che cos’è un ‘open data’?",
                "Un insieme di dati accessibili e riutilizzabili liberamente",
                "Un file privato, Un dato criptato, Un’informazione riservata",
                1,
                4
        );

        inserisciDomanda(
                "Cosa indica l’acronimo API?",
                "Application Programming Interface",
                "Advanced Personal Internet, Automatic Program Installation, Access Point Information",
                1,
                4
        );

        inserisciDomanda(
                "Che differenza c’è tra dati quantitativi e qualitativi?",
                "I quantitativi sono numerici, i qualitativi descrivono caratteristiche",
                "Non c’è differenza, Dipende dal formato del file, Solo i quantitativi sono digitali",
                1,
                4
        );

        inserisciDomanda(
                "Cos’è un file JSON?",
                "Un formato testuale per scambiare dati strutturati tra sistemi",
                "Un’immagine, Un file audio, Un archivio ZIP",
                1,
                4
        );

        inserisciDomanda(
                "Che cosa significa ‘data visualization’?",
                "La rappresentazione grafica di dati complessi per facilitarne la comprensione",
                "La ricerca di file, La compressione dei dati, L’analisi del codice sorgente",
                1,
                4
        );
        inserisciDomanda(
                "Cosa significa CC in un’email?",
                "Carbon Copy, per inviare una copia a qualcuno",
                "Computer Code, Creative Content, Copy Center",
                2,
                1
        );

        inserisciDomanda(
                "Qual è un vantaggio principale di una chat di gruppo?",
                "Permette di comunicare con più persone contemporaneamente",
                "Riduce la memoria del computer, Protegge i dati, Crea video automatici",
                2,
                1
        );

        inserisciDomanda(
                "Cosa si intende per videoconferenza?",
                "Una riunione svolta online con audio e video",
                "Un programma di grafica, Un file audio, Una rete di computer",
                2,
                1
        );

        inserisciDomanda(
                "Quale piattaforma è utilizzata per condividere documenti in cloud?",
                "Google Drive",
                "Paint, Windows Media Player, Outlook Calendar",
                2,
                1
        );

        inserisciDomanda(
                "Che cos’è un profilo online?",
                "Una rappresentazione digitale di una persona o organizzazione",
                "Un software antivirus, Un file di backup, Una rete locale",
                2,
                1
        );

        inserisciDomanda(
                "Qual è la funzione principale dei social network?",
                "Permettere alle persone di connettersi e comunicare",
                "Elaborare fogli di calcolo, Proteggere dati sensibili, Creare software",
                2,
                1
        );

        inserisciDomanda(
                "Cosa significa ‘reply all’ in una email?",
                "Rispondere a tutti i destinatari della email",
                "Cancellare tutti i messaggi, Rispondere solo al mittente originale, Inviare un allegato",
                2,
                1
        );

        inserisciDomanda(
                "Qual è lo scopo di un forum online?",
                "Discutere e condividere informazioni su argomenti specifici",
                "Creare giochi, Registrare video, Inviare virus",
                2,
                1
        );
        inserisciDomanda(
                "Cosa significa ‘thread’ in una discussione online?",
                "Una serie di messaggi collegati su un singolo argomento",
                "Un tipo di software, Un virus informatico, Un allegato email",
                2,
                2
        );

        inserisciDomanda(
                "Quale funzione di un software di collaborazione permette la modifica simultanea di documenti?",
                "Editing in tempo reale",
                "Stampa automatica, Backup online, Invio di email",
                2,
                2
        );

        inserisciDomanda(
                "Cosa significa ‘taggare’ qualcuno in un post?",
                "Indicare o menzionare una persona nel contenuto",
                "Cancellare il post, Salvare il post sul computer, Creare un nuovo account",
                2,
                2
        );

        inserisciDomanda(
                "Qual è lo scopo principale di un canale di comunicazione aziendale?",
                "Facilitare lo scambio di informazioni tra team",
                "Creare video tutorial, Proteggere il computer dai malware, Stampare documenti",
                2,
                2
        );

        inserisciDomanda(
                "Cosa si intende per ‘moderazione di contenuti’?",
                "Controllare e gestire ciò che viene pubblicato online",
                "Creare nuove applicazioni, Analizzare dati quantitativi, Inviare newsletter",
                2,
                2
        );

        inserisciDomanda(
                "Qual è una funzione chiave di un forum educativo?",
                "Permettere lo scambio di conoscenze tra studenti e insegnanti",
                "Archiviare file musicali, Creare backup di sistema, Gestire hardware",
                2,
                2
        );

        inserisciDomanda(
                "Che cos’è un webinar?",
                "Una lezione o seminario svolto online",
                "Un software antivirus, Un file PDF, Un backup automatico",
                2,
                2
        );

        inserisciDomanda(
                "Cosa significa ‘feedback costruttivo’?",
                "Osservazioni utili per migliorare un lavoro o comportamento",
                "Critiche distruttive, Commenti privati, Segnalazioni di errore del software",
                2,
                2
        );
        inserisciDomanda(
                "Qual è la differenza tra email formale e informale?",
                "Tono, struttura e linguaggio utilizzato",
                "La dimensione dell’allegato, Il provider email, Il numero di destinatari",
                2,
                3
        );

        inserisciDomanda(
                "Cosa si intende per netiquette?",
                "Regole di comportamento corretto online",
                "Un software antivirus, Un linguaggio di programmazione, Un tipo di cloud storage",
                2,
                3
        );

        inserisciDomanda(
                "Qual è il vantaggio di usare emoji o reazioni nei messaggi?",
                "Comunicare emozioni e chiarire il tono del messaggio",
                "Aumentare lo spazio di archiviazione, Proteggere dai virus, Ridurre la banda internet",
                2,
                3
        );

        inserisciDomanda(
                "Cosa significa ‘collaborazione asincrona’?",
                "Lavorare insieme senza essere connessi nello stesso momento",
                "Lavorare nello stesso posto, Usare lo stesso computer, Inviare file offline",
                2,
                3
        );

        inserisciDomanda(
                "Quale strumento permette di organizzare progetti e attività di gruppo online?",
                "Kanban o software di project management",
                "Email personale, Foglio di calcolo singolo, Browser web",
                2,
                3
        );

        inserisciDomanda(
                "Cosa significa ‘moderatore’ in un forum o chat?",
                "Una persona che controlla e gestisce la conversazione",
                "Un programmatore, Un virus informatico, Un file di backup",
                2,
                3
        );

        inserisciDomanda(
                "Qual è l’obiettivo principale di una piattaforma wiki?",
                "Creare e condividere contenuti collaborativi modificabili da più utenti",
                "Archiviare email, Proteggere dati sensibili, Creare video",
                2,
                3
        );

        inserisciDomanda(
                "Cosa indica la funzione ‘share screen’ durante una videoconferenza?",
                "Mostrare il proprio schermo agli altri partecipanti",
                "Registrare la chiamata, Inviare un allegato, Bloccare i messaggi",
                2,
                3
        );

        inserisciDomanda(
                "Qual è un vantaggio dell’uso di chat aziendali rispetto all’email?",
                "Comunicazione più immediata e organizzata per team",
                "Aumentano la sicurezza dei dati, Cancellano automaticamente gli allegati, Creano grafici automaticamente",
                2,
                3
        );
        inserisciDomanda(
                "Che cos’è un workspace digitale?",
                "Un ambiente online per collaborare su progetti e documenti",
                "Un tipo di computer, Un file musicale, Una connessione internet",
                2,
                4
        );

        inserisciDomanda(
                "Cosa si intende per ‘sincronizzazione dei documenti’?",
                "Aggiornare file su diversi dispositivi in tempo reale",
                "Copiare file su chiavetta USB, Stampare tutti i file, Inviare email multiple",
                2,
                4
        );

        inserisciDomanda(
                "Qual è una pratica di sicurezza importante nelle piattaforme collaborative?",
                "Usare password forti e autenticazione a due fattori",
                "Usare lo stesso account per tutti, Condividere password via email, Ignorare aggiornamenti software",
                2,
                4
        );

        inserisciDomanda(
                "Cosa significa ‘commento costruttivo’ in un contesto collaborativo?",
                "Suggerimenti utili per migliorare un lavoro",
                "Critiche offensive, Eliminare i file altrui, Inviare emoji senza testo",
                2,
                4
        );

        inserisciDomanda(
                "Qual è il vantaggio di usare strumenti di gestione dei compiti?",
                "Permettono di assegnare, monitorare e completare attività in gruppo",
                "Creano automaticamente grafici, Proteggono dai virus, Inviazioni notifiche spam",
                2,
                4
        );

        inserisciDomanda(
                "Cosa si intende per ‘collaborazione in cloud’?",
                "Condividere e modificare documenti online tra più utenti",
                "Archiviare dati solo sul computer locale, Inviare email a tutti gli utenti, Creare copie cartacee",
                2,
                4
        );

        inserisciDomanda(
                "Qual è il ruolo dei thread in piattaforme collaborative avanzate?",
                "Organizzare le discussioni per argomenti specifici",
                "Cancellare documenti, Bloccare utenti, Inviare notifiche automatiche",
                2,
                4
        );

        inserisciDomanda(
                "Cosa significa ‘notifica push’?",
                "Messaggio inviato automaticamente a un dispositivo per informare l’utente",
                "Stampare documenti, Aprire una cartella, Inviare email anonime",
                2,
                4
        );

        inserisciDomanda(
                "Qual è un vantaggio dell’uso di strumenti di collaborazione multimediale?",
                "Permettono di condividere testi, immagini, video e audio in modo integrato",
                "Proteggono il computer dai virus, Aumentano la risoluzione dello schermo, Creano backup automatici non richiesti",
                2,
                4
        );
        inserisciDomanda(
                "Cosa permette di fare un programma di disegno digitale?",
                "Creare immagini e grafica al computer",
                "Scrivere email, Inviare messaggi istantanei, Gestire fogli di calcolo",
                3,
                1
        );

        inserisciDomanda(
                "Quale formato di file è usato per le immagini digitali più comuni?",
                "JPEG o PNG",
                "DOCX, MP3, ZIP",
                3,
                1
        );

        inserisciDomanda(
                "Che cos’è un template?",
                "Un modello predefinito per creare contenuti più velocemente",
                "Un software antivirus, Un tipo di email, Un browser web",
                3,
                1
        );

        inserisciDomanda(
                "Cosa significa ‘inserire un’immagine in un documento’?",
                "Aggiungere un’immagine all’interno di un testo",
                "Stampare il documento, Salvare il documento come PDF, Inviare il documento via email",
                3,
                1
        );

        inserisciDomanda(
                "Qual è lo scopo principale di un programma di presentazioni?",
                "Creare diapositive per comunicare informazioni",
                "Scrivere codice, Modificare foto, Gestire email",
                3,
                1
        );

        inserisciDomanda(
                "Cosa si intende per ‘salvataggio’ di un file?",
                "Conservare i dati sul computer o cloud",
                "Stampare i dati, Cancellare il documento, Condividere il file via email",
                3,
                1
        );
        inserisciDomanda(
                "Cosa significa ‘formattare un testo’?",
                "Modificare font, dimensione, colore e allineamento",
                "Salvare il testo, Stampare il documento, Aggiungere immagini",
                3,
                2
        );

        inserisciDomanda(
                "Qual è l’obiettivo di un software di impaginazione?",
                "Creare documenti strutturati con testo e immagini",
                "Scrivere email, Creare fogli di calcolo, Disegnare solo forme geometriche",
                3,
                2
        );

        inserisciDomanda(
                "Cosa permette di fare uno strumento di disegno vettoriale?",
                "Creare immagini scalabili senza perdita di qualità",
                "Creare solo bitmap, Stampare documenti, Inviare email",
                3,
                2
        );

        inserisciDomanda(
                "Qual è la funzione principale di un software di presentazione avanzata?",
                "Aggiungere animazioni, transizioni e contenuti multimediali",
                "Scrivere email, Modificare immagini JPEG, Creare fogli Excel",
                3,
                2
        );

        inserisciDomanda(
                "Cosa significa ‘allineamento del testo’?",
                "Posizionare il testo a sinistra, destra, centro o giustificato",
                "Stampare il testo, Modificare il colore del documento, Creare PDF",
                3,
                2
        );

        inserisciDomanda(
                "Qual è la differenza tra raster e vettoriale?",
                "Raster è a pixel, vettoriale è basato su forme geometriche",
                "Raster è più veloce, vettoriale è lento, Vettoriale non può essere stampato, Raster crea solo testo",
                3,
                2
        );

        inserisciDomanda(
                "Cosa significa ‘aggiungere un livello’ in un software di grafica?",
                "Creare un nuovo strato per separare elementi visivi",
                "Salvare il file, Stampare il documento, Creare un nuovo file",
                3,
                2
        );

        inserisciDomanda(
                "Cosa permette di fare la funzione ‘copia-incolla’ in software creativi?",
                "Duplicare testo, immagini o elementi tra file o sezioni",
                "Modificare il colore, Rimuovere il file, Inviare email automaticamente",
                3,
                2
        );

        inserisciDomanda(
                "Qual è il vantaggio di usare scorciatoie da tastiera in software di grafica?",
                "Velocizzare le operazioni e migliorare l’efficienza",
                "Proteggere il file, Creare backup automatici, Stampare documenti",
                3,
                2
        );
        inserisciDomanda(
                "Qual è lo scopo di un software di fotoritocco avanzato?",
                "Modificare, correggere e migliorare immagini digitali",
                "Scrivere documenti testuali, Gestire email, Creare fogli di calcolo",
                3,
                3
        );

        inserisciDomanda(
                "Cosa significa ‘maschera di livello’?",
                "Nascondere o mostrare parti di un livello senza cancellare",
                "Cancellare un livello, Duplicare il file, Convertire in PDF",
                3,
                3
        );

        inserisciDomanda(
                "Qual è il vantaggio di usare un software di animazione digitale?",
                "Creare contenuti animati e interattivi",
                "Scrivere solo testi, Stampare documenti, Creare fogli di calcolo",
                3,
                3
        );

        inserisciDomanda(
                "Cosa significa ‘timeline’ in un software video?",
                "Sequenza temporale in cui organizzare clip e audio",
                "Lista dei file salvati, Menu delle impostazioni, Archivio di immagini",
                3,
                3
        );

        inserisciDomanda(
                "Qual è la funzione di ‘keyframe’ in animazione digitale?",
                "Definire punti chiave di movimento o effetto",
                "Salvare il file, Stampare il documento, Ridimensionare immagini",
                3,
                3
        );

        inserisciDomanda(
                "Cosa significa ‘ridimensionare mantenendo proporzioni’?",
                "Modificare dimensioni senza alterare la forma",
                "Stampare automaticamente, Cambiare solo il colore, Invertire il file",
                3,
                3
        );

        inserisciDomanda(
                "Qual è lo scopo di un software di impaginazione avanzata?",
                "Creare documenti complessi con layout professionale",
                "Scrivere email, Creare solo testi semplici, Inviare file",
                3,
                3
        );

        inserisciDomanda(
                "Cosa significa ‘renderizzare’ un video?",
                "Generare il video finale elaborando tutte le modifiche",
                "Salvare il progetto come testo, Stampare il video, Aggiungere sottotitoli automaticamente",
                3,
                3
        );

        inserisciDomanda(
                "Qual è il vantaggio di usare formati vettoriali per loghi?",
                "Scalabilità senza perdita di qualità",
                "File più pesanti, Meno compatibili con il web, Non modificabili",
                3,
                3
        );
        inserisciDomanda(
                "Qual è lo scopo di usare livelli di regolazione?",
                "Modificare colore e luminosità senza alterare il livello originale",
                "Cancellare contenuti, Duplicare file, Aumentare la risoluzione automaticamente",
                3,
                4
        );

        inserisciDomanda(
                "Cosa permette di fare uno strumento di tracciamento avanzato in video editing?",
                "Seguire il movimento di un oggetto nella scena",
                "Modificare l’audio automaticamente, Convertire il video in PDF, Aggiungere testo statico",
                3,
                4
        );

        inserisciDomanda(
                "Cosa significa 'compositing' in grafica e video?",
                "Unire più elementi visivi in un’unica immagine o scena",
                "Stampare immagini, Aggiungere testo automatico, Ridurre la risoluzione del video",
                3,
                4
        );

        inserisciDomanda(
                "Cosa indica la profondità di colore di un’immagine?",
                "Numero di colori che possono essere rappresentati",
                "Dimensione del file in MB, Numero di pixel orizzontali, Numero di livelli nel documento",
                3,
                4
        );

        inserisciDomanda(
                "Cosa significa 'keying' in produzione video?",
                "Rimuovere uno sfondo specifico usando un colore chiave (es. green screen)",
                "Aggiungere effetti sonori, Creare animazioni 3D, Ridurre dimensione del file",
                3,
                4
        );

        inserisciDomanda(
                "Qual è il vantaggio di usare file vettoriali in stampa professionale?",
                "Mantengono qualità anche ingranditi",
                "Riduzione automatica del peso del file, Aggiungono effetti speciali automaticamente, Non possono essere stampati",
                3,
                4
        );

        inserisciDomanda(
                "Cosa indica la risoluzione di un video?",
                "Numero di pixel orizzontali e verticali che compongono l’immagine",
                "Durata del video in minuti, Dimensione del file in MB, Numero di tracce audio",
                3,
                4
        );

        inserisciDomanda(
                "Cosa significa 'interpolazione dei fotogrammi'?",
                "Creare fotogrammi intermedi per rendere più fluido un video",
                "Aumentare la luminosità dei fotogrammi, Ridurre il peso del file video, Unire audio e video",
                3,
                4
        );

        inserisciDomanda(
                "Qual è la funzione di una maschera alfa?",
                "Definire la trasparenza di parti di un’immagine o video",
                "Stampare l’immagine, Convertire il file in PDF, Applicare filtri automatici",
                3,
                4
        );
        inserisciDomanda(
                "Cosa è un antivirus?",
                "Un software che protegge il computer dai virus",
                "Un tipo di firewall, Un aggiornamento del sistema operativo, Un software di grafica",
                4,
                1
        );

        inserisciDomanda(
                "Cosa bisogna fare prima di aprire un allegato email?",
                "Verificare che provenga da un mittente affidabile",
                "Aprirlo subito, Salvarlo senza controlli, Condividerlo con tutti i contatti",
                4,
                1
        );

        inserisciDomanda(
                "Cosa significa aggiornare un software?",
                "Installare le versioni più recenti per correggere problemi e migliorare la sicurezza",
                "Cambiare icone, Copiare il software su un altro computer, Aumentare lo spazio su disco",
                4,
                1
        );

        inserisciDomanda(
                "Cosa bisogna evitare di condividere online?",
                "Informazioni personali sensibili",
                "Foto di paesaggi, Link pubblici, Commenti generici",
                4,
                1
        );

        inserisciDomanda(
                "Cosa è il phishing?",
                "Tentativo di rubare dati personali tramite email o siti falsi",
                "Un tipo di virus informatico, Un aggiornamento software, Un firewall avanzato",
                4,
                1
        );

        inserisciDomanda(
                "Cosa bisogna fare se si riceve un messaggio sospetto?",
                "Non aprirlo e segnalarlo",
                "Aprirlo subito, Rispondere con i propri dati, Inoltrarlo a tutti gli amici",
                4,
                1
        );

        inserisciDomanda(
                "Cosa significa autenticazione a due fattori (2FA)?",
                "Richiedere due modi diversi per verificare l'identità",
                "Usare due password uguali, Avere due account, Condividere la password con un amico",
                4,
                1
        );

        inserisciDomanda(
                "Cosa è un firewall?",
                "Un sistema che controlla e filtra il traffico di rete",
                "Un antivirus gratuito, Un tipo di backup, Un browser sicuro",
                4,
                1
        );

        inserisciDomanda(
                "Cosa bisogna fare quando si usa un Wi-Fi pubblico?",
                "Evitare di accedere a dati sensibili senza protezione",
                "Accedere sempre a tutti i servizi, Disattivare il firewall, Condividere file personali",
                4,
                1
        );
        inserisciDomanda(
                "Cosa significa crittografia?",
                "Trasformare i dati in un formato sicuro leggibile solo da chi ha la chiave",
                "Eliminare dati vecchi, Comprimere file per risparmiare spazio, Condividere file pubblicamente",
                4,
                2
        );

        inserisciDomanda(
                "Qual è il rischio di usare la stessa password per più account?",
                "Se una viene violata, tutti gli account diventano vulnerabili",
                "Il computer diventa lento, Le email vengono cancellate, Si perde l’accesso a internet",
                4,
                2
        );

        inserisciDomanda(
                "Cosa significa malware?",
                "Software dannoso progettato per danneggiare computer o rubare dati",
                "Software di grafica avanzata, Un antivirus gratuito, Un tipo di aggiornamento",
                4,
                2
        );

        inserisciDomanda(
                "Cosa bisogna fare se un dispositivo sembra infetto?",
                "Scansionarlo con antivirus e isolare il dispositivo",
                "Ignorarlo e continuare a usarlo, Condividere file con altri, Formattare subito senza backup",
                4,
                2
        );

        inserisciDomanda(
                "Qual è lo scopo di un aggiornamento di sicurezza?",
                "Correggere vulnerabilità e proteggere da nuove minacce",
                "Cambiare icone del sistema, Aumentare solo la velocità, Ridurre lo spazio occupato dai file",
                4,
                2
        );

        inserisciDomanda(
                "Cosa significa attacco di tipo 'ransomware'?",
                "Blocco dei dati fino al pagamento di un riscatto",
                "Un virus che cancella tutto immediatamente, Un aggiornamento di sicurezza, Un tipo di backup automatico",
                4,
                2
        );

        inserisciDomanda(
                "Cosa è un accesso non autorizzato?",
                "Quando qualcuno entra in un sistema senza permesso",
                "Un login corretto, Una stampa di documento, Un aggiornamento software",
                4,
                2
        );

        inserisciDomanda(
                "Cosa bisogna fare per proteggere i dati sul cloud?",
                "Usare password forti e abilitare l’autenticazione a due fattori",
                "Condividerli pubblicamente, Usare la stessa password per tutti i servizi, Non fare mai backup",
                4,
                2
        );

        inserisciDomanda(
                "Qual è la funzione di un antivirus in tempo reale?",
                "Monitorare continuamente il computer per rilevare minacce",
                "Pulire la tastiera, Velocizzare internet, Bloccare solo le email",
                4,
                2
        );
        inserisciDomanda(
                "Qual è lo scopo di un certificato SSL?",
                "Garantire la sicurezza e la crittografia delle comunicazioni web",
                "Aumentare la velocità del sito, Ridurre il peso delle immagini, Bloccare spam",
                4,
                3
        );

        inserisciDomanda(
                "Cosa significa vulnerabilità zero-day?",
                "Una falla di sicurezza non ancora conosciuta e sfruttata dai malintenzionati",
                "Un virus vecchio di un giorno, Un aggiornamento urgente, Una copia di backup corrotta",
                4,
                3
        );

        inserisciDomanda(
                "Cosa indica il termine 'trojan'?",
                "Software dannoso che si nasconde come programma legittimo",
                "Un tipo di firewall, Un aggiornamento di sicurezza, Un backup automatico",
                4,
                3
        );

        inserisciDomanda(
                "Cosa bisogna fare per proteggere una rete domestica?",
                "Usare password complesse e aggiornare regolarmente il router",
                "Lasciare password di default, Non aggiornare mai il router, Condividere il Wi-Fi pubblicamente",
                4,
                3
        );

        inserisciDomanda(
                "Cosa significa spoofing?",
                "Falsificare l’identità digitale per ingannare gli utenti",
                "Cancellare virus dal computer, Aggiornare un software, Proteggere file con password",
                4,
                3
        );

        inserisciDomanda(
                "Cosa indica un attacco DDoS?",
                "Saturare un server o rete con traffico eccessivo per renderlo inutilizzabile",
                "Cancellare file locali, Rubare password, Modificare la grafica di un sito",
                4,
                3
        );

        inserisciDomanda(
                "Cosa è un keylogger?",
                "Software che registra i tasti digitati per rubare informazioni",
                "Un programma di grafica, Un firewall avanzato, Un sistema di backup cloud",
                4,
                3
        );

        inserisciDomanda(
                "Cosa significa gestione dei privilegi?",
                "Controllare chi può accedere a risorse o dati specifici",
                "Aggiornare il sistema operativo, Installare antivirus, Condividere file pubblicamente",
                4,
                3
        );

        inserisciDomanda(
                "Cosa significa autenticazione biometrica?",
                "Usare caratteristiche fisiche (impronta, volto) per identificare un utente",
                "Usare due password uguali, Inserire codice PIN condiviso, Accedere tramite email pubblica",
                4,
                3
        );
        inserisciDomanda(
                "Cosa è un IDS (Intrusion Detection System)?",
                "Un sistema che rileva accessi non autorizzati o attività sospette in rete",
                "Un tipo di antivirus base, Un software di grafica, Un cloud storage",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa hardening di un sistema?",
                "Rinforzare le impostazioni di sicurezza per ridurre vulnerabilità",
                "Aumentare la velocità del computer, Stampare documenti in sicurezza, Ridurre dimensioni file",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa sicurezza perimetrale?",
                "Protezione dei confini della rete contro accessi esterni",
                "Protezione dei documenti locali, Backup automatico dei file, Crittografia delle email",
                4,
                4
        );

        inserisciDomanda(
                "Cosa indica il termine honeypot in sicurezza informatica?",
                "Sistema trappola per attirare e analizzare attacchi",
                "Backup automatico dei file, Firewall perimetrale, Aggiornamento antivirus",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa threat intelligence?",
                "Raccolta e analisi di informazioni sulle minacce informatiche",
                "Aggiornamento automatico dei software, Creazione di grafica digitale, Backup cloud dei dati",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa pen testing?",
                "Testare un sistema simulando attacchi per identificare vulnerabilità",
                "Cancellare virus automaticamente, Installare firewall base, Aggiornare driver video",
                4,
                4
        );

        inserisciDomanda(
                "Cosa indica cifratura end-to-end?",
                "I dati sono criptati dalla sorgente al destinatario senza poter essere letti da terzi",
                "Cancellazione automatica dei dati, Backup su cloud pubblico, Firewall base attivo",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa attacco di tipo brute force?",
                "Tentativo di indovinare password provando tutte le combinazioni possibili",
                "Aggiornamento del software, Esecuzione di backup, Modifica dei permessi file",
                4,
                4
        );

        inserisciDomanda(
                "Cosa è la segmentazione di rete?",
                "Dividere la rete in sottoreti per limitare accessi e aumentare sicurezza",
                "Cancellare file temporanei, Backup automatico, Aggiornamento antivirus",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa attacco APT (Advanced Persistent Threat)?",
                "Attacco sofisticato e prolungato mirato a un obiettivo specifico",
                "Un aggiornamento di sicurezza, Un firewall avanzato, Un antivirus gratuito",
                4,
                4
        );

        inserisciDomanda(
                "Cosa indica Zero Trust Security?",
                "Non fidarsi automaticamente di nessun utente o dispositivo, nemmeno interni",
                "Usare solo password lunghe, Aggiornare firewall mensilmente, Backup automatico cloud",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa sicurezza dei dati in transito?",
                "Protezione dei dati mentre viaggiano tra sistemi o reti",
                "Protezione dei dati solo sul disco, Backup automatico giornaliero, Eliminazione dei file temporanei",
                4,
                4
        );

        inserisciDomanda(
                "Cosa indica sicurezza dei dati a riposo?",
                "Protezione dei dati archiviati su disco o server",
                "Protezione solo della rete, Aggiornamento antivirus automatico, Cancellazione automatica dei dati",
                4,
                4
        );

        inserisciDomanda(
                "Cosa significa gestione delle patch?",
                "Installare aggiornamenti software per correggere vulnerabilità",
                "Cancellare file obsoleti, Creare backup manuali, Configurare firewall base",
                4,
                4
        );
        inserisciDomanda(
                "Cosa fare se un programma si blocca?",
                "Chiuderlo e riaprirlo",
                "Spegnere il computer senza salvare, Cancellare tutti i file, Installare un antivirus",
                5,
                1
        );

        inserisciDomanda(
                "Cosa fare se il Wi-Fi non funziona?",
                "Controllare router e connessione",
                "Comprare un nuovo computer, Spegnere il modem e non riaccenderlo, Cancellare la cronologia del browser",
                5,
                1
        );

        inserisciDomanda(
                "Cosa fare se lo schermo è nero ma il computer è acceso?",
                "Verificare i cavi e la luminosità",
                "Buttare il computer, Accendere un altro monitor senza spegnere, Formattare subito il sistema",
                5,
                1
        );

        inserisciDomanda(
                "Cosa fare se il mouse non risponde?",
                "Controllare la batteria o il collegamento",
                "Comprare un nuovo mouse senza controllare, Cambiare il sistema operativo, Spegnere il computer senza motivo",
                5,
                1
        );

        inserisciDomanda(
                "Cosa fare se la stampante non stampa?",
                "Controllare toner, carta e connessione",
                "Disinstallare il computer, Cambiare browser, Spegnere il modem",
                5,
                1
        );

        inserisciDomanda(
                "Cosa fare se una finestra di programma non si chiude?",
                "Usare Gestione attività per terminarla",
                "Spegnere il computer senza salvare, Cancellare tutti i file, Riavviare internet",
                5,
                1
        );
        inserisciDomanda(
                "Cosa fare se un’applicazione si aggiorna male?",
                "Disinstallarla e reinstallare la versione corretta",
                "Spegnere il computer, Ignorare il problema, Cancellare documenti personali",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se il disco è quasi pieno?",
                "Eliminare file inutili e fare pulizia del disco",
                "Comprare un nuovo computer, Formattare senza backup, Installare antivirus",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se la rete locale non funziona?",
                "Controllare router, cavi e impostazioni IP",
                "Cambiare tutti i dispositivi, Spegnere il computer senza controllare, Disinstallare internet",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se un programma da errore di compatibilità?",
                "Verificare requisiti e aggiornamenti del software",
                "Cancellare il computer, Cambiare monitor, Spegnere la stampante",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se i driver non funzionano correttamente?",
                "Aggiornare o reinstallare i driver appropriati",
                "Ignorare il problema, Disinstallare il computer, Cambiare sistema operativo ogni giorno",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se il computer si surriscalda?",
                "Verificare ventilazione, polvere e temperatura ambiente",
                "Spegnere il computer e lasciarlo chiuso, Accendere più programmi pesanti, Ignorare il problema",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se un dispositivo USB non viene riconosciuto?",
                "Provare un’altra porta o aggiornare driver",
                "Buttarlo via subito, Spegnere il computer senza verificare, Formattare il disco rigido",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se un software va in crash ripetutamente?",
                "Verificare aggiornamenti e reinstallare se necessario",
                "Cancellare tutti i file del computer, Cambiare monitor, Disattivare internet",
                5,
                2
        );

        inserisciDomanda(
                "Cosa fare se ci sono conflitti tra programmi?",
                "Chiudere i programmi in conflitto e aggiornare il software",
                "Ignorare il conflitto, Cancellare il sistema operativo, Spegnere il monitor",
                5,
                2
        );
        inserisciDomanda(
                "Come risolvere conflitti tra versioni diverse di uno stesso programma?",
                "Disinstallare le versioni obsolete e mantenere solo quella aggiornata",
                "Copiare tutti i file in una cartella, Spegnere il computer, Ignorare il problema",
                5,
                3
        );

        inserisciDomanda(
                "Come affrontare problemi di lentezza causati da troppi processi in background?",
                "Chiudere i processi non necessari e ottimizzare l’avvio automatico",
                "Spegnere il computer continuamente, Formattare il disco senza backup, Disinstallare antivirus",
                5,
                3
        );

        inserisciDomanda(
                "Cosa fare se un aggiornamento di sistema fallisce ripetutamente?",
                "Verificare spazio disponibile, connessione e log degli errori",
                "Ignorare l’aggiornamento, Cancellare tutti i file, Spegnere il computer e basta",
                5,
                3
        );

        inserisciDomanda(
                "Come risolvere problemi di rete intermittente?",
                "Controllare cavi, router, driver e configurazioni IP",
                "Ignorare il problema, Spegnere il computer, Disinstallare internet",
                5,
                3
        );

        inserisciDomanda(
                "Cosa fare se un programma non è compatibile con il sistema operativo?",
                "Usare versioni compatibili o ambienti virtuali",
                "Forzare l’installazione, Cambiare monitor, Spegnere il computer",
                5,
                3
        );

        inserisciDomanda(
                "Come diagnosticare problemi hardware intermittenti?",
                "Usare strumenti di diagnostica e testare componenti singolarmente",
                "Cambiare tutto l’hardware a caso, Spegnere il computer, Ignorare il problema",
                5,
                3
        );

        inserisciDomanda(
                "Cosa fare se i dati si corrompono frequentemente?",
                "Verificare backup, integrità disco e eventuali virus",
                "Formattare senza backup, Ignorare il problema, Spegnere il computer senza salvare",
                5,
                3
        );

        inserisciDomanda(
                "Come risolvere problemi di autorizzazioni su file o cartelle?",
                "Controllare utenti, permessi e proprietà dei file",
                "Eliminare tutti i file, Cambiare il sistema operativo, Spegnere il computer",
                5,
                3
        );

        inserisciDomanda(
                "Cosa fare se una periferica esterna non funziona correttamente?",
                "Verificare driver, connessioni e compatibilità",
                "Buttarla via subito, Spegnere il computer, Formattare tutto il sistema",
                5,
                3
        );
        inserisciDomanda(
                "Cosa fare se un software critico fallisce dopo aggiornamento?",
                "Ripristinare backup, controllare log e contattare supporto tecnico",
                "Disinstallare tutto il computer, Ignorare il problema, Spegnere il computer ripetutamente",
                5,
                4
        );

        inserisciDomanda(
                "Come risolvere problemi di sincronizzazione dati tra dispositivi?",
                "Verificare connessione, account e integrità dei dati",
                "Cancellare tutti i dati, Cambiare dispositivo senza verificare, Spegnere il computer",
                5,
                4
        );

        inserisciDomanda(
                "Cosa fare se si sospetta malware persistente?",
                "Usare strumenti avanzati di scansione e rimuovere minacce",
                "Ignorare il malware, Disinstallare antivirus, Spegnere il computer senza fare nulla",
                5,
                4
        );

        inserisciDomanda(
                "Come diagnosticare problemi di prestazioni server?",
                "Monitorare risorse, log, e carico dei processi",
                "Spegnere il server continuamente, Cancellare tutti i file, Cambiare server senza analisi",
                5,
                4
        );

        inserisciDomanda(
                "Cosa fare se più programmi causano conflitti di risorse?",
                "Analizzare le risorse utilizzate e ottimizzare la configurazione",
                "Ignorare i conflitti, Formattare il computer, Spegnere il monitor",
                5,
                4
        );

        inserisciDomanda(
                "Come risolvere problemi di backup fallito ripetutamente?",
                "Verificare spazio, permessi e integrità del dispositivo di backup",
                "Ignorare il problema, Cancellare tutto il disco, Spegnere il computer senza fare nulla",
                5,
                4
        );

        inserisciDomanda(
                "Cosa fare se un database non risponde?",
                "Controllare connessione, log e integrità dei dati",
                "Spegnere il server, Cancellare tutti i record, Ignorare il problema",
                5,
                4
        );

        inserisciDomanda(
                "Come risolvere problemi di compatibilità tra software aziendali?",
                "Verificare versioni, aggiornamenti e dipendenze",
                "Disinstallare tutto, Ignorare problemi di compatibilità, Spegnere computer",
                5,
                4
        );

        inserisciDomanda(
                "Cosa fare se un’applicazione crittica mostra errori intermittenti?",
                "Analizzare log, ambiente e riprodurre il problema per debug",
                "Ignorare gli errori, Formattare il computer, Spegnere il monitor",
                5,
                4
        );

        inserisciDomanda(
                "Come risolvere problemi critici di rete aziendale complessa?",
                "Analizzare topologia, log dei dispositivi e configurazioni avanzate",
                "Spegnere tutti i computer, Cambiare solo i cavi, Ignorare il problema",
                5,
                4
        );

        inserisciDomanda(
                "Cosa fare se un sistema server va in crash durante operazioni critiche?",
                "Ripristinare backup, analizzare log e notificare team tecnico",
                "Ignorare il crash, Spegnere tutto senza backup, Formattare immediatamente",
                5,
                4
        );

        inserisciDomanda(
                "Come diagnosticare problemi di sicurezza avanzata legati a malware persistente?",
                "Usare strumenti avanzati, analizzare comportamenti e rimuovere minacce",
                "Disinstallare antivirus, Ignorare il malware, Spegnere computer senza analisi",
                5,
                4
        );

        inserisciDomanda(
                "Come risolvere problemi di performance critica su server con carichi elevati?",
                "Monitorare risorse, bilanciare carico e ottimizzare configurazioni",
                "Spegnere il server ripetutamente, Formattare senza backup, Ignorare i problemi di performance",
                5,
                4
        );

        inserisciDomanda(
                "Cosa fare se più applicazioni enterprise causano conflitti gravi?",
                "Analizzare le risorse condivise e ottimizzare la configurazione",
                "Disinstallare tutto, Ignorare i conflitti, Spegnere monitor",
                5,
                4
        );

        inserisciDomanda(
                "Come risolvere problemi critici di backup e disaster recovery?",
                "Verificare integrità, permessi e testare procedure di ripristino",
                "Ignorare il backup fallito, Cancellare tutti i dati, Spegnere il computer senza fare nulla",
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
