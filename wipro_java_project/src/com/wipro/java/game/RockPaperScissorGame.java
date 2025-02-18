package com.wipro.java.game;

import java.sql.*;
import java.util.*;

public class RockPaperScissorGame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
    static final String USER = "root";
    static final String PASS = "swati";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // This line ensures the driver is loaded
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;  // Exit if the driver is not found
        }

        System.out.println("Welcome to Rock, Paper, Scissors Game!");

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO game_results (player_name, result) VALUES (?, ?);")) {

            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();

            while (true) {
                System.out.println("Choose: 1. Rock  2. Paper  3. Scissors  4. Exit");
                System.out.print("Your choice (1/2/3): ");
                int playerChoice = scanner.nextInt();
                if (playerChoice == 4) break;

                String playerMove = choices[playerChoice - 1];
                String computerMove = choices[random.nextInt(3)];
                String result = determineWinner(playerMove, computerMove);

                System.out.println("Computer chose: " + computerMove);
                System.out.println("Result: " + result);

                stmt.setString(1, playerName);
                stmt.setString(2, result);
                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "It's a tie!";
        }

        switch (playerMove) {
            case "Rock":
                return (computerMove.equals("Scissors")) ? "You win!" : "You lose!";
            case "Paper":
                return (computerMove.equals("Rock")) ? "You win!" : "You lose!";
            case "Scissors":
                return (computerMove.equals("Paper")) ? "You win!" : "You lose!";
            default:
                return "Invalid move!";
        }
    }
}
