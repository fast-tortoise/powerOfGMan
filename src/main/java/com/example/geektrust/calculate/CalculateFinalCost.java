package com.example.geektrust.calculate;

import com.example.geektrust.constants.Constants;

public class CalculateFinalCost {
    private String _sourceX;
    private String _sourceY;
    private String _head;
    private String _destinationX;
    private String _destinationY;

    public CalculateFinalCost(String sourceX, String sourceY, String head, String destinationX, String destinationY){
        _sourceX = sourceX;
        _sourceY = sourceY;
        _destinationX = destinationX;
        _destinationY = destinationY;
        _head = head;
    }

    public int calculateFinalCost(CalculateDirectionChangeCost calculateDirectionChangeCost, CalculateMovementCost calculateMovementCost){

        calculateDirectionChangeCost.takeInput(_sourceX, _sourceY, _destinationX, _destinationY);
        int costDirChange = calculateDirectionChangeCost.directionChangeCost(_head);

        int costMovement = calculateMovementCost.takeInput(_sourceX, _sourceY, _destinationX, _destinationY);
        int finalCost = costMovement + costDirChange;

        int remainingPower = Constants.TOTAL_POWER - finalCost;
        return remainingPower;

    }
}
