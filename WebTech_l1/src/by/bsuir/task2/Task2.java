package by.bsuir.task2;

import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {

        System.out.println(isInside(-3,4));
        System.out.println(isInside(1,-1));
        System.out.println(isInside(5,2));

    }

    static boolean isInside(double x, double y) {

        if ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) return true;
        if ((x >= -6 && x <= 6) && (y >= -3 && y <= 0)) return true;
        return false;

    }

}
