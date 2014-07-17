package com.hackbulgaria.javacore.game;

public class GameState {

    public final int BOARD_SIZE = 4;

    private int matrix[][] = new int[BOARD_SIZE][BOARD_SIZE];

    public GameState() {
        for (int y = 0; y < BOARD_SIZE; y++) {
            for (int x = 0; x < BOARD_SIZE; x++) {
                matrix[y][x] = 0;
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    protected GameState clone() {
        GameState newGameState = new GameState();
        int boardSize = this.BOARD_SIZE;
        for (int y = 0; y < boardSize; y++) {
            for (int x = 0; x < boardSize; x++) {
                newGameState.matrix[y][x] = this.matrix[y][x];
            }
        }
        return newGameState;
    }

}
