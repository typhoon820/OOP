package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Circle extends Shape {

    private Point center;

    private int radius;

    public Circle(){}


    public Circle(BufferedReader reader) {
        super(reader);
        try {
            String center = reader.readLine();
            String radius = reader.readLine();
            reader.readLine();
            String[] coords = center.split(" ");
            this.center = new Point(Integer.valueOf(coords[0]), Integer.valueOf(coords[1]));
            this.radius = Integer.valueOf(radius);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(PrintStream printStream) {
        printStream.printf("I am %s circle of radius %d\n", getColor(), radius);
    }
}
