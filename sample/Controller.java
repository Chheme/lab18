package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    TextField tf;
    @FXML
    TextArea ta;

    @FXML
    public void cb(ActionEvent e){
        ta.appendText(tf.getText() +"\n");
        tf.setText("");
    }

    @FXML
    public void handleEnterPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
        ta.appendText(tf.getText() +"\n");
        tf.setText("");
    }}
}
