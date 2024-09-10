package com.bridgepattern;

public interface GameEngine {
    void initialize();
    void renderGameObject(GameObject gameObject);
    void update();
    void setGraphicsAPI(GraphicsAPI graphicsAPI);
}
