 const questions = {
    // 🧩 ALFABETIZZAZIONE SU INFORMAZIONI E DATI — LIVELLO 1
    1: {
        domanda: "Che cos’è un browser?",
        rispostaCorretta: "Un programma che permette di navigare su Internet",
        risposteErrate: ["Un motore di ricerca", "Un sistema operativo", "Un social network"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    2: {
        domanda: "Cosa rappresenta l’icona della lente di ingrandimento in un sito web?",
        rispostaCorretta: "Lo strumento di ricerca",
        risposteErrate: ["Il pulsante per chiudere", "Il menu delle impostazioni", "Il tasto di download"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    3: {
        domanda: "Cosa significa ‘cliccare su un link’?",
        rispostaCorretta: "Aprire una nuova pagina o risorsa collegata",
        risposteErrate: ["Cancellare un file", "Creare un collegamento", "Aprire le impostazioni"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    4: {
        domanda: "Che cos’è un motore di ricerca?",
        rispostaCorretta: "Un servizio online per trovare informazioni su Internet",
        risposteErrate: ["Un programma per disegnare", "Un’app di messaggistica", "Un antivirus"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    5: {
        domanda: "Cosa indica l’estensione .pdf?",
        rispostaCorretta: "Un documento portatile leggibile su molti dispositivi",
        risposteErrate: ["Un’immagine", "Un file audio", "Un video"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    6: {
        domanda: "Che cos’è un file?",
        rispostaCorretta: "Un insieme di dati salvato su un dispositivo",
        risposteErrate: ["Un tipo di connessione Internet", "Una password", "Un programma di posta elettronica"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    7: {
        domanda: "Cosa significa ‘scaricare un file’?",
        rispostaCorretta: "Copiare un file da Internet al proprio dispositivo",
        risposteErrate: ["Cancellare un file", "Condividere un file", "Criptare un file"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    8: {
        domanda: "Cosa si intende per ‘link ipertestuale’?",
        rispostaCorretta: "Un testo o immagine che collega a un’altra risorsa online",
        risposteErrate: ["Un file di testo", "Un programma", "Una tabella di dati"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    9: {
        domanda: "Che cos’è un indirizzo web (URL)?",
        rispostaCorretta: "Il percorso che identifica una risorsa su Internet",
        risposteErrate: ["Una password", "Un tipo di connessione", "Un social network"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },
    10: {
        domanda: "Che cosa significa ‘Internet’?",
        rispostaCorretta: "Una rete mondiale che connette computer e dispositivi",
        risposteErrate: ["Un programma di messaggistica", "Un provider telefonico", "Un’app di social network"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 1
    },

    // 🧩 LIVELLO 2
    11: {
        domanda: "Che cosa indica il dominio .gov in un sito web?",
        rispostaCorretta: "Un sito appartenente a un ente governativo",
        risposteErrate: ["Un sito scolastico", "Un social network", "Un blog personale"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    12: {
        domanda: "Cosa significa l’icona del lucchetto nella barra dell’indirizzo?",
        rispostaCorretta: "Il sito utilizza una connessione sicura (HTTPS)",
        risposteErrate: ["Il sito è privato", "Il sito è bloccato", "Il sito richiede login"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    13: {
        domanda: "Che cos’è un motore di ricerca semantico?",
        rispostaCorretta: "Un motore che comprende il significato delle parole cercate",
        risposteErrate: ["Un motore che traduce testi", "Un motore grafico", "Un social network"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    14: {
        domanda: "Cosa serve un file CSV?",
        rispostaCorretta: "A scambiare dati tabellari in formato testuale",
        risposteErrate: ["A comprimere file", "A salvare immagini", "A riprodurre video"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    15: {
        domanda: "Cosa significa ‘copiare un testo negli appunti’?",
        rispostaCorretta: "Memorizzarlo temporaneamente per incollarlo altrove",
        risposteErrate: ["Salvarlo su disco", "Stamparlo", "Condividerlo online"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    16: {
        domanda: "Quale tra questi è un motore di ricerca?",
        rispostaCorretta: "Google",
        risposteErrate: ["Facebook", "Zoom", "Outlook"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    17: {
        domanda: "Cosa si intende per 'dati personali'?",
        rispostaCorretta: "Informazioni che identificano una persona",
        risposteErrate: ["Numeri casuali", "File di sistema", "Dati statistici anonimi"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    18: {
        domanda: "Che cos’è una tabella di dati?",
        rispostaCorretta: "Una struttura che organizza informazioni in righe e colonne",
        risposteErrate: ["Un elenco di siti web", "Un grafico 3D", "Un codice di sicurezza"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    19: {
        domanda: "Quale formato è adatto per condividere testo semplice?",
        rispostaCorretta: ".txt",
        risposteErrate: [".mp3", ".png", ".exe"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },
    20: {
        domanda: "Cosa significa ‘salvare un file in cloud’?",
        rispostaCorretta: "Archiviare un file su un server remoto accessibile via Internet",
        risposteErrate: ["Scaricarlo su chiavetta", "Criptarlo", "Condividerlo solo offline"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 2
    },

    // 🧩 LIVELLO 3
    21: {
        domanda: "Come si verifica l’affidabilità di una fonte online?",
        rispostaCorretta: "Controllando autore, data e dominio del sito",
        risposteErrate: ["Guardando solo le immagini", "Se ha molti commenti", "Se appare su social media"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    22: {
        domanda: "Cosa si intende per 'fake news'?",
        rispostaCorretta: "Una notizia falsa o manipolata diffusa online",
        risposteErrate: ["Un errore di battitura", "Un commento negativo", "Un post privato"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    23: {
        domanda: "Che cos’è un dato strutturato?",
        rispostaCorretta: "Un’informazione organizzata in modo regolare e leggibile da software",
        risposteErrate: ["Un dato casuale", "Un testo libero", "Un file audio"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    24: {
        domanda: "Che cos’è un metadato?",
        rispostaCorretta: "Un’informazione che descrive un altro dato",
        risposteErrate: ["Un virus informatico", "Un link", "Un’app di posta"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    25: {
        domanda: "Come si può ridurre il sovraccarico informativo?",
        rispostaCorretta: "Usando filtri, parole chiave e fonti affidabili",
        risposteErrate: ["Ignorando tutte le notizie", "Leggendo tutto", "Disattivando Internet"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    26: {
        domanda: "Cos’è la data di pubblicazione di un contenuto online?",
        rispostaCorretta: "Il giorno in cui il contenuto è stato pubblicato o aggiornato",
        risposteErrate: ["La data di scadenza", "La data di registrazione dell’utente", "Il numero di commenti"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    27: {
        domanda: "Che cosa significa ‘indicizzazione’ di un sito web?",
        rispostaCorretta: "Il processo con cui un motore di ricerca lo aggiunge al suo database",
        risposteErrate: ["L’iscrizione a un social", "La traduzione automatica", "L’invio di un’email"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    28: {
        domanda: "Come si può verificare se un’immagine è autentica?",
        rispostaCorretta: "Facendo una ricerca inversa su Google Immagini",
        risposteErrate: ["Aprendola in Paint", "Scaricandola più volte", "Guardando la risoluzione"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    29: {
        domanda: "Che cosa si intende per ‘tracciamento online’?",
        rispostaCorretta: "La raccolta dei dati di navigazione degli utenti",
        risposteErrate: ["La memorizzazione di password", "L’uso di VPN", "L’invio di newsletter"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },
    30: {
        domanda: "Cosa rappresenta un grafico a barre?",
        rispostaCorretta: "Una rappresentazione visiva di dati quantitativi",
        risposteErrate: ["Un codice HTML", "Un testo", "Un file compresso"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 3
    },

    // ... (livelli 4 e 5 continuano nello stesso formato)
// 🧩 LIVELLO 4
    31: {
        domanda: "Che cosa si intende per ‘algoritmo di raccomandazione’?",
        rispostaCorretta: "Un sistema che suggerisce contenuti in base ai dati dell’utente",
        risposteErrate: ["Un programma di traduzione", "Un antivirus", "Un file di configurazione"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    32: {
        domanda: "Come si può identificare un sito di disinformazione?",
        rispostaCorretta: "Analizzando la fonte, il linguaggio e verificando le notizie altrove",
        risposteErrate: ["Se ha molti annunci", "Se ha un logo colorato", "Se è condiviso da amici"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    33: {
        domanda: "Cosa significa ‘bias informativo’?",
        rispostaCorretta: "Una distorsione o parzialità nella presentazione dei dati",
        risposteErrate: ["Un errore del computer", "Un virus informatico", "Una nuova tecnologia"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    34: {
        domanda: "Come si possono proteggere i propri dati durante la navigazione?",
        rispostaCorretta: "Usando HTTPS, VPN e impostazioni di privacy adeguate",
        risposteErrate: ["Condividendo meno post", "Chiudendo il browser spesso", "Usando lo stesso account ovunque"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    35: {
        domanda: "Che cos’è la ‘profilazione degli utenti’?",
        rispostaCorretta: "L’analisi dei comportamenti online per creare profili personalizzati",
        risposteErrate: ["Un metodo di crittografia", "Un formato di file", "Un sistema di backup"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    36: {
        domanda: "Che cos’è un ‘open data’?",
        rispostaCorretta: "Un insieme di dati accessibili e riutilizzabili liberamente",
        risposteErrate: ["Un file privato", "Un dato criptato", "Un’informazione riservata"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    37: {
        domanda: "Cosa indica l’acronimo API?",
        rispostaCorretta: "Application Programming Interface",
        risposteErrate: ["Advanced Personal Internet", "Automatic Program Installation", "Access Point Information"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    38: {
        domanda: "Che differenza c’è tra dati quantitativi e qualitativi?",
        rispostaCorretta: "I quantitativi sono numerici, i qualitativi descrivono caratteristiche",
        risposteErrate: ["Non c’è differenza", "Dipende dal formato del file", "Solo i quantitativi sono digitali"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    39: {
        domanda: "Cos’è un file JSON?",
        rispostaCorretta: "Un formato testuale per scambiare dati strutturati tra sistemi",
        risposteErrate: ["Un’immagine", "Un file audio", "Un archivio ZIP"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },
    40: {
        domanda: "Che cosa significa ‘data visualization’?",
        rispostaCorretta: "La rappresentazione grafica di dati complessi per facilitarne la comprensione",
        risposteErrate: ["La ricerca di file", "La compressione dei dati", "L’analisi del codice sorgente"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 4
    },

// 🧩 LIVELLO 5
    41: {
        domanda: "Come si può verificare l’autenticità di un documento digitale?",
        rispostaCorretta: "Controllando la firma digitale o il certificato del documento",
        risposteErrate: ["Guardando il nome del file", "Stampandolo", "Condividendolo online"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    42: {
        domanda: "Che cosa si intende per ‘intelligenza artificiale nei motori di ricerca’?",
        rispostaCorretta: "L’uso di algoritmi che comprendono il contesto e migliorano i risultati",
        risposteErrate: ["L’uso di pubblicità automatica", "Un virus", "Un servizio di archiviazione"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    43: {
        domanda: "Come si può valutare la qualità dei dati raccolti?",
        rispostaCorretta: "Analizzando accuratezza, completezza e aggiornamento",
        risposteErrate: ["Guardando la lunghezza del file", "Basandosi su opinioni", "Controllando la dimensione in MB"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    44: {
        domanda: "Cosa indica il termine ‘data mining’?",
        rispostaCorretta: "L’analisi automatica di grandi quantità di dati per estrarre informazioni utili",
        risposteErrate: ["La cancellazione dei dati", "La crittografia dei file", "L’archiviazione su cloud"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    45: {
        domanda: "Che cos’è un ‘dataset’?",
        rispostaCorretta: "Un insieme strutturato di dati utilizzato per analisi o addestramento AI",
        risposteErrate: ["Un programma di scrittura", "Un database vuoto", "Un grafico"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    46: {
        domanda: "Come si può rilevare una manipolazione di immagini digitali?",
        rispostaCorretta: "Analizzando metadati o usando software di verifica delle immagini",
        risposteErrate: ["Riducendo la risoluzione", "Aumentando il contrasto", "Stampandola in bianco e nero"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    47: {
        domanda: "Che cos’è la ‘data governance’?",
        rispostaCorretta: "L’insieme di regole e processi per gestire e proteggere i dati in un’organizzazione",
        risposteErrate: ["Una piattaforma social", "Un tipo di cloud", "Un algoritmo di ricerca"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    48: {
        domanda: "Cosa si intende per ‘big data’?",
        rispostaCorretta: "Grandi volumi di dati complessi che richiedono strumenti avanzati per l’analisi",
        risposteErrate: ["Un grande database Excel", "Un backup", "Un formato video"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    49: {
        domanda: "Che cos’è l’open access?",
        rispostaCorretta: "La libera disponibilità online di contenuti scientifici e accademici",
        risposteErrate: ["Un tipo di cloud storage", "Un software a pagamento", "Un social network"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },
    50: {
        domanda: "Come si può garantire la qualità dei dati nei progetti digitali?",
        rispostaCorretta: "Definendo procedure di validazione e controllo continuo",
        risposteErrate: ["Cancellando file vecchi", "Salvando solo i dati nuovi", "Usando qualsiasi fonte disponibile"],
        area: "Alfabetizzazione su informazioni e dati",
        livelloDifficolta: 5
    },

// 📚 AREA: Comunicazione e collaborazione

// 🧩 LIVELLO 1
    51: {
        domanda: "Qual è lo scopo principale di una email?",
        rispostaCorretta: "Comunicare messaggi in forma scritta",
        risposteErrate: ["Creare video", "Modificare documenti", "Disegnare immagini"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    52: {
        domanda: "Cosa significa CC in un’email?",
        rispostaCorretta: "Carbon Copy, per inviare una copia a qualcuno",
        risposteErrate: ["Computer Code", "Creative Content", "Copy Center"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    53: {
        domanda: "Qual è un vantaggio principale di una chat di gruppo?",
        rispostaCorretta: "Permette di comunicare con più persone contemporaneamente",
        risposteErrate: ["Riduce la memoria del computer", "Protegge i dati", "Crea video automatici"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    54: {
        domanda: "Cosa si intende per videoconferenza?",
        rispostaCorretta: "Una riunione svolta online con audio e video",
        risposteErrate: ["Un programma di grafica", "Un file audio", "Una rete di computer"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    55: {
        domanda: "Quale piattaforma è utilizzata per condividere documenti in cloud?",
        rispostaCorretta: "Google Drive",
        risposteErrate: ["Paint", "Windows Media Player", "Outlook Calendar"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    56: {
        domanda: "Che cos’è un profilo online?",
        rispostaCorretta: "Una rappresentazione digitale di una persona o organizzazione",
        risposteErrate: ["Un software antivirus", "Un file di backup", "Una rete locale"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    57: {
        domanda: "Qual è la funzione principale dei social network?",
        rispostaCorretta: "Permettere alle persone di connettersi e comunicare",
        risposteErrate: ["Elaborare fogli di calcolo", "Proteggere dati sensibili", "Creare software"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    58: {
        domanda: "Cosa significa ‘reply all’ in una email?",
        rispostaCorretta: "Rispondere a tutti i destinatari della email",
        risposteErrate: ["Cancellare tutti i messaggi", "Rispondere solo al mittente originale", "Inviare un allegato"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    59: {
        domanda: "Qual è lo scopo di un forum online?",
        rispostaCorretta: "Discutere e condividere informazioni su argomenti specifici",
        risposteErrate: ["Creare giochi", "Registrare video", "Inviare virus"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    60: {
        domanda: "Cosa significa ‘messaggistica istantanea’?",
        rispostaCorretta: "Scambiare messaggi in tempo reale tramite internet",
        risposteErrate: ["Inviare email programmate", "Creare presentazioni", "Archiviare dati su cloud"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 1
    },
    // 🧩 LIVELLO 2
    61: {
        domanda: "Qual è un vantaggio principale dei calendari condivisi online?",
        rispostaCorretta: "Permettono di coordinare riunioni e scadenze tra più persone",
        risposteErrate: ["Proteggono il computer dai virus", "Creano backup automatici", "Modificano i file PDF"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    62: {
        domanda: "Cosa significa ‘thread’ in una discussione online?",
        rispostaCorretta: "Una serie di messaggi collegati su un singolo argomento",
        risposteErrate: ["Un tipo di software", "Un virus informatico", "Un allegato email"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    63: {
        domanda: "Quale funzione di un software di collaborazione permette la modifica simultanea di documenti?",
        rispostaCorretta: "Editing in tempo reale",
        risposteErrate: ["Stampa automatica", "Backup online", "Invio di email"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    64: {
        domanda: "Cosa significa ‘taggare’ qualcuno in un post?",
        rispostaCorretta: "Indicare o menzionare una persona nel contenuto",
        risposteErrate: ["Cancellare il post", "Salvare il post sul computer", "Creare un nuovo account"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    65: {
        domanda: "Qual è lo scopo principale di un canale di comunicazione aziendale?",
        rispostaCorretta: "Facilitare lo scambio di informazioni tra team",
        risposteErrate: ["Creare video tutorial", "Proteggere il computer dai malware", "Stampare documenti"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    66: {
        domanda: "Cosa si intende per ‘moderazione di contenuti’?",
        rispostaCorretta: "Controllare e gestire ciò che viene pubblicato online",
        risposteErrate: ["Creare nuove applicazioni", "Analizzare dati quantitativi", "Inviare newsletter"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    67: {
        domanda: "Qual è una funzione chiave di un forum educativo?",
        rispostaCorretta: "Permettere lo scambio di conoscenze tra studenti e insegnanti",
        risposteErrate: ["Archiviare file musicali", "Creare backup di sistema", "Gestire hardware"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    68: {
        domanda: "Che cos’è un webinar?",
        rispostaCorretta: "Una lezione o seminario svolto online",
        risposteErrate: ["Un software antivirus", "Un file PDF", "Un backup automatico"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    69: {
        domanda: "Cosa significa ‘feedback costruttivo’?",
        rispostaCorretta: "Osservazioni utili per migliorare un lavoro o comportamento",
        risposteErrate: ["Critiche distruttive", "Commenti privati", "Segnalazioni di errore del software"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    70: {
        domanda: "Qual è un vantaggio dell’uso di strumenti di chat per team distribuiti?",
        rispostaCorretta: "Consentono una comunicazione rapida e coordinata anche a distanza",
        risposteErrate: ["Migliorano la qualità del video", "Proteggono dai virus", "Stampano documenti automaticamente"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 2
    },
    71: {
        domanda: "Cosa significa ‘protocollo di comunicazione’ in informatica?",
        rispostaCorretta: "Regole che consentono lo scambio di informazioni tra sistemi",
        risposteErrate: ["Un tipo di computer", "Un software di grafica", "Un file musicale"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    72: {
        domanda: "Qual è la differenza tra email formale e informale?",
        rispostaCorretta: "Tono, struttura e linguaggio utilizzato",
        risposteErrate: ["La dimensione dell’allegato", "Il provider email", "Il numero di destinatari"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    73: {
        domanda: "Cosa si intende per netiquette?",
        rispostaCorretta: "Regole di comportamento corretto online",
        risposteErrate: ["Un software antivirus", "Un linguaggio di programmazione", "Un tipo di cloud storage"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    74: {
        domanda: "Qual è il vantaggio di usare emoji o reazioni nei messaggi?",
        rispostaCorretta: "Comunicare emozioni e chiarire il tono del messaggio",
        risposteErrate: ["Aumentare lo spazio di archiviazione", "Proteggere dai virus", "Ridurre la banda internet"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    75: {
        domanda: "Cosa significa ‘collaborazione asincrona’?",
        rispostaCorretta: "Lavorare insieme senza essere connessi nello stesso momento",
        risposteErrate: ["Lavorare nello stesso posto", "Usare lo stesso computer", "Inviare file offline"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    76: {
        domanda: "Quale strumento permette di organizzare progetti e attività di gruppo online?",
        rispostaCorretta: "Kanban o software di project management",
        risposteErrate: ["Email personale", "Foglio di calcolo singolo", "Browser web"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    77: {
        domanda: "Cosa significa ‘moderatore’ in un forum o chat?",
        rispostaCorretta: "Una persona che controlla e gestisce la conversazione",
        risposteErrate: ["Un programmatore", "Un virus informatico", "Un file di backup"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    78: {
        domanda: "Qual è l’obiettivo principale di una piattaforma wiki?",
        rispostaCorretta: "Creare e condividere contenuti collaborativi modificabili da più utenti",
        risposteErrate: ["Archiviare email", "Proteggere dati sensibili", "Creare video"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    79: {
        domanda: "Cosa indica la funzione ‘share screen’ durante una videoconferenza?",
        rispostaCorretta: "Mostrare il proprio schermo agli altri partecipanti",
        risposteErrate: ["Registrare la chiamata", "Inviare un allegato", "Bloccare i messaggi"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    80: {
        domanda: "Qual è un vantaggio dell’uso di chat aziendali rispetto all’email?",
        rispostaCorretta: "Comunicazione più immediata e organizzata per team",
        risposteErrate: ["Aumentano la sicurezza dei dati", "Cancellano automaticamente gli allegati", "Creano grafici automaticamente"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 3
    },
    81: {
        domanda: "Cosa significa ‘gestione dei conflitti online’?",
        rispostaCorretta: "Risolvere controversie tra utenti rispettando le regole",
        risposteErrate: ["Cancellare tutti i messaggi", "Bloccare gli utenti a caso", "Modificare il contenuto del server"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    82: {
        domanda: "Che cos’è un workspace digitale?",
        rispostaCorretta: "Un ambiente online per collaborare su progetti e documenti",
        risposteErrate: ["Un tipo di computer", "Un file musicale", "Una connessione internet"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    83: {
        domanda: "Cosa si intende per ‘sincronizzazione dei documenti’?",
        rispostaCorretta: "Aggiornare file su diversi dispositivi in tempo reale",
        risposteErrate: ["Copiare file su chiavetta USB", "Stampare tutti i file", "Inviare email multiple"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    84: {
        domanda: "Qual è una pratica di sicurezza importante nelle piattaforme collaborative?",
        rispostaCorretta: "Usare password forti e autenticazione a due fattori",
        risposteErrate: ["Usare lo stesso account per tutti", "Condividere password via email", "Ignorare aggiornamenti software"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    85: {
        domanda: "Cosa significa ‘commento costruttivo’ in un contesto collaborativo?",
        rispostaCorretta: "Suggerimenti utili per migliorare un lavoro",
        risposteErrate: ["Critiche offensive", "Eliminare i file altrui", "Inviare emoji senza testo"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    86: {
        domanda: "Qual è il vantaggio di usare strumenti di gestione dei compiti?",
        rispostaCorretta: "Permettono di assegnare, monitorare e completare attività in gruppo",
        risposteErrate: ["Creano automaticamente grafici", "Proteggono dai virus", "Inviano notifiche spam"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    87: {
        domanda: "Cosa si intende per ‘collaborazione in cloud’?",
        rispostaCorretta: "Condividere e modificare documenti online tra più utenti",
        risposteErrate: ["Archiviare dati solo sul computer locale", "Inviare email a tutti gli utenti", "Creare copie cartacee"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    88: {
        domanda: "Qual è il ruolo dei thread in piattaforme collaborative avanzate?",
        rispostaCorretta: "Organizzare le discussioni per argomenti specifici",
        risposteErrate: ["Cancellare documenti", "Bloccare utenti", "Inviare notifiche automatiche"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    89: {
        domanda: "Cosa significa ‘notifica push’?",
        rispostaCorretta: "Messaggio inviato automaticamente a un dispositivo per informare l’utente",
        risposteErrate: ["Stampare documenti", "Aprire una cartella", "Inviare email anonime"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    90: {
        domanda: "Qual è un vantaggio dell’uso di strumenti di collaborazione multimediale?",
        rispostaCorretta: "Permettono di condividere testi, immagini, video e audio in modo integrato",
        risposteErrate: ["Proteggono il computer dai virus", "Aumentano la risoluzione dello schermo", "Creano backup automatici non richiesti"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 4
    },
    91: {
        domanda: "Cosa significa ‘integrazione tra piattaforme’ in contesti collaborativi?",
        rispostaCorretta: "Consentire la comunicazione e scambio di dati tra diversi strumenti digitali",
        risposteErrate: ["Creare più account", "Usare solo email", "Bloccare le notifiche"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    92: {
        domanda: "Qual è l’obiettivo di un protocollo di collaborazione sicura?",
        rispostaCorretta: "Proteggere dati e comunicazioni tra utenti",
        risposteErrate: ["Aumentare la velocità della connessione", "Creare documenti automaticamente", "Inviare pubblicità"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    93: {
        domanda: "Cosa si intende per ‘gestione avanzata dei permessi’?",
        rispostaCorretta: "Controllare chi può leggere, modificare o condividere contenuti",
        risposteErrate: ["Cancellare tutto automaticamente", "Inviare email senza limiti", "Creare nuovi utenti senza restrizioni"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    94: {
        domanda: "Qual è il vantaggio di usare piattaforme collaborative con versioning?",
        rispostaCorretta: "Tenere traccia delle modifiche e ripristinare versioni precedenti",
        risposteErrate: ["Aumentare la dimensione del file", "Proteggere solo le immagini", "Inviare notifiche anonime"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    95: {
        domanda: "Cosa significa ‘workflow digitale’?",
        rispostaCorretta: "Serie di processi coordinati online per completare un progetto",
        risposteErrate: ["Inviare email multiple", "Stampare documenti", "Archiviare file offline"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    96: {
        domanda: "Qual è un principio chiave della comunicazione digitale efficace?",
        rispostaCorretta: "Chiarezza, concisione e adattamento al pubblico",
        risposteErrate: ["Usare solo emoji", "Scrivere testi lunghi", "Inviare sempre allegati grandi"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    97: {
        domanda: "Cosa significa ‘collaborazione interoperabile’?",
        rispostaCorretta: "Collaborare usando sistemi e software differenti che comunicano tra loro",
        risposteErrate: ["Usare lo stesso software per tutti", "Inviare file solo offline", "Creare copie cartacee dei documenti"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    98: {
        domanda: "Qual è lo scopo dei log di attività in piattaforme collaborative?",
        rispostaCorretta: "Tracciare modifiche, accessi e operazioni effettuate dagli utenti",
        risposteErrate: ["Creare backup automatici", "Inviare notifiche inutili", "Proteggere solo le immagini"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    99: {
        domanda: "Cosa significa ‘gestione dei progetti digitali’ avanzata?",
        rispostaCorretta: "Organizzare risorse, tempi e collaboratori usando strumenti digitali",
        risposteErrate: ["Creare email automatiche", "Stampare documenti senza limiti", "Inviare notifiche spam"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    100: {
        domanda: "Qual è l’importanza del backup dei dati in ambienti collaborativi?",
        rispostaCorretta: "Garantire la disponibilità e sicurezza delle informazioni condivise",
        risposteErrate: ["Aumentare la velocità del browser", "Bloccare utenti indesiderati", "Creare nuovi account automaticamente"],
        area: "Comunicazione e collaborazione",
        livelloDifficolta: 5
    },
    101: {
        domanda: "Qual è lo scopo principale di un editor di testo?",
        rispostaCorretta: "Scrivere e modificare documenti",
        risposteErrate: ["Creare video", "Modificare immagini", "Gestire email"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    102: {
        domanda: "Cosa permette di fare un programma di disegno digitale?",
        rispostaCorretta: "Creare immagini e grafica al computer",
        risposteErrate: ["Scrivere email", "Inviare messaggi istantanei", "Gestire fogli di calcolo"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    103: {
        domanda: "Quale formato di file è usato per le immagini digitali più comuni?",
        rispostaCorretta: "JPEG o PNG",
        risposteErrate: ["DOCX", "MP3", "ZIP"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    104: {
        domanda: "Che cos’è un template?",
        rispostaCorretta: "Un modello predefinito per creare contenuti più velocemente",
        risposteErrate: ["Un software antivirus", "Un tipo di email", "Un browser web"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    105: {
        domanda: "Cosa significa ‘inserire un’immagine in un documento’?",
        rispostaCorretta: "Aggiungere un’immagine all’interno di un testo",
        risposteErrate: ["Stampare il documento", "Salvare il documento come PDF", "Inviare il documento via email"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    106: {
        domanda: "Qual è lo scopo principale di un programma di presentazioni?",
        rispostaCorretta: "Creare diapositive per comunicare informazioni",
        risposteErrate: ["Scrivere codice", "Modificare foto", "Gestire email"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    107: {
        domanda: "Cosa si intende per ‘salvataggio’ di un file?",
        rispostaCorretta: "Conservare i dati sul computer o cloud",
        risposteErrate: ["Stampare i dati", "Cancellare il documento", "Condividere il file via email"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    108: {
        domanda: "Qual è una funzione base di un software di grafica?",
        rispostaCorretta: "Modificare colori e forme delle immagini",
        risposteErrate: ["Scrivere documenti testuali", "Creare email", "Archiviare file PDF"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    109: {
        domanda: "Cosa permette di fare un programma di video editing semplice?",
        rispostaCorretta: "Tagliare e unire video",
        risposteErrate: ["Scrivere testi", "Disegnare immagini vettoriali", "Creare tabelle Excel"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    110: {
        domanda: "Cosa significa ‘duplicare un elemento’ in un software creativo?",
        rispostaCorretta: "Creare una copia identica dell’elemento",
        risposteErrate: ["Cancellare l’elemento", "Modificare solo il colore", "Salvare come PDF"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 1
    },
    111: {
        domanda: "Quale funzione permette di ridimensionare un’immagine senza distorcerla?",
        rispostaCorretta: "Mantieni proporzioni",
        risposteErrate: ["Ritaglia automatico", "Inverti colori", "Duplica livello"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    112: {
        domanda: "Cosa significa ‘formattare un testo’?",
        rispostaCorretta: "Modificare font, dimensione, colore e allineamento",
        risposteErrate: ["Salvare il testo", "Stampare il documento", "Aggiungere immagini"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    113: {
        domanda: "Qual è l’obiettivo di un software di impaginazione?",
        rispostaCorretta: "Creare documenti strutturati con testo e immagini",
        risposteErrate: ["Scrivere email", "Creare fogli di calcolo", "Disegnare solo forme geometriche"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    114: {
        domanda: "Cosa permette di fare uno strumento di disegno vettoriale?",
        rispostaCorretta: "Creare immagini scalabili senza perdita di qualità",
        risposteErrate: ["Creare solo bitmap", "Stampare documenti", "Inviare email"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    115: {
        domanda: "Qual è la funzione principale di un software di presentazione avanzata?",
        rispostaCorretta: "Aggiungere animazioni, transizioni e contenuti multimediali",
        risposteErrate: ["Scrivere email", "Modificare immagini JPEG", "Creare fogli Excel"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    116: {
        domanda: "Cosa significa ‘allineamento del testo’?",
        rispostaCorretta: "Posizionare il testo a sinistra, destra, centro o giustificato",
        risposteErrate: ["Stampare il testo", "Modificare il colore del documento", "Creare PDF"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    117: {
        domanda: "Qual è la differenza tra raster e vettoriale?",
        rispostaCorretta: "Raster è a pixel, vettoriale è basato su forme geometriche",
        risposteErrate: ["Raster è più veloce, vettoriale è lento", "Vettoriale non può essere stampato", "Raster crea solo testo"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    118: {
        domanda: "Cosa significa ‘aggiungere un livello’ in un software di grafica?",
        rispostaCorretta: "Creare un nuovo strato per separare elementi visivi",
        risposteErrate: ["Salvare il file", "Stampare il documento", "Creare un nuovo file"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    119: {
        domanda: "Cosa permette di fare la funzione ‘copia-incolla’ in software creativi?",
        rispostaCorretta: "Duplicare testo, immagini o elementi tra file o sezioni",
        risposteErrate: ["Modificare il colore", "Rimuovere il file", "Inviare email automaticamente"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    120: {
        domanda: "Qual è il vantaggio di usare scorciatoie da tastiera in software di grafica?",
        rispostaCorretta: "Velocizzare le operazioni e migliorare l’efficienza",
        risposteErrate: ["Proteggere il file", "Creare backup automatici", "Stampare documenti"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 2
    },
    121: {
        domanda: "Cosa significa ‘effetto trasparenza’ in un’immagine?",
        rispostaCorretta: "Rendere parti dell’immagine semi-trasparenti",
        risposteErrate: ["Modificare solo il colore", "Aumentare la dimensione del file", "Bloccare il livello"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    122: {
        domanda: "Qual è lo scopo di un software di fotoritocco avanzato?",
        rispostaCorretta: "Modificare, correggere e migliorare immagini digitali",
        risposteErrate: ["Scrivere documenti testuali", "Gestire email", "Creare fogli di calcolo"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    123: {
        domanda: "Cosa significa ‘maschera di livello’?",
        rispostaCorretta: "Nascondere o mostrare parti di un livello senza cancellare",
        risposteErrate: ["Cancellare un livello", "Duplicare il file", "Convertire in PDF"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    124: {
        domanda: "Qual è il vantaggio di usare un software di animazione digitale?",
        rispostaCorretta: "Creare contenuti animati e interattivi",
        risposteErrate: ["Scrivere solo testi", "Stampare documenti", "Creare fogli di calcolo"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    125: {
        domanda: "Cosa significa ‘timeline’ in un software video?",
        rispostaCorretta: "Sequenza temporale in cui organizzare clip e audio",
        risposteErrate: ["Lista dei file salvati", "Menu delle impostazioni", "Archivio di immagini"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    126: {
        domanda: "Qual è la funzione di ‘keyframe’ in animazione digitale?",
        rispostaCorretta: "Definire punti chiave di movimento o effetto",
        risposteErrate: ["Salvare il file", "Stampare il documento", "Ridimensionare immagini"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    127: {
        domanda: "Cosa significa ‘ridimensionare mantenendo proporzioni’?",
        rispostaCorretta: "Modificare dimensioni senza alterare la forma",
        risposteErrate: ["Stampare automaticamente", "Cambiare solo il colore", "Invertire il file"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    128: {
        domanda: "Qual è lo scopo di un software di impaginazione avanzata?",
        rispostaCorretta: "Creare documenti complessi con layout professionale",
        risposteErrate: ["Scrivere email", "Creare solo testi semplici", "Inviare file"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    129: {
        domanda: "Cosa significa ‘renderizzare’ un video?",
        rispostaCorretta: "Generare il video finale elaborando tutte le modifiche",
        risposteErrate: ["Salvare il progetto come testo", "Stampare il video", "Aggiungere sottotitoli automaticamente"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    130: {
        domanda: "Qual è il vantaggio di usare formati vettoriali per loghi?",
        rispostaCorretta: "Scalabilità senza perdita di qualità",
        risposteErrate: ["File più pesanti", "Meno compatibili con il web", "Non modificabili"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 3
    },
    131: {
        domanda: "Cosa significa 'masking avanzato' in grafica digitale?",
        rispostaCorretta: "Applicare maschere precise per modificare parti specifiche dell’immagine",
        risposteErrate: ["Stampare un’immagine", "Ridurre il peso del file", "Aggiungere filtri automatici"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    132: {
        domanda: "Qual è lo scopo di usare livelli di regolazione?",
        rispostaCorretta: "Modificare colore e luminosità senza alterare il livello originale",
        risposteErrate: ["Cancellare contenuti", "Duplicare file", "Aumentare la risoluzione automaticamente"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    133: {
        domanda: "Cosa permette di fare uno strumento di tracciamento avanzato in video editing?",
        rispostaCorretta: "Seguire il movimento di un oggetto nella scena",
        risposteErrate: ["Modificare l’audio automaticamente", "Convertire il video in PDF", "Aggiungere testo statico"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    134: {
        domanda: "Cosa significa 'compositing' in grafica e video?",
        rispostaCorretta: "Unire più elementi visivi in un’unica immagine o scena",
        risposteErrate: ["Stampare immagini", "Aggiungere testo automatico", "Ridurre la risoluzione del video"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    135: {
        domanda: "Cosa indica la profondità di colore di un’immagine?",
        rispostaCorretta: "Numero di colori che possono essere rappresentati",
        risposteErrate: ["Dimensione del file in MB", "Numero di pixel orizzontali", "Numero di livelli nel documento"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    136: {
        domanda: "Cosa significa 'keying' in produzione video?",
        rispostaCorretta: "Rimuovere uno sfondo specifico usando un colore chiave (es. green screen)",
        risposteErrate: ["Aggiungere effetti sonori", "Creare animazioni 3D", "Ridurre dimensione del file"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    137: {
        domanda: "Qual è il vantaggio di usare file vettoriali in stampa professionale?",
        rispostaCorretta: "Mantengono qualità anche ingranditi",
        risposteErrate: ["Riduzione automatica del peso del file", "Aggiungono effetti speciali automaticamente", "Non possono essere stampati"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    138: {
        domanda: "Cosa indica la risoluzione di un video?",
        rispostaCorretta: "Numero di pixel orizzontali e verticali che compongono l’immagine",
        risposteErrate: ["Durata del video in minuti", "Dimensione del file in MB", "Numero di tracce audio"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    139: {
        domanda: "Cosa significa 'interpolazione dei fotogrammi'?",
        rispostaCorretta: "Creare fotogrammi intermedi per rendere più fluido un video",
        risposteErrate: ["Aumentare la luminosità dei fotogrammi", "Ridurre il peso del file video", "Unire audio e video"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    140: {
        domanda: "Qual è la funzione di una maschera alfa?",
        rispostaCorretta: "Definire la trasparenza di parti di un’immagine o video",
        risposteErrate: ["Stampare l’immagine", "Convertire il file in PDF", "Applicare filtri automatici"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 4
    },
    141: {
        domanda: "Cosa significa 'motion graphics avanzata'?",
        rispostaCorretta: "Creare animazioni complesse integrate con elementi grafici e testo",
        risposteErrate: ["Modificare solo immagini statiche", "Scrivere documenti testuali", "Creare fogli di calcolo"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    142: {
        domanda: "Qual è lo scopo di un software di modellazione 3D?",
        rispostaCorretta: "Creare oggetti tridimensionali per animazioni o stampa 3D",
        risposteErrate: ["Creare presentazioni semplici", "Scrivere testi", "Gestire email"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    143: {
        domanda: "Cosa significa 'tracking 3D' in post-produzione video?",
        rispostaCorretta: "Seguire il movimento della videocamera e integrare oggetti 3D",
        risposteErrate: ["Aumentare luminosità", "Ridurre dimensioni file", "Modificare solo audio"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    144: {
        domanda: "Cosa permette di fare il rendering in 3D?",
        rispostaCorretta: "Generare immagini o video finali realistici da modelli 3D",
        risposteErrate: ["Modificare testo", "Stampare un documento", "Aggiungere animazioni 2D"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    145: {
        domanda: "Cosa significa 'color grading avanzato'?",
        rispostaCorretta: "Regolare colori e toni del video per effetti professionali",
        risposteErrate: ["Aumentare la risoluzione automaticamente", "Ridurre la dimensione del file", "Modificare solo il testo"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    146: {
        domanda: "Qual è lo scopo dei layer 3D in software avanzati?",
        rispostaCorretta: "Gestire oggetti tridimensionali separati con profondità e illuminazione",
        risposteErrate: ["Creare solo testi", "Stampare PDF", "Ridurre dimensione file"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    147: {
        domanda: "Cosa significa 'motion capture'?",
        rispostaCorretta: "Registrare i movimenti reali per animazioni digitali",
        risposteErrate: ["Modificare colori in immagini", "Creare grafica vettoriale", "Aumentare la risoluzione dei video"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    148: {
        domanda: "Cosa significa 'compositing avanzato'?",
        rispostaCorretta: "Integrare elementi multipli con effetti realistici in video o immagini",
        risposteErrate: ["Stampare immagini", "Aggiungere solo testo", "Ridurre peso file"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    149: {
        domanda: "Cosa permette di fare la simulazione di luci in 3D?",
        rispostaCorretta: "Visualizzare l’effetto delle luci sugli oggetti digitali realistici",
        risposteErrate: ["Stampare il documento", "Modificare solo testo", "Aggiungere transizioni base"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    150: {
        domanda: "Qual è il vantaggio di usare formati video ad alta qualità (es. ProRes, DNxHD)?",
        rispostaCorretta: "Conservare dettagli e colori per post-produzione professionale",
        risposteErrate: ["Ridurre automaticamente la dimensione file", "Creare automaticamente sottotitoli", "Convertire in PDF"],
        area: "Creazione di contenuti digitali",
        livelloDifficolta: 5
    },
    151: {
        domanda: "Cosa significa avere una password sicura?",
        rispostaCorretta: "Usare una combinazione di lettere, numeri e simboli",
        risposteErrate: ["Usare solo il proprio nome", "Scrivere la password su un foglio", "Usare solo numeri facili da ricordare"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    152: {
        domanda: "Cosa è un antivirus?",
        rispostaCorretta: "Un software che protegge il computer dai virus",
        risposteErrate: ["Un tipo di firewall", "Un aggiornamento del sistema operativo", "Un software di grafica"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    153: {
        domanda: "Cosa bisogna fare prima di aprire un allegato email?",
        rispostaCorretta: "Verificare che provenga da un mittente affidabile",
        risposteErrate: ["Aprirlo subito", "Salvarlo senza controlli", "Condividerlo con tutti i contatti"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    154: {
        domanda: "Cosa significa aggiornare un software?",
        rispostaCorretta: "Installare le versioni più recenti per correggere problemi e migliorare la sicurezza",
        risposteErrate: ["Cambiare icone", "Copiare il software su un altro computer", "Aumentare lo spazio su disco"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    155: {
        domanda: "Cosa bisogna evitare di condividere online?",
        rispostaCorretta: "Informazioni personali sensibili",
        risposteErrate: ["Foto di paesaggi", "Link pubblici", "Commenti generici"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    156: {
        domanda: "Cosa è il phishing?",
        rispostaCorretta: "Tentativo di rubare dati personali tramite email o siti falsi",
        risposteErrate: ["Un tipo di virus informatico", "Un aggiornamento software", "Un firewall avanzato"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    157: {
        domanda: "Cosa bisogna fare se si riceve un messaggio sospetto?",
        rispostaCorretta: "Non aprirlo e segnalarlo",
        risposteErrate: ["Aprirlo subito", "Rispondere con i propri dati", "Inoltrarlo a tutti gli amici"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    158: {
        domanda: "Cosa significa autenticazione a due fattori (2FA)?",
        rispostaCorretta: "Richiedere due modi diversi per verificare l'identità",
        risposteErrate: ["Usare due password uguali", "Avere due account", "Condividere la password con un amico"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    159: {
        domanda: "Cosa è un firewall?",
        rispostaCorretta: "Un sistema che controlla e filtra il traffico di rete",
        risposteErrate: ["Un antivirus gratuito", "Un tipo di backup", "Un browser sicuro"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    160: {
        domanda: "Cosa bisogna fare quando si usa un Wi-Fi pubblico?",
        rispostaCorretta: "Evitare di accedere a dati sensibili senza protezione",
        risposteErrate: ["Accedere sempre a tutti i servizi", "Disattivare il firewall", "Condividere file personali"],
        area: "Sicurezza",
        livelloDifficolta: 1
    },
    161: {
        domanda: "Qual è la funzione di un backup regolare?",
        rispostaCorretta: "Salvare copie dei dati per proteggerli da perdita",
        risposteErrate: ["Aumentare la velocità del computer", "Cancellare file vecchi", "Modificare la password automaticamente"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    162: {
        domanda: "Cosa significa crittografia?",
        rispostaCorretta: "Trasformare i dati in un formato sicuro leggibile solo da chi ha la chiave",
        risposteErrate: ["Eliminare dati vecchi", "Comprimere file per risparmiare spazio", "Condividere file pubblicamente"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    163: {
        domanda: "Qual è il rischio di usare la stessa password per più account?",
        rispostaCorretta: "Se una viene violata, tutti gli account diventano vulnerabili",
        risposteErrate: ["Il computer diventa lento", "Le email vengono cancellate", "Si perde l’accesso a internet"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    164: {
        domanda: "Cosa significa malware?",
        rispostaCorretta: "Software dannoso progettato per danneggiare computer o rubare dati",
        risposteErrate: ["Software di grafica avanzata", "Un antivirus gratuito", "Un tipo di aggiornamento"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    165: {
        domanda: "Cosa bisogna fare se un dispositivo sembra infetto?",
        rispostaCorretta: "Scansionarlo con antivirus e isolare il dispositivo",
        risposteErrate: ["Ignorarlo e continuare a usarlo", "Condividere file con altri", "Formattare subito senza backup"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    166: {
        domanda: "Qual è lo scopo di un aggiornamento di sicurezza?",
        rispostaCorretta: "Correggere vulnerabilità e proteggere da nuove minacce",
        risposteErrate: ["Cambiare icone del sistema", "Aumentare solo la velocità", "Ridurre lo spazio occupato dai file"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    167: {
        domanda: "Cosa significa attacco di tipo 'ransomware'?",
        rispostaCorretta: "Blocco dei dati fino al pagamento di un riscatto",
        risposteErrate: ["Un virus che cancella tutto immediatamente", "Un aggiornamento di sicurezza", "Un tipo di backup automatico"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    168: {
        domanda: "Cosa è un accesso non autorizzato?",
        rispostaCorretta: "Quando qualcuno entra in un sistema senza permesso",
        risposteErrate: ["Un login corretto", "Una stampa di documento", "Un aggiornamento software"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    169: {
        domanda: "Cosa bisogna fare per proteggere i dati sul cloud?",
        rispostaCorretta: "Usare password forti e abilitare l’autenticazione a due fattori",
        risposteErrate: ["Condividerli pubblicamente", "Usare la stessa password per tutti i servizi", "Non fare mai backup"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    170: {
        domanda: "Qual è la funzione di un antivirus in tempo reale?",
        rispostaCorretta: "Monitorare continuamente il computer per rilevare minacce",
        risposteErrate: ["Pulire la tastiera", "Velocizzare internet", "Bloccare solo le email"],
        area: "Sicurezza",
        livelloDifficolta: 2
    },
    171: {
        domanda: "Cosa significa sniffing di rete?",
        rispostaCorretta: "Intercettare e analizzare i dati che transitano in rete",
        risposteErrate: ["Stampare dati online", "Cancellare dati dal server", "Bloccare virus locali"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    172: {
        domanda: "Qual è lo scopo di un certificato SSL?",
        rispostaCorretta: "Garantire la sicurezza e la crittografia delle comunicazioni web",
        risposteErrate: ["Aumentare la velocità del sito", "Ridurre il peso delle immagini", "Bloccare spam"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    173: {
        domanda: "Cosa significa vulnerabilità zero-day?",
        rispostaCorretta: "Una falla di sicurezza non ancora conosciuta e sfruttata dai malintenzionati",
        risposteErrate: ["Un virus vecchio di un giorno", "Un aggiornamento urgente", "Una copia di backup corrotta"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    174: {
        domanda: "Cosa indica il termine 'trojan'?",
        rispostaCorretta: "Software dannoso che si nasconde come programma legittimo",
        risposteErrate: ["Un tipo di firewall", "Un aggiornamento di sicurezza", "Un backup automatico"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    175: {
        domanda: "Cosa bisogna fare per proteggere una rete domestica?",
        rispostaCorretta: "Usare password complesse e aggiornare regolarmente il router",
        risposteErrate: ["Lasciare password di default", "Non aggiornare mai il router", "Condividere il Wi-Fi pubblicamente"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    176: {
        domanda: "Cosa significa spoofing?",
        rispostaCorretta: "Falsificare l’identità digitale per ingannare gli utenti",
        risposteErrate: ["Cancellare virus dal computer", "Aggiornare un software", "Proteggere file con password"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    177: {
        domanda: "Cosa indica un attacco DDoS?",
        rispostaCorretta: "Saturare un server o rete con traffico eccessivo per renderlo inutilizzabile",
        risposteErrate: ["Cancellare file locali", "Rubare password", "Modificare la grafica di un sito"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    178: {
        domanda: "Cosa è un keylogger?",
        rispostaCorretta: "Software che registra i tasti digitati per rubare informazioni",
        risposteErrate: ["Un programma di grafica", "Un firewall avanzato", "Un sistema di backup cloud"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    179: {
        domanda: "Cosa significa gestione dei privilegi?",
        rispostaCorretta: "Controllare chi può accedere a risorse o dati specifici",
        risposteErrate: ["Aggiornare il sistema operativo", "Installare antivirus", "Condividere file pubblicamente"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    180: {
        domanda: "Cosa significa autenticazione biometrica?",
        rispostaCorretta: "Usare caratteristiche fisiche (impronta, volto) per identificare un utente",
        risposteErrate: ["Usare due password uguali", "Inserire codice PIN condiviso", "Accedere tramite email pubblica"],
        area: "Sicurezza",
        livelloDifficolta: 3
    },
    181: {
        domanda: "Cosa significa sandboxing?",
        rispostaCorretta: "Eseguire programmi in un ambiente isolato per testare o contenere minacce",
        risposteErrate: ["Eliminare tutti i virus", "Aggiornare sistema operativo", "Cancellare file temporanei"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    182: {
        domanda: "Cosa è un IDS (Intrusion Detection System)?",
        rispostaCorretta: "Un sistema che rileva accessi non autorizzati o attività sospette in rete",
        risposteErrate: ["Un tipo di antivirus base", "Un software di grafica", "Un cloud storage"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    183: {
        domanda: "Cosa significa hardening di un sistema?",
        rispostaCorretta: "Rinforzare le impostazioni di sicurezza per ridurre vulnerabilità",
        risposteErrate: ["Aumentare la velocità del computer", "Stampare documenti in sicurezza", "Ridurre dimensioni file"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    184: {
        domanda: "Cosa significa sicurezza perimetrale?",
        rispostaCorretta: "Protezione dei confini della rete contro accessi esterni",
        risposteErrate: ["Protezione dei documenti locali", "Backup automatico dei file", "Crittografia delle email"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    185: {
        domanda: "Cosa indica il termine honeypot in sicurezza informatica?",
        rispostaCorretta: "Sistema trappola per attirare e analizzare attacchi",
        risposteErrate: ["Backup automatico dei file", "Firewall perimetrale", "Aggiornamento antivirus"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    186: {
        domanda: "Cosa significa threat intelligence?",
        rispostaCorretta: "Raccolta e analisi di informazioni sulle minacce informatiche",
        risposteErrate: ["Aggiornamento automatico dei software", "Creazione di grafica digitale", "Backup cloud dei dati"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    187: {
        domanda: "Cosa significa pen testing?",
        rispostaCorretta: "Testare un sistema simulando attacchi per identificare vulnerabilità",
        risposteErrate: ["Cancellare virus automaticamente", "Installare firewall base", "Aggiornare driver video"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    188: {
        domanda: "Cosa indica cifratura end-to-end?",
        rispostaCorretta: "I dati sono criptati dalla sorgente al destinatario senza poter essere letti da terzi",
        risposteErrate: ["Cancellazione automatica dei dati", "Backup su cloud pubblico", "Firewall base attivo"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    189: {
        domanda: "Cosa significa attacco di tipo brute force?",
        rispostaCorretta: "Tentativo di indovinare password provando tutte le combinazioni possibili",
        risposteErrate: ["Aggiornamento del software", "Esecuzione di backup", "Modifica dei permessi file"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    190: {
        domanda: "Cosa è la segmentazione di rete?",
        rispostaCorretta: "Dividere la rete in sottoreti per limitare accessi e aumentare sicurezza",
        risposteErrate: ["Cancellare file temporanei", "Backup automatico", "Aggiornamento antivirus"],
        area: "Sicurezza",
        livelloDifficolta: 4
    },
    191: {
        domanda: "Cosa significa attacco APT (Advanced Persistent Threat)?",
        rispostaCorretta: "Attacco sofisticato e prolungato mirato a un obiettivo specifico",
        risposteErrate: ["Un aggiornamento di sicurezza", "Un firewall avanzato", "Un antivirus gratuito"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    192: {
        domanda: "Cosa indica Zero Trust Security?",
        rispostaCorretta: "Non fidarsi automaticamente di nessun utente o dispositivo, nemmeno interni",
        risposteErrate: ["Usare solo password lunghe", "Aggiornare firewall mensilmente", "Backup automatico cloud"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    193: {
        domanda: "Cosa significa sicurezza dei dati in transito?",
        rispostaCorretta: "Protezione dei dati mentre viaggiano tra sistemi o reti",
        risposteErrate: ["Protezione dei dati solo sul disco", "Backup automatico giornaliero", "Eliminazione dei file temporanei"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    194: {
        domanda: "Cosa indica sicurezza dei dati a riposo?",
        rispostaCorretta: "Protezione dei dati archiviati su disco o server",
        risposteErrate: ["Protezione solo della rete", "Aggiornamento antivirus automatico", "Cancellazione automatica dei dati"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    195: {
        domanda: "Cosa significa gestione delle patch?",
        rispostaCorretta: "Installare aggiornamenti software per correggere vulnerabilità",
        risposteErrate: ["Cancellare file obsoleti", "Creare backup manuali", "Configurare firewall base"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    196: {
        domanda: "Cosa è un attacco man-in-the-middle?",
        rispostaCorretta: "Intercettare comunicazioni tra due utenti per rubare informazioni",
        risposteErrate: ["Un antivirus avanzato", "Una rete sicura", "Un backup automatico cloud"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    197: {
        domanda: "Cosa significa sicurezza proattiva?",
        rispostaCorretta: "Adottare misure preventive per impedire minacce prima che accadano",
        risposteErrate: ["Reagire solo agli attacchi", "Fare backup una volta l’anno", "Disattivare firewall"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    198: {
        domanda: "Cosa significa autenticazione basata su rischio?",
        rispostaCorretta: "Aumentare i controlli di sicurezza in base al rischio percepito dell’accesso",
        risposteErrate: ["Usare password lunghe sempre", "Aggiornare firewall ogni mese", "Backup automatico giornaliero"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    199: {
        domanda: "Cosa indica sicurezza end-to-end in applicazioni critiche?",
        rispostaCorretta: "Protezione completa dei dati dalla sorgente alla destinazione senza possibilità di lettura intermedia",
        risposteErrate: ["Backup locale dei dati", "Crittografia solo dei file di testo", "Aggiornamento antivirus automatico"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    200: {
        domanda: "Cosa significa threat modeling?",
        rispostaCorretta: "Identificare e analizzare possibili minacce prima che si verifichino",
        risposteErrate: ["Aggiornare software in ritardo", "Disattivare firewall", "Backup manuale sporadico"],
        area: "Sicurezza",
        livelloDifficolta: 5
    },
    201: {
        domanda: "Cosa fare se il computer non si accende?",
        rispostaCorretta: "Verificare l’alimentazione e i cavi collegati",
        risposteErrate: ["Reinstallare il sistema operativo subito", "Cercare virus online", "Cambiare il mouse"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    202: {
        domanda: "Cosa fare se un programma si blocca?",
        rispostaCorretta: "Chiuderlo e riaprirlo",
        risposteErrate: ["Spegnere il computer senza salvare", "Cancellare tutti i file", "Installare un antivirus"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    203: {
        domanda: "Cosa fare se il Wi-Fi non funziona?",
        rispostaCorretta: "Controllare router e connessione",
        risposteErrate: ["Comprare un nuovo computer", "Spegnere il modem e non riaccenderlo", "Cancellare la cronologia del browser"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    204: {
        domanda: "Cosa fare se lo schermo è nero ma il computer è acceso?",
        rispostaCorretta: "Verificare i cavi e la luminosità",
        risposteErrate: ["Buttare il computer", "Accendere un altro monitor senza spegnere", "Formattare subito il sistema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    205: {
        domanda: "Cosa fare se il mouse non risponde?",
        rispostaCorretta: "Controllare la batteria o il collegamento",
        risposteErrate: ["Comprare un nuovo mouse senza controllare", "Cambiare il sistema operativo", "Spegnere il computer senza motivo"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    206: {
        domanda: "Cosa fare se la stampante non stampa?",
        rispostaCorretta: "Controllare toner, carta e connessione",
        risposteErrate: ["Disinstallare il computer", "Cambiare browser", "Spegnere il modem"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    207: {
        domanda: "Cosa fare se una finestra di programma non si chiude?",
        rispostaCorretta: "Usare Gestione attività per terminarla",
        risposteErrate: ["Spegnere il computer senza salvare", "Cancellare tutti i file", "Riavviare internet"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    208: {
        domanda: "Cosa fare se un file non si apre?",
        rispostaCorretta: "Verificare che il programma giusto sia installato",
        risposteErrate: ["Cancellare tutti i file simili", "Cambiare sistema operativo", "Spegnere il computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    209: {
        domanda: "Cosa fare se l’audio non funziona?",
        rispostaCorretta: "Controllare volume, driver e collegamenti",
        risposteErrate: ["Comprare nuove casse senza controllare", "Cambiare browser", "Formattare il computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    210: {
        domanda: "Cosa fare se il computer è lento?",
        rispostaCorretta: "Chiudere programmi inutili e verificare lo spazio disco",
        risposteErrate: ["Riavviare senza fare nulla", "Cancellare il sistema operativo", "Installare mille programmi nuovi"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 1
    },
    211: {
        domanda: "Cosa fare se il browser non carica pagine?",
        rispostaCorretta: "Verificare la connessione e cancellare cache e cookie",
        risposteErrate: ["Spegnere il computer", "Cambiare monitor", "Disinstallare il sistema operativo"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    212: {
        domanda: "Cosa fare se un’applicazione si aggiorna male?",
        rispostaCorretta: "Disinstallarla e reinstallare la versione corretta",
        risposteErrate: ["Spegnere il computer", "Ignorare il problema", "Cancellare documenti personali"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    213: {
        domanda: "Cosa fare se il disco è quasi pieno?",
        rispostaCorretta: "Eliminare file inutili e fare pulizia del disco",
        risposteErrate: ["Comprare un nuovo computer", "Formattare senza backup", "Installare antivirus"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    214: {
        domanda: "Cosa fare se la rete locale non funziona?",
        rispostaCorretta: "Controllare router, cavi e impostazioni IP",
        risposteErrate: ["Cambiare tutti i dispositivi", "Spegnere il computer senza controllare", "Disinstallare internet"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    215: {
        domanda: "Cosa fare se un programma da errore di compatibilità?",
        rispostaCorretta: "Verificare requisiti e aggiornamenti del software",
        risposteErrate: ["Cancellare il computer", "Cambiare monitor", "Spegnere la stampante"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    216: {
        domanda: "Cosa fare se i driver non funzionano correttamente?",
        rispostaCorretta: "Aggiornare o reinstallare i driver appropriati",
        risposteErrate: ["Ignorare il problema", "Disinstallare il computer", "Cambiare sistema operativo ogni giorno"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    217: {
        domanda: "Cosa fare se il computer si surriscalda?",
        rispostaCorretta: "Verificare ventilazione, polvere e temperatura ambiente",
        risposteErrate: ["Spegnere il computer e lasciarlo chiuso", "Accendere più programmi pesanti", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    218: {
        domanda: "Cosa fare se un dispositivo USB non viene riconosciuto?",
        rispostaCorretta: "Provare un’altra porta o aggiornare driver",
        risposteErrate: ["Buttarlo via subito", "Spegnere il computer senza verificare", "Formattare il disco rigido"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    219: {
        domanda: "Cosa fare se un software va in crash ripetutamente?",
        rispostaCorretta: "Verificare aggiornamenti e reinstallare se necessario",
        risposteErrate: ["Cancellare tutti i file del computer", "Cambiare monitor", "Disattivare internet"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    220: {
        domanda: "Cosa fare se ci sono conflitti tra programmi?",
        rispostaCorretta: "Chiudere i programmi in conflitto e aggiornare il software",
        risposteErrate: ["Ignorare il conflitto", "Cancellare il sistema operativo", "Spegnere il monitor"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 2
    },
    221: {
        domanda: "Cosa fare se un software mostra errori sconosciuti?",
        rispostaCorretta: "Consultare il log degli errori e la documentazione ufficiale",
        risposteErrate: ["Disinstallare tutto il computer", "Ignorare l’errore", "Spegnere il monitor"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    222: {
        domanda: "Come risolvere conflitti tra versioni diverse di uno stesso programma?",
        rispostaCorretta: "Disinstallare le versioni obsolete e mantenere solo quella aggiornata",
        risposteErrate: ["Copiare tutti i file in una cartella", "Spegnere il computer", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    223: {
        domanda: "Come affrontare problemi di lentezza causati da troppi processi in background?",
        rispostaCorretta: "Chiudere i processi non necessari e ottimizzare l’avvio automatico",
        risposteErrate: ["Spegnere il computer continuamente", "Formattare il disco senza backup", "Disinstallare antivirus"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    224: {
        domanda: "Cosa fare se un aggiornamento di sistema fallisce ripetutamente?",
        rispostaCorretta: "Verificare spazio disponibile, connessione e log degli errori",
        risposteErrate: ["Ignorare l’aggiornamento", "Cancellare tutti i file", "Spegnere il computer e basta"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    225: {
        domanda: "Come risolvere problemi di rete intermittente?",
        rispostaCorretta: "Controllare cavi, router, driver e configurazioni IP",
        risposteErrate: ["Ignorare il problema", "Spegnere il computer", "Disinstallare internet"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    226: {
        domanda: "Cosa fare se un programma non è compatibile con il sistema operativo?",
        rispostaCorretta: "Usare versioni compatibili o ambienti virtuali",
        risposteErrate: ["Forzare l’installazione", "Cambiare monitor", "Spegnere il computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    227: {
        domanda: "Come diagnosticare problemi hardware intermittenti?",
        rispostaCorretta: "Usare strumenti di diagnostica e testare componenti singolarmente",
        risposteErrate: ["Cambiare tutto l’hardware a caso", "Spegnere il computer", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    228: {
        domanda: "Cosa fare se i dati si corrompono frequentemente?",
        rispostaCorretta: "Verificare backup, integrità disco e eventuali virus",
        risposteErrate: ["Formattare senza backup", "Ignorare il problema", "Spegnere il computer senza salvare"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    229: {
        domanda: "Come risolvere problemi di autorizzazioni su file o cartelle?",
        rispostaCorretta: "Controllare utenti, permessi e proprietà dei file",
        risposteErrate: ["Eliminare tutti i file", "Cambiare il sistema operativo", "Spegnere il computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    230: {
        domanda: "Cosa fare se una periferica esterna non funziona correttamente?",
        rispostaCorretta: "Verificare driver, connessioni e compatibilità",
        risposteErrate: ["Buttarla via subito", "Spegnere il computer", "Formattare tutto il sistema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 3
    },
    231: {
        domanda: "Come risolvere problemi complessi di rete aziendale?",
        rispostaCorretta: "Analizzare topologia, log dei dispositivi e configurazioni avanzate",
        risposteErrate: ["Spegnere tutti i computer", "Cambiare solo i cavi", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    232: {
        domanda: "Cosa fare se un software critico fallisce dopo aggiornamento?",
        rispostaCorretta: "Ripristinare backup, controllare log e contattare supporto tecnico",
        risposteErrate: ["Disinstallare tutto il computer", "Ignorare il problema", "Spegnere il computer ripetutamente"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    233: {
        domanda: "Come risolvere problemi di sincronizzazione dati tra dispositivi?",
        rispostaCorretta: "Verificare connessione, account e integrità dei dati",
        risposteErrate: ["Cancellare tutti i dati", "Cambiare dispositivo senza verificare", "Spegnere il computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    234: {
        domanda: "Cosa fare se si sospetta malware persistente?",
        rispostaCorretta: "Usare strumenti avanzati di scansione e rimuovere minacce",
        risposteErrate: ["Ignorare il malware", "Disinstallare antivirus", "Spegnere il computer senza fare nulla"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    235: {
        domanda: "Come diagnosticare problemi di prestazioni server?",
        rispostaCorretta: "Monitorare risorse, log, e carico dei processi",
        risposteErrate: ["Spegnere il server continuamente", "Cancellare tutti i file", "Cambiare server senza analisi"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    236: {
        domanda: "Cosa fare se più programmi causano conflitti di risorse?",
        rispostaCorretta: "Analizzare le risorse utilizzate e ottimizzare la configurazione",
        risposteErrate: ["Ignorare i conflitti", "Formattare il computer", "Spegnere il monitor"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    237: {
        domanda: "Come risolvere problemi di backup fallito ripetutamente?",
        rispostaCorretta: "Verificare spazio, permessi e integrità del dispositivo di backup",
        risposteErrate: ["Ignorare il problema", "Cancellare tutto il disco", "Spegnere il computer senza fare nulla"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    238: {
        domanda: "Cosa fare se un database non risponde?",
        rispostaCorretta: "Controllare connessione, log e integrità dei dati",
        risposteErrate: ["Spegnere il server", "Cancellare tutti i record", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    239: {
        domanda: "Come risolvere problemi di compatibilità tra software aziendali?",
        rispostaCorretta: "Verificare versioni, aggiornamenti e dipendenze",
        risposteErrate: ["Disinstallare tutto", "Ignorare problemi di compatibilità", "Spegnere computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    240: {
        domanda: "Cosa fare se un’applicazione crittica mostra errori intermittenti?",
        rispostaCorretta: "Analizzare log, ambiente e riprodurre il problema per debug",
        risposteErrate: ["Ignorare gli errori", "Formattare il computer", "Spegnere il monitor"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 4
    },
    241: {
        domanda: "Come risolvere problemi critici di rete aziendale complessa?",
        rispostaCorretta: "Analizzare topologia, log dei dispositivi e configurazioni avanzate",
        risposteErrate: ["Spegnere tutti i computer", "Cambiare solo i cavi", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    242: {
        domanda: "Cosa fare se un sistema server va in crash durante operazioni critiche?",
        rispostaCorretta: "Ripristinare backup, analizzare log e notificare team tecnico",
        risposteErrate: ["Ignorare il crash", "Spegnere tutto senza backup", "Formattare immediatamente"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    243: {
        domanda: "Come diagnosticare problemi di sicurezza avanzata legati a malware persistente?",
        rispostaCorretta: "Usare strumenti avanzati, analizzare comportamenti e rimuovere minacce",
        risposteErrate: ["Disinstallare antivirus", "Ignorare il malware", "Spegnere computer senza analisi"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    244: {
        domanda: "Come risolvere problemi di performance critica su server con carichi elevati?",
        rispostaCorretta: "Monitorare risorse, bilanciare carico e ottimizzare configurazioni",
        risposteErrate: ["Spegnere il server ripetutamente", "Formattare senza backup", "Ignorare i problemi di performance"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    245: {
        domanda: "Cosa fare se più applicazioni enterprise causano conflitti gravi?",
        rispostaCorretta: "Analizzare le risorse condivise e ottimizzare la configurazione",
        risposteErrate: ["Disinstallare tutto", "Ignorare i conflitti", "Spegnere monitor"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    246: {
        domanda: "Come risolvere problemi critici di backup e disaster recovery?",
        rispostaCorretta: "Verificare integrità, permessi e testare procedure di ripristino",
        risposteErrate: ["Ignorare il backup fallito", "Cancellare tutti i dati", "Spegnere il computer senza fare nulla"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    247: {
        domanda: "Cosa fare se un database mission-critical diventa inaccessibile?",
        rispostaCorretta: "Analizzare log, connessione, integrità dati e attivare piani di ripristino",
        risposteErrate: ["Spegnere il server", "Cancellare tutti i record", "Ignorare il problema"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    248: {
        domanda: "Come risolvere problemi di compatibilità critica tra software aziendali?",
        rispostaCorretta: "Verificare versioni, aggiornamenti, dipendenze e test in ambienti controllati",
        risposteErrate: ["Disinstallare tutto", "Ignorare problemi", "Spegnere computer"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    249: {
        domanda: "Cosa fare se applicazioni critiche mostrano errori intermittenti su sistemi produttivi?",
        rispostaCorretta: "Analizzare log, ambiente, replicare il problema e fare debug approfondito",
        risposteErrate: ["Ignorare gli errori", "Formattare il computer", "Spegnere il monitor"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    },
    250: {
        domanda: "Come gestire problemi complessi di sicurezza e performance simultanei?",
        rispostaCorretta: "Pianificare analisi dettagliata, isolare componenti e intervenire in ordine prioritario",
        risposteErrate: ["Ignorare i problemi", "Spegnere tutto", "Disinstallare a caso software critico"],
        area: "Risoluzione dei problemi",
        livelloDifficolta: 5
    }
};
module.exports = questions;























