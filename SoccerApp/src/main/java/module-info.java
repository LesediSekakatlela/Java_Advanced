module com.lesedi.soccerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lesedi to javafx.fxml;
    exports com.lesedi;
}