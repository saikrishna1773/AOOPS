package com.bridgepattern;

public interface GraphicsAPI {
    void drawPlayer(int x, int y, int size);
    void drawEnemy(int x, int y, int size);
    void drawObstacle(int x, int y, int width, int height);
}
