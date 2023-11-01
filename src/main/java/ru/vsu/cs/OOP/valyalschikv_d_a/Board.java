package ru.vsu.cs.OOP.valyalschikv_d_a;

import ru.vsu.cs.OOP.valyalschikv_d_a.figure.Figure;

import java.util.HashMap;

public class Board {
    HashMap<Coords, Figure> figures = new HashMap<Coords, Figure>();

    public Board() {
        //инициализировать все фигуры
    }
}
