package by.bsuir.task3;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {

        printTable(0, 10, 1);

    }

    static void printTable(double a, double b, double h) {

        if (a > b) {
            System.out.println("Error. a is bigger than b");
            return;
        }
        if (h <= 0) {
            System.out.println("Error. h should be positive");
            return;
        }

        System.out.printf("%-15s%-15s\n", "x", "F(x)");
        double current = a;
        while (current <= b) {

            System.out.printf("%-15.3f%+-15.3f\n", current, tan(current));

            current += h;
        }

    }

}
