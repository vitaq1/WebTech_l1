package by.bsuir.task5;


public class Task5 {

    static int[] sequense = {23, 11, 0, 5, 9, 12, 72, 34, 37, 38, 66, 77, 80};

    public static void main(String[] args) {

        System.out.println("Необходимо выкинуть " + getResult(sequense) + " элементов");
    }

    static int getResult(int[] array) {

        int currentLength = 1;
        int maxLength = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]){
                currentLength++;
                if (currentLength > maxLength) maxLength = currentLength;
            }
            else {
                currentLength = 1;
            }
        }
        return array.length - maxLength;


    }

}
