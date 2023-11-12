package ru.vsu.cs.lobtsov_d_a.task2_kg;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


import ru.vsu.cs.lobtsov_d_a.task2_kg.WuLine.WuLine;
import javafx.scene.paint.Color;
import javafx.scene.transform.Scale;

public class WuController {

    @FXML
    AnchorPane anchorPane;
    @FXML
    private Canvas canvas;
    WuLine wuLine = new WuLine();
    @FXML
    private void initialize() {
        anchorPane.prefWidthProperty().addListener((ov, oldValue, newValue) -> canvas.setWidth(newValue.doubleValue()));
        anchorPane.prefHeightProperty().addListener((ov, oldValue, newValue) -> canvas.setHeight(newValue.doubleValue()));

        canvas.setOnScroll(event -> {
            double zoomFactor = 1.1;
            double deltaY = event.getDeltaY();

            if (deltaY < 0) {
                zoomFactor = 1 / zoomFactor;
            }

            Scale scale = new Scale();
            scale.setPivotX(event.getX());
            scale.setPivotY(event.getY());
            scale.setX(canvas.getScaleX() * zoomFactor);
            scale.setY(canvas.getScaleY() * zoomFactor);

            canvas.getTransforms().add(scale);
            event.consume();
        });

        canvas.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                canvas.getGraphicsContext2D().setFill(Color.WHITE);
                canvas.getGraphicsContext2D().fillRect(0,0,1000,1000);
                canvas.getGraphicsContext2D().setFill(Color.BLACK);
                wuLine.drawLine(canvas.getGraphicsContext2D(), 500,500, mouseEvent.getX(), mouseEvent.getY());
            }
        });


        canvas.setOnMousePressed(this::handleMouseDown);
        canvas.setOnMouseReleased(this::handleMouseUP);

    }

    private void handleMouseUP(MouseEvent mouseEvent) {
    }

    private void handleMouseDown(MouseEvent mouseEvent) {
    }



}