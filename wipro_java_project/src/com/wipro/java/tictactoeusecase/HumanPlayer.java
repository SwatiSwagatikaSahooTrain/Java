package com.wipro.java.tictactoeusecase;

import java.util.Scanner;

class HumanPlayer extends Player {
    private Scanner scanner;
    
    public HumanPlayer(PlayerPOJO playerData, Scanner scanner) {
        super(playerData);
        this.scanner = scanner;
    }
    
    @Override
    public MovePOJO getMove() {
        int row, col;
        while (true) {
            System.out.print(playerData.getName() + " (" + playerData.getSymbol() + ") Enter row and column: ");
            if (scanner.hasNextInt()) {
                row = scanner.nextInt();
                if (scanner.hasNextInt()) {
                    col = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter two integers.");
                    scanner.next(); // Consume the invalid token
                }
            } else {
                System.out.println("Invalid input! Please enter two integers.");
                scanner.next(); // Consume the invalid token
            }
        }
        return new MovePOJO(row, col);
    }

}

// Factory Design Pattern to create players
class PlayerFactory {
    public static Player createPlayer(String type, PlayerPOJO playerData, Scanner scanner) {
        if ("Human".equalsIgnoreCase(type)) {
            return new HumanPlayer(playerData, scanner);
        }
        throw new IllegalArgumentException("Unknown player type");
    }
}

