package com.figure;

import java.util.ArrayList;

public class Triangle extends Figure {
    private String objectName = "Triangle";
    private double xTop;
    private double yTop;
    private double xLeftSide;
    private double yLeftSide;
    private double height;
    private double size1;


    private String color;

    public Triangle(double xTop, double yTop, double xLeftSide, double yLeftSide, double h, double s, String c) {
        this.xTop = xTop;
        this.yTop = yTop;
        this.xLeftSide = xLeftSide;
        this.yLeftSide = yLeftSide;
        height = h;
        size1 = s;
        color = c;
    }

    @Override
    public double area() {
        return 0.5 * height * size1;
    }

    @Override
    public String name() {
        return objectName;
    }

    @Override
    public ArrayList<Double> coordinates() {
        ArrayList<Double> coords = new ArrayList<>();
        coords.add((double) xTop);
        coords.add((double) yTop);
        coords.add((double) xLeftSide);
        coords.add((double) yLeftSide);
        return coords;
    }
    @Override
    public String color() {
        return color;
    }
}

/*    public static void tSquare() throws IOException {
        double height = 15.8;
        double size1 = 20.9;
        double square = 0.5 * height * size1;
        System.out.println(square);
    }*/

    /*
    в этом классе:
    private String name = 'ololo';
        Triangle name = new Triangle();
        Triangle coordinates = new Triangle();

        public String getName() {
            return name;*/



/*
в другом классе:
object triangle = new Triangle();
string name = triangle->getName();

print name; // ololo*/
