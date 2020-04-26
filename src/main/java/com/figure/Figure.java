package com.figure;

import java.util.ArrayList;

public abstract class Figure {
    public abstract String name();
    public abstract ArrayList<Double> coordinates();
    public abstract double area();
    public abstract String color();

    //пример для себя (в котором я использую пустой конструктор в классе Circle)
    public void whatAmI() {
        System.out.println("I'm a com.figure");
    }

/*    public double getArea()  {
            }*/


}
