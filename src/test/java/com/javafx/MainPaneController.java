package com.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class MainPaneController {

    @FXML
    private Button btnHello;


    @FXML
    protected void handleButtonAction(ActionEvent event) {
        btnHello.setText("Hello World, I am JavaFX!");
    }

}