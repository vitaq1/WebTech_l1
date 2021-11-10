package by.bsuir.task8;


import java.util.ArrayList;

public class Task8 {


    static int[] sequenseA = {13, 13, 15, 21, 35, 50};
    static int[] sequenseB = {14, 19, 25, 32, 40, 48};

    public static void main(String[] args) {

        System.out.println((mergeArrays(sequenseA, sequenseB).toString()));

    }

    public static ArrayList<Integer> mergeArrays(int[] a, int[] b) {

        int length = a.length + b.length;
        ArrayList<Integer> mergedSequence = new ArrayList<>();
        int indexA = 0, indexB = 0;
        int curIndex = 0;


        while (curIndex < length) {

            if ((indexA < a.length) && (indexB < b.length)) {

                if (a[indexA] == b[indexB]) {
                    mergedSequence.add(a[indexA]);
                    mergedSequence.add(a[indexB]);
                    System.out.println("Элемент " + b[indexB] + " вставляется после элемента " + a[indexA-1]);
                    indexA++;
                    indexB++;
                    curIndex += 2;
                } else if (a[indexA] < b[indexB]) {
                    mergedSequence.add(a[indexA]);
                    indexA++;
                    curIndex++;
                } else if (b[indexB] < a[indexA]) {
                    mergedSequence.add(b[indexB]);
                    System.out.println("Элемент " + b[indexB] + " вставляется после элемента " + a[indexA-1]);
                    indexB++;
                    curIndex++;

                }

            }
            if ((indexB >= b.length) && (indexA < a.length)) {
                mergedSequence.add(a[indexA]);
                indexA++;
                curIndex++;
            } else if ((indexA >= a.length) && (indexB < b.length)) {
                mergedSequence.add(b[indexB]);
                System.out.println("Элемент " + b[indexB] + " вставляется после элемента " + a[indexA-1]);
                indexB++;
                curIndex++;
            }
        }
        return mergedSequence;
    }


}
