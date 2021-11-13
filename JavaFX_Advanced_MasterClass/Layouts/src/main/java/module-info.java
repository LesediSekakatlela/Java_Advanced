module lesedi.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens lesedi.layouts to javafx.fxml;
    exports lesedi.layouts;
}