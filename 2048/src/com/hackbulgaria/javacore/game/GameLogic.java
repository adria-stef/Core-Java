package com.hackbulgaria.javacore.game;

import java.util.Random;

public class GameLogic {

    private History history;

    public GameLogic() throws CloneNotSupportedException {
        history = new History();
        history.setLastState(new GameState());
        addNumber();
    }

    public GameState getState() {
        return history.getLastGameState();
    }

    public void printMatrix() {
        int matrix[][] = getMatrix();
        int boardSize = getState().BOARD_SIZE;

        for (int y = 0; y < boardSize; y++) {
            for (int x = 0; x < boardSize; x++) {
                int length = String.valueOf(matrix[y][x]).length();
                switch (length) {
                    case 1:
                        System.out.print(matrix[y][x] + " " + " " + " " + " " + " ");
                        break;

                    case 2:
                        System.out.print(matrix[y][x] + " " + " " + " " + " ");
                        break;

                    case 3:
                        System.out.print(matrix[y][x] + " " + " " + " ");
                        break;

                    case 4:
                        System.out.print(matrix[y][x] + " " + " ");
                        break;

                    case 5:
                        System.out.print(matrix[y][x] + " ");
                        break;

                    default:
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addGameStateToHistory(GameState gameState) {
        history.setLastState(gameState);
    }

    public void addNumber() {
        if (countFreePlaces() != 0) {

            int position = -1;
            int randPosition = getRandom();

            for (int y = 0; y < getState().BOARD_SIZE; y++) {
                for (int x = 0; x < getState().BOARD_SIZE; x++) {
                    if (getMatrix()[y][x] == 0) {
                        position++;
                    }
                    if (randPosition == position) {
                        place(y, x);
                        return;
                    }
                }
            }
        }
    }

    public void moveUp() {
        addGameStateToHistory(getState().clone());

        boolean[][] isDoubled = new boolean[getState().BOARD_SIZE][getState().BOARD_SIZE];

        for (int x = 0; x < getState().BOARD_SIZE; x++) {
            for (int y = 1; y < getState().BOARD_SIZE; y++) {
                if (getMatrix()[y][x] == 0) {
                    continue;
                }
                int newY = y - 1;

                while (true) {
                    if (!isInBounds(newY, x)) {
                        newY++;
                        getMatrix()[newY][x] = getMatrix()[y][x];
                        getMatrix()[y][x] = 0;
                        break;
                    }
                    if (getMatrix()[newY][x] != 0) {
                        if (getMatrix()[newY][x] == getMatrix()[y][x] && !isDoubled[newY][x]) {
                            getMatrix()[newY][x] = 2 * getMatrix()[y][x];
                            isDoubled[newY][x] = true;
                            getMatrix()[y][x] = 0;
                        } else {
                            newY++;
                            if (newY != y) {
                                getMatrix()[newY][x] = getMatrix()[y][x];
                                getMatrix()[y][x] = 0;
                            }
                        }
                        break;
                    }
                    newY--;
                }
            }
        }
    }

    public void moveLeft() {
        addGameStateToHistory(getState().clone());

        boolean[][] isDoubled = new boolean[getState().BOARD_SIZE][getState().BOARD_SIZE];

        for (int y = 0; y < getState().BOARD_SIZE; y++) {
            for (int x = 1; x < getState().BOARD_SIZE; x++) {
                if (getMatrix()[y][x] == 0) {
                    continue;
                }
                int newX = x - 1;

                while (true) {
                    if (!isInBounds(y, newX)) {
                        newX++;
                        getMatrix()[y][newX] = getMatrix()[y][x];
                        getMatrix()[y][x] = 0;
                        break;
                    }
                    if (getMatrix()[y][newX] != 0) {
                        if (getMatrix()[y][newX] == getMatrix()[y][x] && !isDoubled[y][newX]) {
                            getMatrix()[y][newX] = 2 * getMatrix()[y][x];
                            isDoubled[y][newX] = true;
                            getMatrix()[y][x] = 0;
                        } else {
                            newX++;
                            if (newX != x) {
                                getMatrix()[y][newX] = getMatrix()[y][x];
                                getMatrix()[y][x] = 0;
                            }
                        }
                        break;
                    }
                    newX--;
                }
            }
        }
    }

    public void moveRight() {
        addGameStateToHistory(getState().clone());

        boolean[][] isDoubled = new boolean[getState().BOARD_SIZE][getState().BOARD_SIZE];

        for (int x = getState().BOARD_SIZE - 2; x > -1; x--) {
            for (int y = getState().BOARD_SIZE - 1; y > -1; y--) {
                if (getMatrix()[y][x] == 0) {
                    continue;
                }
                int newX = x + 1;

                while (true) {
                    if (!isInBounds(y, newX)) {
                        newX--;
                        getMatrix()[y][newX] = getMatrix()[y][x];
                        getMatrix()[y][x] = 0;
                        break;
                    }
                    if (getMatrix()[y][newX] != 0) {
                        if (getMatrix()[y][newX] == getMatrix()[y][x] && !isDoubled[y][newX]) {
                            getMatrix()[y][newX] = 2 * getMatrix()[y][x];
                            isDoubled[y][newX] = true;
                            getMatrix()[y][x] = 0;
                        } else {
                            newX--;
                            if (newX != x) {
                                getMatrix()[y][newX] = getMatrix()[y][x];
                                getMatrix()[y][x] = 0;
                            }
                        }
                        break;
                    }
                    newX++;
                }
            }
        }
    }

    public void moveDown() {
        addGameStateToHistory(getState().clone());

        boolean[][] isDoubled = new boolean[getState().BOARD_SIZE][getState().BOARD_SIZE];

        for (int x = getState().BOARD_SIZE - 1; x > -1; x--) {
            for (int y = getState().BOARD_SIZE - 2; y > -1; y--) {
                if (getMatrix()[y][x] == 0) {
                    continue;
                }
                int newY = y + 1;

                while (true) {
                    if (!isInBounds(newY, x)) {
                        newY--;
                        getMatrix()[newY][x] = getMatrix()[y][x];
                        getMatrix()[y][x] = 0;
                        break;
                    }
                    if (getMatrix()[newY][x] != 0) {
                        if (getMatrix()[newY][x] == getMatrix()[y][x] && !isDoubled[newY][x]) {
                            getMatrix()[newY][x] = 2 * getMatrix()[y][x];
                            isDoubled[newY][x] = true;
                            getMatrix()[y][x] = 0;
                        } else {
                            newY--;
                            if (newY != y) {
                                getMatrix()[newY][x] = getMatrix()[y][x];
                                getMatrix()[y][x] = 0;
                            }
                        }
                        break;
                    }
                    newY++;
                }
            }
        }
    }

    public void quit() {
        System.exit(0);
    }

    public void winOrLose() {
        for (int y = 0; y < getState().BOARD_SIZE; y++) {
            for (int x = 0; x < getState().BOARD_SIZE; x++) {

                if (getMatrix()[y][x] == 2048) {
                    System.out.println("You have won 2048!");
                    quit();
                    return;
                }
                int count = countFreePlaces();
                if (count == 0 && !checkDuplicity()) {
                    System.out.println("You have lost 2048 ;(");
                    quit();
                    return;
                }
            }
        }
    }

    private boolean checkDuplicity() {
        for (int y = 0; y < getState().BOARD_SIZE; y++) {
            for (int x = 0; x < getState().BOARD_SIZE; x++) {
                if (getMatrix()[y][x] == getMatrix()[y + 1][x] || getMatrix()[y][x] == getMatrix()[y - 1][x]
                        || getMatrix()[y][x] == getMatrix()[y][x + 1] || getMatrix()[y][x] == getMatrix()[y][x - 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isInBounds(int x, int y) {
        if (x >= 0 && y >= 0 && x < getState().BOARD_SIZE && y < getState().BOARD_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    private int countFreePlaces() {
        int counter = 0;
        for (int i = 0; i < getState().BOARD_SIZE; i++) {
            for (int j = 0; j < getState().BOARD_SIZE; j++) {
                if (getMatrix()[i][j] == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    private int getRandom() {
        int numberOfFreePlaces = countFreePlaces();
        Random rand = new Random();
        return rand.nextInt(numberOfFreePlaces);
    }

    private int[][] getMatrix() {
        return history.getLastGameState().getMatrix();
    }

    private void place(int y, int x) {
        if (getMatrix()[y][x] != 0) {
            throw new IllegalStateException();
        }
        double randDouble = Math.random();
        if (randDouble >= 0.9) {
            getMatrix()[y][x] = 4;
        } else {
            getMatrix()[y][x] = 2;
        }
    }
}
