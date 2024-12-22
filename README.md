# Chess Game - JavaFX

This project is a simple chess game using JavaFX. The game board is displayed in a grid layout, and the pawn can move based on keyboard input. The pawn's behavior changes depending on its state, transitioning from a regular pawn to a king when it reaches a specific square.

## Features

- **Chess Board**: An 8x8 grid represents the chessboard.
- **Pawn Movement**: A pawn can be moved using the arrow keys (Up, Down, Left, Right).
- **Pawn State**: The pawn changes its state upon reaching a specific square (e.g., promoted to a king).
- **State Design Pattern**: The game uses the State Design Pattern to manage the pawn's state (normal pawn, king, etc.).

## Design Pattern: State Pattern

### Overview
The **State Design Pattern** is employed to change the behavior of the `Pawn` based on its current state. The pawn's behavior is managed by different state classes, such as `PawnStatePawn` and `PawnStateKing`. 

### How It Works
- **State Interface**: The `PawnState` interface defines methods that manage the pawn's movement and promotion.
- **Concrete States**: Specific state classes (`PawnStatePawn`, `PawnStateKing`) implement the behavior for each state.
- **Pawn Context**: The `Pawn` class holds a reference to its current state and delegates behavior (e.g., movement and promotion) to the current state.

### When Does the State Change?
- The pawn starts as a normal pawn (`PawnStatePawn`).
- When the pawn reaches a specific square (e.g., the last column), it is promoted to a king (`PawnStateKing`).

## Installation

1. Clone the repository to your local machine.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA or Eclipse).
3. Ensure you have Java 11 or higher and JavaFX installed.
4. Build and run the project.

## Running the Game

1. When the application starts, a chessboard (8x8 grid) will appear.
2. Use the **arrow keys** (Up, Down, Left, Right) to move the pawn.
3. The pawn will change state to a **king** when it reaches the last column (you can change this condition in the code).

## Example of State Classes

### `PawnState` Interface
```java
public interface PawnState {
    void move(Pawn pawn);
    void promote(Pawn pawn);
}



![image](https://github.com/user-attachments/assets/55b011e6-7bf6-4513-b5b1-3f8f5d49ae20)

![image](https://github.com/user-attachments/assets/1e6104b6-63a9-4143-a622-62cf3a6d82c8)



