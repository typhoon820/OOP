package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Rectangle extends Shape {

    private Point leftBottomPoint;
    private Point rightTopPoint;

    public Rectangle() {
    }

    public Rectangle(BufferedReader reader) {
        super(reader);
        try {
            String leftBottom = reader.readLine();
            String rightTop = reader.readLine();
            reader.readLine();
            String[] leftBottomCoords = leftBottom.split(" ");
            String[] rightTopCoords = rightTop.split(" ");
            this.leftBottomPoint = new Point(Integer.valueOf(leftBottomCoords[0]),
                    Integer.valueOf(leftBottomCoords[1]));
            this.rightTopPoint = new Point(Integer.valueOf(rightTopCoords[0]),
                    Integer.valueOf(rightTopCoords[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Point getLeftBottomPoint() {
        return leftBottomPoint;
    }

    public void setLeftBottomPoint(Point leftBottomPoint) {
        this.leftBottomPoint = leftBottomPoint;
    }

    public Point getRightTopPoint() {
        return rightTopPoint;
    }

    public void setRightTopPoint(Point rightTopPoint) {
        this.rightTopPoint = rightTopPoint;
    }

    @Override
    public void draw() {
        System.out.printf("I am a %s rectangle with angles at %s, %s\n",
                getColor(), leftBottomPoint.toString(), rightTopPoint.toString());
    }
}
