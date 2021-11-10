package by.bsuir.task6;


public class Task6 {


    static int[] sequense = {23, 11, 0, 5, 9, 12};
    static int currentIndex = 0;

    public static void main(String[] args) {

        printMatrix(getMatrix(sequense));

    }

    static int[][] getMatrix(int[] array) {

        int n = array.length;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = getElementFromArray(array);
            }
            currentIndex = i + 1;
        }
        return matrix;
    }

    static int getElementFromArray(int[] array) {
        int numberForReturn = array[currentIndex];
        currentIndex++;
        if (currentIndex > array.length - 1) currentIndex = 0;
        return numberForReturn;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
