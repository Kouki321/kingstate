package com.inn.cafe.chess;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.KeyCode;

public class ChessBoard extends GridPane {
    private static final int BOARD_SIZE = 8;  // 8x8 chessboard
    private Rectangle[][] squares = new Rectangle[BOARD_SIZE][BOARD_SIZE];
    private Pawn pawn;  // Representing the pawn

    public ChessBoard() {
        // Initialize the board
        setUpBoard();
        // Create a pawn
        pawn = new Pawn(0, 0);
        updatePawnPosition();
    }

    private void setUpBoard() {
        // Creating the chessboard grid
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                Rectangle square = new Rectangle(50, 50);
                square.setStroke(javafx.scene.paint.Color.BLACK);

                // Alternate colors for squares
                if ((i + j) % 2 == 0) {
                    square.setFill(javafx.scene.paint.Color.WHITE);
                } else {
                    square.setFill(javafx.scene.paint.Color.GRAY);
                }

                squares[i][j] = square;
                add(square, j, i);
            }
        }
    }

    public void movePawn(KeyCode key) {
        int pawnX = pawn.getX();
        int pawnY = pawn.getY();

        // Move the pawn based on key input
        switch (key) {
            case UP:
                if (pawnY > 0) pawnY--;
                break;
            case DOWN:
                if (pawnY < BOARD_SIZE - 1) pawnY++;
                break;
            case LEFT:
                if (pawnX > 0) pawnX--;
                break;
            case RIGHT:
                if (pawnX < BOARD_SIZE - 1) pawnX++;
                break;
            default:
                break;
        }

        // Update the pawn's position
        pawn.setPosition(pawnX, pawnY);

        // Check if the pawn has reached the "X" square (e.g., last column or any specific square)
        if (pawnX == BOARD_SIZE - 1) {
            // Promote the pawn when it reaches the "X" square (in this case, the last column)
            pawn.promote(this);
        }

        // Update the pawn's visual appearance
        updatePawnPosition();
    }

    private void updatePawnPosition() {
        // Update the pawn's position in the GridPane
        getChildren().remove(pawn.getCircle());
        add(pawn.getCircle(), pawn.getX(), pawn.getY());
        pawn.render(this);
    }

    public Pawn getPawn() {
        return pawn;
    }
}
