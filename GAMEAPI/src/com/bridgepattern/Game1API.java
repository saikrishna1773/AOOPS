package com.bridgepattern;

public class Game1API implements GraphicsAPI {
    @Override
    public void drawPlayer(int x, int y, int size) {
        System.out.println("Drawing player with Game1API at (" + x + ", " + y + ") with size " + size);
    }

    @Override
    public void drawEnemy(int x, int y, int size) {
        System.out.println("Drawing enemy with Game1API at (" + x + ", " + y + ") with size " + size);
    }

    @Override
    public void drawObstacle(int x, int y, int width, int height) {
        System.out.println("Drawing obstacle with Game1API at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
}
