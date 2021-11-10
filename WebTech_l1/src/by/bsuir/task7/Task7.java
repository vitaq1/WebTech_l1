package by.bsuir.task7;


public class Task7 {


    static int[] sequense = {23, 11, 0, 5, 9, 12};

    public static void main(String[] args) {

        printArray(sequense);
        printArray(shellSort(sequense));

    }

    public static int[] shellSort(int[] array) {

        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1])
                i++;
            else {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0)
                    i--;
            }
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
