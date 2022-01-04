package Algorithms;

/**
 * Simple realization of Selection sorting
 */
public class SelectionSortingOfArray {
    public static void main(String[] args) {
        int[] nonSortedArray = {99, -10, 100123, 18, -978, 5623,
                463, -9, 287, 49};
        int temporary = nonSortedArray[0];

        //Show initial array
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Selection sort
        for (int j = 0; j < nonSortedArray.length-1; j++) {
            int minIdx = j;
            for (int i = j+1; i < nonSortedArray.length; i++) {
                if (nonSortedArray[i] < nonSortedArray[minIdx]) {
                    minIdx = i;
                }
            }
            temporary = nonSortedArray[minIdx];
            nonSortedArray[minIdx] = nonSortedArray[j];
            nonSortedArray[j] = temporary;

        }



        // Show sorted array
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }


    }
}


