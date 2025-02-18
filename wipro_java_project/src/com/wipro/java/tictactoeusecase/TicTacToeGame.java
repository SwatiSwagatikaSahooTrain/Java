package com.wipro.java.tictactoeusecase;

import java.util.Arrays;
import java.util.List;

class TicTacToeGame {
    private TicTacToeBoard board;
    private List<Player> players;
    private int currentPlayerIndex;
    
    public TicTacToeGame(int size, Player player1, Player player2) {
        this.board = new TicTacToeBoard(size);
        this.players = Arrays.asList(player1, player2);
        this.currentPlayerIndex = 0;
    }
    
    public void play() {
        while (true) {
            board.displayBoard();
            Player currentPlayer = players.get(currentPlayerIndex);
            boolean validMove = false;
            while (!validMove) {
                MovePOJO move = currentPlayer.getMove();
                validMove = board.makeMove(move, currentPlayer.getSymbol());
                if (!validMove) {
                    System.out.println("Invalid move, try again!");
                }
            }
            if (checkWinner(currentPlayer.getSymbol())) {
                board.displayBoard();
                System.out.println(currentPlayer.playerData.getName() + " wins!");
                return;
            }
            if (board.isFull()) {
                board.displayBoard();
                System.out.println("It's a draw!");
                return;
            }
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
        }
    }
    
    private boolean checkWinner(char symbol) {
        for (int i = 0; i < board.size; i++) {
            if (allMatch(i, 0, 0, 1, symbol) || allMatch(0, i, 1, 0, symbol)) {
                return true;
            }
        }
        return allMatch(0, 0, 1, 1, symbol) || allMatch(0, board.size - 1, 1, -1, symbol);
    }
    
    private boolean allMatch(int startRow, int startCol, int rowStep, int colStep, char symbol) {
        for (int i = 0; i < board.size; i++) {
            if (board.getCell(startRow + i * rowStep, startCol + i * colStep) != symbol) {
                return false;
            }
        }
        return true;
    }
}
