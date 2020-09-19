package test.ru.kdv.controller;

import main.ru.kdv.controller.MovementController;
import main.ru.kdv.model.Board;
import main.ru.kdv.model.Snake;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MovementControllerTest {
    private MovementController movementController;

    @BeforeAll
    void setup() {
        Board board = new Board(10,10);
        Snake snake = new Snake();
        movementController = new MovementController(snake, board);
    }

    @Test
    void redrawSnake() {

    }
}