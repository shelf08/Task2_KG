package ru.vsu.cs.lobtsov_d_a.task2_kg;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}