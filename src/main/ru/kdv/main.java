package main.ru.kdv;

import main.ru.kdv.controller.InputListener;

public class main {
    public static void main(String[] args) {
        int i = 0;

        while(true){
            InputListener.listenInput();
            if(i == 1000){
                return;
            }
        }
    }
}
