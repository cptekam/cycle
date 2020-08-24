package com.cycle;

import com.cycle.chain.ChainAssembly;
import com.cycle.cycle.Cycle;
import com.cycle.frame.Frame;
import com.cycle.seat.Seat;
import com.cycle.wheel.Wheel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public class App {
    private static final Integer MAX_THREAD = 10;

    public static void main(String[] args) {
        ArrayList<Cycle> cycles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number cycle you want to assemble = >");
        int cycleCount = sc.nextInt();
        for (int i = 0; i < cycleCount; i++) {
            System.out.println("Enter the seat name = > ");
            String seatName = sc.next();
            System.out.println("Enter the seat price = > ");
            Double seatPrice = sc.nextDouble();
            Seat seat = new Seat(seatName, seatPrice);

            System.out.println("Enter the Wheel front name = > ");
            String wheelName = sc.next();
            System.out.println("Enter the wheel front  price = > ");
            Double wheelPrice = sc.nextDouble();
            Wheel front = new Wheel(wheelName, wheelPrice);

            System.out.println("Enter the Wheel rear  name = > ");
            String wheelRearName = sc.next();
            System.out.println("Enter the wheel rear  price = > ");
            Double rearPrice = sc.nextDouble();
            Wheel rear = new Wheel(wheelRearName, rearPrice);

            System.out.println("Enter the chain name = > ");
            String chainName = sc.next();
            System.out.println("Enter the chain  price = > ");
            Double chainPrice = sc.nextDouble();
            ChainAssembly chainAssembly = new ChainAssembly(chainName, chainPrice);

            System.out.println("Enter the frame name = > ");
            String frameName = sc.next();
            System.out.println("Enter the frame  price = > ");
            Double framePrice = sc.nextDouble();
            Frame frame = new Frame(frameName, framePrice);

            Cycle cycle = new Cycle(seat, front, rear, chainAssembly, frame);

            cycles.add(cycle);
            System.out.println("Cycle " + (i + 1) + " assembled.");
        }
        sc.close();

        ExecutorService executorService = Executors.newFixedThreadPool(MAX_THREAD);

        for (int i = 0; i < cycles.size(); i++) {
            int finalI1 = i;
            int finalI = i + 1;
            executorService.submit(() -> {

                System.out.println(" Cycle price for cycle " + finalI + " =>" + cycles.get(finalI1).computePrice());

            });
        }
        executorService.shutdown();
    }
}
