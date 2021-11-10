package by.bsuir.task9;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> balls;

    public Basket() {
        balls = new ArrayList<Ball>();
    }

    public ArrayList<Ball> getBalls () {
        return balls;
    }

    public void addBall (Ball ball) {
        balls.add(ball);
    }

    public int getSize() {
        return balls.size();
    }

    public void clearBasket () {
        balls.clear();

    }

}
