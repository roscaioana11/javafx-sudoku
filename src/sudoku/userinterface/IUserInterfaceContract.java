package sudoku.userinterface;

import sudoku.problemdomain.SudokuGame;

import java.awt.event.InputEvent;

public interface IUserInterfaceContract {
    interface EventListener<K extends InputEvent> {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View{
        void setListener(IUserInterfaceContract.EventListener<InputEvent> listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGame game);
        void showDialog(String Message);
        void showError(String message);
    }
}
