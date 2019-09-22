package com.company;

public class Main {

    public static void main(String[] args) {

        Figures figures = new Figures("figures.txt");

        figures.print();
        figures.sort();
        figures.print();
    }
}
