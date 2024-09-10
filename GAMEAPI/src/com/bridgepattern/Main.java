package com.bridgepattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameEngine gameEngine = new CGameEngine();

        System.out.println("Select GraphicsAPI (1 for Game1API, 2 for Game2API): ");
        int apiChoice = scanner.nextInt();

        GraphicsAPI graphicsAPI;
        if (apiChoice == 1) {
            graphicsAPI = new Game1API();
        } else if (apiChoice == 2) {
            graphicsAPI = new Game2API();
        } else {
            System.out.println("Invalid choice. Defaulting to Game1API.");
            graphicsAPI = new Game1API();
        }
        gameEngine.setGraphicsAPI(graphicsAPI);
        gameEngine.initialize();

        GameObject player = new Player(10, 20, 5);
        GameObject enemy = new Enemy(30, 40, 10);
        GameObject obstacle = new Obstacle(50, 60, 15, 20);

        System.out.println("Select GameObject to render (1 for Player, 2 for Enemy, 3 for Obstacle): ");
        int objectChoice = scanner.nextInt();

        switch (objectChoice) {
            case 1:
                gameEngine.renderGameObject(player);
                break;
            case 2:
                gameEngine.renderGameObject(enemy);
                break;
            case 3:
                gameEngine.renderGameObject(obstacle);
                break;
            default:
                System.out.println("Invalid choice. No object rendered.");
                break;
        }

        gameEngine.update();

    }
}
