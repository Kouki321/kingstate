package com.inn.cafe.chess;

import javafx.scene.paint.Color;

public class KingState implements PawnState {
    @Override
    public void promote(ChessBoard chessBoard) {
        // No promotion for king; it stays as king
        System.out.println("Already a king!");
    }

    @Override
    public void render(ChessBoard chessBoard) {
        chessBoard.getPawn().getCircle().setFill(Color.YELLOW);  // Yellow color for king
    }
}
