package algorithms;

public class BubbleSortingOfArray {
    public static void main(String[] args) {
        int[] nonSortedArray = {99, -10, 100123, 18, -978, 5623,
                463, -9, 287, 49};

        //Show initial array
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Bubble sort
        for(int i = 1; i < nonSortedArray.length; i++) {
            for (int j = nonSortedArray.length - 1;j >= i; j--) {
                int t = 0;
                if (nonSortedArray[j] < nonSortedArray[j-1]) {
                    t = nonSortedArray[j-1];
                    nonSortedArray[j-1] = nonSortedArray[j];
                    nonSortedArray[j] = t;
                }
            }
        }
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }

    }
}

