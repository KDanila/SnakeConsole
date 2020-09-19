package main.ru.kdv.controller;

import lombok.AllArgsConstructor;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.io.Reader;


@AllArgsConstructor
public class InputListener {
    private final MovementController movementController;

    public void listenInput() {
        try (Terminal terminal = TerminalBuilder.builder()
                .jna(true)
                .system(true)
                .build()) {
            terminal.enterRawMode();
            Reader reader = terminal.reader();
            movementController.changeDirection(reader.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
