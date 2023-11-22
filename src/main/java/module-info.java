module com.pessoal.textformatting {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.pessoal.textformatting to javafx.fxml;
    exports com.pessoal.textformatting;
}