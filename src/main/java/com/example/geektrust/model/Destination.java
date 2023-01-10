package com.example.geektrust.model;

public class Destination {

    private static String _destinationX;
    private static String _destinationY;

    public static String getDestinationX() {
        return _destinationX;
    }

    public static String getDestinationY() { return _destinationY; }

    public void createDestination( String destination_X, String destination_Y){
        _destinationX = destination_X;
        _destinationY = destination_Y;
    }
}
