package main.ru.kdv.model;

import lombok.Data;

import java.util.LinkedList;

@Data
public class Snake {
    private final String body = "X";
    private final String tail = "*";
    private final LinkedList<Point> positions = new LinkedList<>();
    private Direction direction;
    private final Board board;

    private void nextStep() {
        Point head = positions.getFirst();
        //todo if next position dote -> add point

        //todo border of board %size of board
        Point newHead = switch (direction) {
            case UP -> new Point(head.getX(), head.getY() + 1, true);
            case DOWN -> new Point(head.getX(), head.getY() - 1, true);
            case LEFT -> new Point(head.getX() - 1, head.getY(), true);
            case RIGHT -> new Point(head.getX() + 1, head.getY(), true);
        };

        positions.addFirst(newHead);
        positions.removeLast();
    }
}
