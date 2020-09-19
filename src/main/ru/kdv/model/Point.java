package main.ru.kdv.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
    private int x;
    private int y;
    private boolean isBlocked;

    @Override
    public String toString() {
        return isBlocked ? "" : "Z";
    }
}
