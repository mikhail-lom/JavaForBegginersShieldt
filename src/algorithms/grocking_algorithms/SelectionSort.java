package algorithms.grocking_algorithms;

public class SelectionSort {

    void sort(int[] unsortedArray){
        for (int i=0;i<unsortedArray.length;i++) {
            int temp = unsortedArray[i];
            for (int j=i; j<unsortedArray.length; j++){
                if (temp>unsortedArray[j]){
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[i];
                    unsortedArray[i]=temp;
                }
            }
        }
    }

    void printArray(int[] array){
        for (int item :
                array) {
            System.out.print(item + " ");
        }
    }
    public static void main(String[] args) {
        SelectionSort testSort = new SelectionSort();
        int[] testArray = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        testSort.sort(testArray);
        System.out.println("SortedArray!");
        testSort.printArray(testArray);
    }
}
