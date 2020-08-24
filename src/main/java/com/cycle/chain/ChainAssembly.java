package com.cycle.chain;

public class ChainAssembly {
    private   String name;
    private  Double price;

    public ChainAssembly(String name, Double price) {
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
