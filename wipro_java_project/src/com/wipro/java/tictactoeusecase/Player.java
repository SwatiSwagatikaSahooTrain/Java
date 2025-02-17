package com.wipro.java.tictactoeusecase;

abstract class Player {
    protected PlayerPOJO playerData;
    
    public Player(PlayerPOJO playerData) {
        this.playerData = playerData;
    }
    
    public abstract MovePOJO getMove();
    
    public char getSymbol() {
        return playerData.getSymbol();
    }
}
