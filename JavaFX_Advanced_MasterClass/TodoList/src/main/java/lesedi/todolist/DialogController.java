package lesedi.todolist;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import lesedi.todolist.datamodel.TodoData;
import lesedi.todolist.datamodel.TodoItem;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

//        TodoData.getInstance().addTodoItem(new TodoItem(shortDescription, details, deadlineValue));
        TodoItem newItem = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
