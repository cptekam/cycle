package com.cycle.frame;

public class Frame {
    private   String name;
    private  Double price;

    public Frame(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
