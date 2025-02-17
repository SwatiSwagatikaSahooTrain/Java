package com.wipro.java.tictactoeusecase;

import java.util.Arrays;

class TicTacToeBoard extends Board {
    public TicTacToeBoard(int size) {
        super(size);
    }
    
    @Override
    public void displayBoard() {
        for (char[] row : grid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}
