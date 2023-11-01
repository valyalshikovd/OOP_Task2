package ru.vsu.cs.OOP.valyalschikv_d_a.figure;

import ru.vsu.cs.OOP.valyalschikv_d_a.Board;
import ru.vsu.cs.OOP.valyalschikv_d_a.Coords;

import java.awt.*;

public abstract class Figure {

    static Board board;

    protected Coords coords;

    boolean isNotBlack;




    public Figure(int x, int y, boolean isNotBlack){
        coords = new Coords(x, y);
        this.isNotBlack = isNotBlack;
    }

    public abstract boolean moveIsValid(Coords newCoords);

}
