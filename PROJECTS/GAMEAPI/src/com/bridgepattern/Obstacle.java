package com.bridgepattern;

public class Obstacle implements GameObject {
    private int x, y, width, height;

    public Obstacle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(GraphicsAPI graphicsAPI) {
        graphicsAPI.drawObstacle(x, y, width, height);
    }
}
