package com.inn.cafe.chess;

import javafx.scene.paint.Color;

public class PawnStatePawn implements PawnState {
    @Override
    public void promote(ChessBoard chessBoard) {
        // If pawn reaches the last column, promote to a king
        chessBoard.getPawn().setState(new KingState());
    }

    @Override
    public void render(ChessBoard chessBoard) {
        chessBoard.getPawn().getCircle().setFill(Color.RED);  // Red color for normal pawn
    }
}
