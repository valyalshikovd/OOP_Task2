package ru.vsu.cs.OOP.valyalschikv_d_a.figure;

import ru.vsu.cs.OOP.valyalschikv_d_a.Coords;

public class Pawn extends Figure{


    public Pawn(int x, int y, boolean isNotBlack) {
        super(x, y, isNotBlack);
    }

    @Override
    public boolean moveIsValid(Coords newCoords) {
        if(isNotBlack){
            if(newCoords.getX() - coords.getX() < 2 && newCoords.getX() - coords.getX() > -2
                    && newCoords.getY() - coords.getY() == -1){
                return true;
            }
        }
        if(!isNotBlack){
            if(newCoords.getX() - coords.getX() < 2 && newCoords.getX() - coords.getX() > -2
                    && newCoords.getY() - coords.getY() == 1){
                return true;
            }
        }
        return false;
    }
}
