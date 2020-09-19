package main.ru.kdv;

import main.ru.kdv.controller.InputListener;
import main.ru.kdv.controller.MovementController;
import main.ru.kdv.model.Snake;

public class main {
    public static void main(String[] args) {
        Snake snake = new Snake();
        MovementController movementController = new MovementController(snake);
        InputListener inputListener = new InputListener(movementController);
        int i = 0;

        while(true){
            inputListener.listenInput();
            if(i == 1000){
                return;
            }
        }
    }
}
