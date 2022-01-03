package Chapter5.ExercisesForSelfControl;

/**
 * Exercise from chapter 5
 * with fundamentals of bubble sorting algorithm
 */
public class Exercise4 {
    public static void main(String[] args) {
        String[] nonSortedArray = {"is", "abc", "100123", "em", "-opi", "5]=-",
                "rty", "+z", "287", "49"};
        int a, b;
        String  t;
        int size = nonSortedArray.length; // count of sorted elements

        //Demonstrating of initial array
        System.out.print("Initial array: ");
        for (String s : nonSortedArray) System.out.print(" " + s);
        System.out.println();
//        for (String s:
//             nonSortedArray) {
//            System.out.print(nonSortedArray.);
//            System.out.println();
//        }

        // Bubble sorting algorithm realisation
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nonSortedArray[b].compareTo(nonSortedArray[b-1]) < 0) { //if required order
                                                                 // of elements do not performed
                                                                 //  change the element's places
                    t = nonSortedArray[b - 1];
                    nonSortedArray[b - 1] = nonSortedArray[b];
                    nonSortedArray[b] = t;
                }
            }
        }
        System.out.println("Sorted array");
        for (String x :
                nonSortedArray) {
            System.out.print(x + " ");
        }
    }
}
