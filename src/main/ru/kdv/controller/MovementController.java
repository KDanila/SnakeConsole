package main.ru.kdv.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import main.ru.kdv.model.Board;
import main.ru.kdv.model.Snake;

@AllArgsConstructor
@Getter
@Setter
public class MovementController {
    private final Snake snake;
    private final Board board;

    void redrawSnake(){

    }
}
