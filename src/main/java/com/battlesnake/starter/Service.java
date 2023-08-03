package com.battlesnake.starter;

import static com.battlesnake.starter.Move.*;

public class Service {
    public Move move(MoveRequest request) {
        Coordinate head = request.you.head;
        if (head.x <= 1 && head.y < 9) {
            return UP;
        }
        if (head.x < 9 && head.y >= 9) {
            return RIGHT;
        }
        if (head.x >= 9 && head.y > 1) {
            return DOWN;
        }
        return LEFT;
    }
}

enum Move {
    UP,
    DOWN,
    LEFT,
    RIGHT
}