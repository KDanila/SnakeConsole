package main.ru.kdv.model;

import lombok.Data;

@Data
public class Board {
    private final int sizeA;
    private final int sizeB;
    private Point[][] points;

    public Board(int a, int b) {
        sizeA = a;
        sizeB = b;
        initBoard();

    }

    private void initBoard() {
        points = new Point[sizeA][sizeB];
        for (int i = 0; i < sizeA; i++) {
            for (int j = 0; j < sizeB; j++) {
                points[i][j] = new Point(i, j, false);
            }
        }
    }

    public void displayBoard() {
        for (Point[] point : points) {
            for (Point point1 : point) {
                System.out.print(point1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
