package by.bsuir.task1;

import static java.lang.Math.*;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(calculate(2,5));

    }

    static double calculate(double x, double y) {

        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2 * x) / (1 + pow(x * y, 2)));

        return numerator / denominator;

    }

}
