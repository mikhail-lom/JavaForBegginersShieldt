package Algorithms;

/**
 * Insertion sort my variant
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nonSortedArray = {99, -10, 100123, 18, -978, 5623,
                463, -9, 287, 49};
        int sE, temporary; // sE - support element

        //Show initial array
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Insertion sort
        for (int i = 0; i < nonSortedArray.length; i++) {
            sE = i;
            if (sE - 1 >= 0) {
                for (sE = i; sE > 0; sE--) {
                    if (nonSortedArray[sE] < nonSortedArray[sE - 1]) {
                        temporary = nonSortedArray[sE];
                        nonSortedArray[sE] = nonSortedArray[sE - 1];
                        nonSortedArray[sE - 1] = temporary;
                    }
                }
            }
        }

        //Show sorted array
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }


    }
}