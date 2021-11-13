module sample.controls {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.controls to javafx.fxml;
    exports sample.controls;
}