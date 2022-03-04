package com.michaelmarcal.modernjavainaction.chapter2;

public class Apple {
    private int weight;
    private Color color;

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight(){
        return this.weight;
    }

    public Color getColor(){
        return this.color;
    }
}
