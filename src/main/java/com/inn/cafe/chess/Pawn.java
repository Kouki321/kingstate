package com.inn.cafe.chess;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Pawn {
    private PawnState state;
    private Circle circle;
    private int x;
    private int y;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
        this.circle = new Circle(20, Color.RED);  // Initial color as red
        this.state = new PawnStatePawn();  // Initially, it is just a normal pawn
    }

    public void setState(PawnState state) {
        this.state = state;
    }
    public int getX(){return x;}
    public int getY(){return y;}

    public void promote(ChessBoard chessBoard) {
        state.promote(chessBoard);
    }

    public void render(ChessBoard chessBoard) {
        state.render(chessBoard);
    }

    public Circle getCircle() {
        return circle;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
