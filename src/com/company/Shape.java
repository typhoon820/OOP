package com.company;

import java.io.*;

public abstract class Shape implements Comparable<Shape> {

    private String color;

    private int lineWeight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLineWeight() {
        return lineWeight;
    }

    public void setLineWeight(int lineWeight) {
        this.lineWeight = lineWeight;
    }

    public abstract void draw(PrintStream printStream);

    public Shape(String color, int lineWeight) {
        this.color = color;
        this.lineWeight = lineWeight;
    }

    public Shape() {
    }


    public Shape(BufferedReader reader) {
        try {
            this.color = reader.readLine();
            this.lineWeight = Integer.valueOf(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public int compareTo(Shape shape) {
        return Integer.compare(lineWeight, shape.getLineWeight());
    }
}
