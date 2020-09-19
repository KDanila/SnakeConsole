package main.ru.kdv.model;

import lombok.Data;

import java.util.LinkedList;

@Data
public class Snake {
    private final String body = "X";
    private final String tail = "*";
    private final LinkedList<Point> positions = new LinkedList<>();
    private Direction direction;
}
