package ru.vsu.cs.OOP.valyalschikv_d_a;

public class GameState {
    Board board;
    Player p1; 
    Player p2;

    public GameState(Player p1, Player p2) {
        this.board = new Board();
        this.p1 = p1;
        this.p2 = p2;
    }
}
