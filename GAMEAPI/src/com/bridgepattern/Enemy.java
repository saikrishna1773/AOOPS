package com.bridgepattern;

public class Enemy implements GameObject {
    private int x, y, size;

    public Enemy(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public void render(GraphicsAPI graphicsAPI) {
        graphicsAPI.drawEnemy(x, y, size);
    }
}
