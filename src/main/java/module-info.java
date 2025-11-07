module org.example.digicomp_domande {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.example.digicomp_domande to javafx.fxml;
    exports org.example.digicomp_domande;
}