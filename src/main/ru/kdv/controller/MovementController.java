package main.ru.kdv.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import main.ru.kdv.model.Snake;

import static main.ru.kdv.model.Direction.*;

@AllArgsConstructor
@Getter
@Setter
public class MovementController {
    private final Snake snake;

    void changeDirection(int code) {
        if (code == 100) {
            snake.setDirection(RIGHT);
            System.out.println(snake.getDirection());
        } else if (code == 97) {
            snake.setDirection(LEFT);
            System.out.println(snake.getDirection());
        } else if (code == 115) {
            snake.setDirection(DOWN);
            System.out.println(snake.getDirection());
        } else if (code == 119) {
            snake.setDirection(UP);
            System.out.println(snake.getDirection());
        }
    }
}
