package com.example.geektrust.calculate;

import com.example.geektrust.constants.Constants;

public class CalculateDirectionChangeCost {

    private String[] idealHeadDirection;
    private String oppositeDirection = "";
    private int cost;
    private int sX;
    private int sY;
    private int dX;
    private int dY;


    public void takeInput(String sourceX, String sourceY, String destinationX, String destinationY){

        sX = Integer.parseInt(sourceX);
        sY = Integer.parseInt(sourceY);
        dX = Integer.parseInt(destinationX);
        dY = Integer.parseInt(destinationY);

        idealDirection(sX, sY, dX, dY);
    }

    public void idealDirection(int sX, int sY, int dX, int dY){

        if(dX> sX && dY>sY){
            idealHeadDirection = new String[]{Constants.NORTH, Constants.EAST};
        }
        else if(dX< sX && dY< sY){
            idealHeadDirection = new String[]{Constants.SOUTH, Constants.WEST};
        }
        else if(sX < dX && sY > dY){
            idealHeadDirection = new String[]{Constants.SOUTH, Constants.EAST};
        }
        else if(sX > dX && sY< dY){
            idealHeadDirection = new String[]{Constants.WEST,Constants.NORTH};
        }
        else if(dX > sX && dY == sY){
            idealHeadDirection = new String[]{Constants.EAST};
            oppositeDirection = Constants.WEST;
        }
        else if(dX < sX && dY == sY ){
            idealHeadDirection = new String[]{Constants.WEST};
            oppositeDirection = Constants.EAST;
        }
        else if(sX == dX && dY> sY){
            idealHeadDirection = new String[]{Constants.NORTH};
            oppositeDirection = Constants.SOUTH;
        }
        else if(sX == dX && sY > dY) {
            idealHeadDirection = new String[]{Constants.SOUTH};
            oppositeDirection = Constants.NORTH;
        }
        else{
            idealHeadDirection = new String[]{};
        }
    }

    public int directionChangeCost(String head){

        if (head.equals(oppositeDirection)){

            cost = Constants.TEN;
            return cost;
        }
        for (int i = Constants.ZERO; i < idealHeadDirection.length; i++) {
            if(head.equals(idealHeadDirection[i])){
                if(idealHeadDirection.length == Constants.TWO){
                    cost = Constants.FIVE;
                    return cost;
                }
                else{
                    cost = Constants.ZERO;
                    return cost;
                }
            }
        }
        if (idealHeadDirection.length == Constants.TWO){
            cost = Constants.TEN;
            return cost;
        }
        else if(idealHeadDirection.length == Constants.ONE) {
            cost = Constants.FIVE;
            return cost;
        }
        return Constants.ZERO;
    }
}
