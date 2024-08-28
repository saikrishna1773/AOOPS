package com.bridgepattern;

public class Player implements GameObject {
    private int x, y, size;

    public Player(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    @Override
    public void render(GraphicsAPI graphicsAPI) {
        graphicsAPI.drawPlayer(x, y, size);
    }
}
