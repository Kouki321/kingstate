package com.inn.cafe.chess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        ChessBoard chessBoard = new ChessBoard();

        // Set up the StackPane to hold the chess board
        StackPane root = new StackPane();
        root.getChildren().add(chessBoard);

        // Create the scene
        Scene scene = new Scene(root, 400, 400);

        // Handle key events to move the pawn
        scene.setOnKeyPressed((KeyEvent event) -> {
            chessBoard.movePawn(event.getCode());
        });

        // Set the stage
        primaryStage.setTitle("Chess Board");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Request focus for the root node to capture key events
        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
