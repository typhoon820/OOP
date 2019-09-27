package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Figures {
    private String collectionName;

    private List<Shape> shapes;

    public Figures(String filePath) {
        this.shapes = new ArrayList<>();
        String path = getClass().getResource(filePath).getPath();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            this.collectionName = reader.readLine();
            String type = reader.readLine();
            while (type != null){
                switch (type){
                    case "Circle":
                        shapes.add(new Circle(reader));
                        break;
                    case "Rectangle":
                        shapes.add(new Rectangle(reader));
                        break;
                }
                type = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void sort() {
        shapes.sort(Shape::compareTo);
    }

    public void print(PrintStream printStream) {
        printStream.println(collectionName);
        shapes.forEach(shape -> shape.draw(printStream));
    }
}
