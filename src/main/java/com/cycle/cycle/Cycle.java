package com.cycle.cycle;

import com.cycle.chain.ChainAssembly;
import com.cycle.frame.Frame;
import com.cycle.seat.Seat;
import com.cycle.wheel.Wheel;

public class Cycle {
    private Seat seat;
    private Wheel front, rear;
    private ChainAssembly chainAssembly;
    private Frame frame;

    public Cycle(Seat seat, Wheel front, Wheel rear, ChainAssembly chainAssembly, Frame frame) {
        this.seat = seat;
        this.front = front;
        this.rear = rear;
        this.chainAssembly = chainAssembly;
        this.frame = frame;
    }

    public Double computePrice() {

        return seat.getPrice() +
                        front.getPrice() + rear.getPrice() + chainAssembly.getPrice() + frame.getPrice();
    }
}
