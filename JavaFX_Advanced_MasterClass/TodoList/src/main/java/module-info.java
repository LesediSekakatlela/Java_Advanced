module lesedi.todolist.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens lesedi.todolist to javafx.fxml;
    exports lesedi.todolist;
}