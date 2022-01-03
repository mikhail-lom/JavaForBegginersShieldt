package Chapter5;

/**
 * Exercise from chapter 5
 * with fundamentals of bubble sorting algorithm
 */
public class Bubble {
    public static void main(String[] args) {
        int[] nonSortedArray = {99, -10, 100123, 18, -978, 5623,
                463, -9, 287, 49};
        int a, b, t;
        int size;

        size = 10; // count of sorted elements

        //Demonstrating of initial array
        System.out.print("Initial array: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nonSortedArray[i]);
        System.out.println();

        // Bubble sorting algorithm realisation
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nonSortedArray[b] < nonSortedArray[b - 1]) { //if required order
                                                                 // of elements do not performed
                                                                 //  change the element's places
                    t = nonSortedArray[b - 1];
                    nonSortedArray[b - 1] = nonSortedArray[b];
                    nonSortedArray[b] = t;
                }
            }
        }
        System.out.println("Sorted array");
        for (int x :
                nonSortedArray) {
            System.out.print(x + " ");
        }
    }
}
