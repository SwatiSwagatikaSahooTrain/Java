package com.wipro.java.tictactoeusecase;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter board size: ");
        int size = scanner.nextInt();
        
        Player player1 = PlayerFactory.createPlayer("Human", new PlayerPOJO("Player 1", 'X'), scanner);
        Player player2 = PlayerFactory.createPlayer("Human", new PlayerPOJO("Player 2", 'O'), scanner);
        
        TicTacToeGame game = new TicTacToeGame(size, player1, player2);
        game.play();
    }
}