package by.bsuir.task9;

import by.bsuir.task9.*;

public class Task9 {


    public static void main(String[] args) {

        by.bsuir.task9.Basket basket = new by.bsuir.task9.Basket();
        basket.addBall(new Ball("BLUE", 200));
        basket.addBall(new Ball("RED", 300));
        basket.addBall(new Ball("YELLOW", 250));
        basket.addBall(new Ball("GREEN", 400));
        basket.addBall(new Ball("BLUE", 375));
        basket.addBall(new Ball("RED", 350));
        basket.addBall(new Ball("BLUE", 275));

        System.out.println("Weight: " + getTotalWeight(basket));
        System.out.println("Blue balls count: " + getBlueBallsCount(basket));
    }

    static double getTotalWeight(Basket basket) {
        double totalWeight = 0;
        for (int i = 0; i < basket.getSize(); i++) {
            totalWeight += basket.getBalls().get(i).getWeight();
        }

        return totalWeight;
    }

    static int getBlueBallsCount(Basket basket) {
        int count = 0;
        for (int i = 0; i < basket.getSize(); i++) {
            if (basket.getBalls().get(i).getColour().equals("BLUE"))
                count++;
        }
        return count;
    }

}
