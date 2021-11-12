module lesedi.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens lesedi.helloworld to javafx.fxml;
    exports lesedi.helloworld;
}