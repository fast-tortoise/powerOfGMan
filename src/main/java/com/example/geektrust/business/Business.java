package com.example.geektrust.business;

import com.example.geektrust.calculate.CalculateFinalCost;
import com.example.geektrust.model.Source;
import com.example.geektrust.model.Destination;
import com.example.geektrust.calculate.CalculateDirectionChangeCost;
import com.example.geektrust.calculate.CalculateMovementCost;

public class Business {

    private String sourceX = Source.getSourceX();
    private String sourceY = Source.getSourceY();
    private String head = Source.getHeadDirection();
    private String destX = Destination.getDestinationX();
    private String destY = Destination.getDestinationY();

    CalculateDirectionChangeCost calculateDirectionChangeCost = new CalculateDirectionChangeCost();
    CalculateMovementCost calculateMovementCost = new CalculateMovementCost();
    CalculateFinalCost calculateFinalCost = new CalculateFinalCost(sourceX, sourceY, head, destX, destY);

    public int remainingPower(){
        return calculateFinalCost.calculateFinalCost(calculateDirectionChangeCost, calculateMovementCost);
    }

}
