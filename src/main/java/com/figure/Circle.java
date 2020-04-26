package com.figure;

import java.util.ArrayList;

public class Circle extends Figure {
    //конструктор нужен для инициализации объекта/класса
    private String objectName = "Circle";
    private double xCenter;
    private double yCenter;
    private double radius;
    private String color;


    public Circle() {}

    public Circle(double x, double y, double r, String c) {
        xCenter = x;
        yCenter = y;
        radius = r;
        color = c;
    }

    public String name() {
        return objectName;
    }

    @Override
    public ArrayList<Double> coordinates() {
        ArrayList<Double> coords = new ArrayList<>();
        coords.add((double) xCenter);
        coords.add((double) yCenter);
        return coords;
    }

    public double area() {
        //double size = 16.78;
        //double square = 3.14 * size * size;
        // System.out.println(square);
        return Math.PI * radius * radius;
    }

    public String color() {
        return color;
    }
}
