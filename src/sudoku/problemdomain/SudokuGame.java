package sudoku.problemdomain;

import sudoku.computationlogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable { //to read and write the particular game data file to a file on the upgrading system
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9; // the nr of squares

    public SudokuGame(GameState gameState,int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() { //making it immutable, returning a copy of the gridState
        return SudokuUtilities.copyToNewArray(gridState); //this creates a copy of the Array, protects the Sudoku Game Object from being changed over the time
    }

}
