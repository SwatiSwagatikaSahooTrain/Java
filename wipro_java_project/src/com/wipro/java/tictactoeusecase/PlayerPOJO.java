package com.wipro.java.tictactoeusecase;

class PlayerPOJO {
    private String name;
    private char symbol;
    
    public PlayerPOJO(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    
    public String getName() {
        return name;
    }
    
    public char getSymbol() {
        return symbol;
    }
}
