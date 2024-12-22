package com.inn.cafe.chess;

import javafx.scene.paint.Color;

public class RockState implements PawnState {
    @Override
    public void promote(ChessBoard chessBoard) {
        // If pawn is promoted to rock, it will stay as a rock
        System.out.println("Pawn promoted to rock!");
    }

    @Override
    public void render(ChessBoard chessBoard) {
        chessBoard.getPawn().getCircle().setFill(Color.GREEN);  // Green color for rock
    }
}
