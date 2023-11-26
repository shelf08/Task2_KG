package ru.vsu.cs.lobtsov_d_a.task2_kg.WuLine;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GraphicsContextPixelDrawer implements PixelDrawer {
    private final GraphicsContext graphicsContext;

    public GraphicsContextPixelDrawer(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    @Override
    public void drawPixel(int x, int y, Color color) {
        graphicsContext.setFill(color);
        graphicsContext.fillRect(x, y, 1, 1);
    }
}
