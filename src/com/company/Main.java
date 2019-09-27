package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        Figures figures = new Figures("figures.txt");

        try {
            figures.print(new PrintStream(new FileOutputStream("figures1.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        figures.sort();
        figures.print(System.out);
    }
}
