package test.ru.kdv.model;

import main.ru.kdv.model.Board;
import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void displayBoard() {
        Board board = new Board(10, 10);
        board.displayBoard();
    }
}