package com.example.geektrust.model;

public class Source {

    public static String _sourceX;
    public static String _sourceY;
    public static String _headDirection;

    public static String getSourceX() {
        return _sourceX;
    }

    public static String getSourceY() { return _sourceY; }

    public static String getHeadDirection() { return _headDirection; }

    public void createSource( String sourceX, String sourceY, String head){
        _sourceX = sourceX;
        _sourceY = sourceY;
        _headDirection = head;
    }



}
