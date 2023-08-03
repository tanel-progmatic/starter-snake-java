package com.battlesnake.starter;

import static com.battlesnake.starter.Move.*;

public class Service {
    public Move move(MoveRequest request) {
        Coordinate head = request.you.head;
        if (head.x == 0 && head.y < 10) {
            return UP;
        }
        if (head.x < 10 && head.y == 10) {
            return RIGHT;
        }
        if (head.x == 10 && head.y > 0) {
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