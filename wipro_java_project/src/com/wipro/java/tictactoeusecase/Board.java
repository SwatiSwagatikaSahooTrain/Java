package com.wipro.java.tictactoeusecase;

import java.util.Arrays;
import java.util.stream.IntStream;

abstract class Board {
    protected char[][] grid;
    protected int size;
    
    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        for (char[] row : grid) {
            Arrays.fill(row, '-');
        }
    }
    
    public abstract void displayBoard();
    
    public boolean isFull() {
        return Arrays.stream(grid).flatMapToInt(row -> IntStream.range(0, row.length).map(i -> row[i])).noneMatch(c -> c == '-');
    }
    
    public boolean makeMove(MovePOJO move, char symbol) {
        int row = move.getRow();
        int col = move.getCol();
        if (row >= 0 && row < size && col >= 0 && col < size && grid[row][col] == '-') {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }
    
    public char getCell(int row, int col) {
        return grid[row][col];
    }
}
