package com.hackbulgaria.javacore.game;

public class Controller {

    private GameLogic gameLogic;

    public Controller() throws CloneNotSupportedException {
        gameLogic = new GameLogic();
    }

    public void onCommand(Command command) throws CloneNotSupportedException {
        switch (command) {
            case MOVE_UP:
                gameLogic.moveUp();
                gameLogic.addNumber();
                gameLogic.printMatrix();
                gameLogic.winOrLose();
                System.out.println("moved up");
                break;
            case MOVE_DOWN:
                gameLogic.moveDown();
                gameLogic.addNumber();
                gameLogic.printMatrix();
                gameLogic.winOrLose();
                System.out.println("moved down");

                break;

            case MOVE_LEFT:
                gameLogic.moveLeft();
                gameLogic.addNumber();
                gameLogic.printMatrix();
                gameLogic.winOrLose();
                System.out.println("moved left");
                break;

            case MOVE_RIGHT:
                gameLogic.moveRight();
                gameLogic.addNumber();
                gameLogic.printMatrix();
                gameLogic.winOrLose();
                System.out.println("moved right");
                break;

            case QUIT:
                gameLogic.quit();
                break;

            default:
                break;
        }
    }

}
