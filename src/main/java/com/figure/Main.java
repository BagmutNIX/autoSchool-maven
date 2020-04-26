package com.figure;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //Triangle.tSquare();
        //Square.sSquare();
        //Circle.cArea();
        Circle circle = new Circle();
        circle.whatAmI();
        System.out.println();
        // final double size = circle.size();
        circle.area();
        ArrayList<Figure> figures = new ArrayList<>();

        Figure figure = new Circle(10, 24, 34, "Grey");
        figures.add(figure);

        Figure figure1 = new Triangle(23, 67, 33, 44, 10, 5, "Purple");
        figures.add(figure1);

        //Figure figure2 = new Square(34.233, "Yellow");
        figures.add(new Square(45, 78, 33.45324, "Terracotta"));
        showFigures(figures);

        Figure[] figureArray = new Figure[10];


    }

    public static void showFigures(ArrayList<Figure> ListOffigures) throws IOException {
        for (int i = 0; i < ListOffigures.size(); i++) {
            System.out.println("Name: " + ListOffigures.get(i).name());
            System.out.println("Area: " + ListOffigures.get(i).area());
            System.out.println("Color: " + ListOffigures.get(i).color());
            System.out.println("Coordinates: " + ListOffigures.get(i).coordinates());
            System.out.println();
        }
    }
}
