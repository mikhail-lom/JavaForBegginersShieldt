package algorithms;

public class QuickSort {
    int pivot;
    int leftMarker;
    int rightMarker;
    int arraySizeParameter;



    void sort(int[] unsortedArray) {
        if (unsortedArray.length%2 != 0){
            arraySizeParameter = (unsortedArray.length/2)+1;
        } else {
            arraySizeParameter = unsortedArray.length/2;
        }
        if (unsortedArray.length > 2) {
            for (int i=0; i<unsortedArray.length; i++) {
                pivot = unsortedArray[arraySizeParameter-1];
                leftMarker = unsortedArray[i];
                if (leftMarker > pivot) {
                    unsortedArray[i] = pivot;
                    pivot = leftMarker;
                }

                for (int j= unsortedArray.length-1;j>i;j--) {
                    rightMarker = unsortedArray[j];
                    if (rightMarker < pivot) {
                        unsortedArray[j] = pivot;
                        pivot = rightMarker;
                    }
                }
            }

            //array division into 2 arrays for recursion operations
            int[] underArray = new int[arraySizeParameter];
            for (int i=0; i<arraySizeParameter; i++) {
                underArray[i] = unsortedArray[i];
            }

            int[] upperArray = new int[unsortedArray.length-arraySizeParameter];;
            for (int i=0; i<(unsortedArray.length-arraySizeParameter); i++) {
                upperArray[i] = unsortedArray[(i+arraySizeParameter)-1];
            }
            sort(underArray);
            sort(upperArray);

        } else {// base case for 2 cells in array and 1 cell array
            if (unsortedArray.length == 2) {
                int temp;
                if (unsortedArray[0] > unsortedArray[1]) {
                    temp = unsortedArray[0];
                    unsortedArray[0] = unsortedArray[1];
                    unsortedArray[1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nonSortedArray = {99, -10, 100123, 18, -978, 5623,
                463, -9, 287, 49, 11};
        QuickSort qs = new QuickSort();
        qs.sort(nonSortedArray);
        System.out.println("Sorted Array!");
        for (int item :
                nonSortedArray) {
            System.out.println(item);
        }
    }
}
