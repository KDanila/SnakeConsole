package test.ru.kdv.controller;

import main.ru.kdv.controller.MovementController;
import main.ru.kdv.model.Snake;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MovementControllerTest {
    private MovementController movementController;

    @BeforeAll
    void setup() {
        Snake snake = new Snake();
        movementController = new MovementController(snake);
    }

    @Test
    void redrawSnake() {

    }
}