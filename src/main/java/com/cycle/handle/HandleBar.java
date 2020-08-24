package com.cycle.handle;

public class HandleBar {

    private  String  name;
    private   Double price;
    private  int gear;

    public HandleBar(String name, Double price, int gear) {
        this.name = name;
        this.price = price;
        this.gear = gear;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getGear() {
        return gear;
    }
}
