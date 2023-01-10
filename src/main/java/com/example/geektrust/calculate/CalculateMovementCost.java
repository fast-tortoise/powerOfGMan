package com.example.geektrust.calculate;

import com.example.geektrust.constants.Constants;
public class CalculateMovementCost {

    private int sX;
    private int sY;
    private int dX;
    private int dY;

    public int takeInput(String sourceX, String sourceY, String destinationX, String destinationY){

        sX = Integer.parseInt(sourceX);
        sY = Integer.parseInt(sourceY);
        dX = Integer.parseInt(destinationX);
        dY = Integer.parseInt(destinationY);

        return calculateDifference(sX, sY, dX, dY);
    }

    public int calculateDifference(int sX, int sY, int dX, int dY){

        int differenceX = Math.abs(dX - sX);
        int differenceY = Math.abs(dY - sY);

        return calculateMovementCost(differenceX, differenceY);
    }

    public int calculateMovementCost(int differenceX, int differenceY){

        int movementCost = (differenceX + differenceY) * Constants.TEN;

        return movementCost;

    }
}
