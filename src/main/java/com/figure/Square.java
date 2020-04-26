package com.figure;

import java.util.ArrayList;

public class Square extends Figure {

    private String objectName = "Square";
    private double xTopLeft;
    private double yTopLeft; // https://screencast.nixsolutions.com/dove/picpick_wUqBwvPAZm.png
    private double size = 0;
    private String color;

    public Square(double xTopLeft, double yTopLeft, double s, String c) {
        this.xTopLeft = xTopLeft;
        this.yTopLeft = yTopLeft;
        size = s;
        color = c;
    }

    @Override
    public double area() {
        return size * size;
    }

    @Override
    public String name() {
        return objectName;
    }

    @Override
    public ArrayList<Double> coordinates() {
        ArrayList<Double> coords = new ArrayList<>();
        coords.add((double) xTopLeft);
        coords.add((double) yTopLeft);
        //coords.add((double) 3);
        return coords;
    }

    @Override
    public String color() {
        return color;
    }
}
/*
    public static void sSquare() {
        double size = 12.77;
        double square = size * size;
        System.out.println(square);
    }
*/


