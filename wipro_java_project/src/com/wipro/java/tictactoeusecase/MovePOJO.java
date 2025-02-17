package com.wipro.java.tictactoeusecase;

class MovePOJO {
    private int row;
    private int col;
    
    public MovePOJO(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }
}
