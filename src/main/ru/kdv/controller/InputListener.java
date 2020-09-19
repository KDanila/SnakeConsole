package main.ru.kdv.controller;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.io.Reader;

public class InputListener {
    public static void listenInput() {
        try(Terminal terminal = TerminalBuilder.builder()
                .jna(true)
                .system(true)
                .build()){
            terminal.enterRawMode();
            Reader reader = terminal.reader();
            int read = reader.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
