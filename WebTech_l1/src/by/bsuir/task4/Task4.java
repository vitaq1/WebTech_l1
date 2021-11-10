package by.bsuir.task4;


public class Task4 {

    static int[] array = {23, 11, 0, 5, 9, 0, 72, 3, 34, 37, 2, 66};

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) System.out.println(i + 1);
        }

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int j = 3; j * j <= n; j += 2)
            if (n % j == 0) return false;

        return true;
    }

}
