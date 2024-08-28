package com.bridgepattern;

public class CGameEngine implements GameEngine {
    private GraphicsAPI graphicsAPI;

    @Override
    public void initialize() {
        System.out.println("Initializing game engine...");
    }

    @Override
    public void renderGameObject(GameObject gameObject) {
        System.out.println("Rendering game object...");
        gameObject.render(graphicsAPI);
    }

    @Override
    public void update() {
        System.out.println("Updating game state...");
    }

    @Override
    public void setGraphicsAPI(GraphicsAPI graphicsAPI) {
        this.graphicsAPI = graphicsAPI;
    }
}
