package com.battlesnake.starter;

import java.util.List;

public class MoveRequest {
    Board board;
    BattleSnake you;
}

class Board {
    int height;
    int width;
    List<BattleSnake> snakes;
    List<Coordinate> food;
}

class BattleSnake {
    String id;
    int health;
    List<Coordinate> body;
    Coordinate head;
    int length;
}

class Coordinate {
    int x;
    int y;
}