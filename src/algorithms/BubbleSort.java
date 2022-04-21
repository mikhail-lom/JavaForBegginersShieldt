package algorithms;

public class BubbleSort {
    void sort(int[] arrayForSorting){
        for (int i=0; i<arrayForSorting.length-1;i++) {
            for (int j=arrayForSorting.length-1;j>i;j--) {
                if(arrayForSorting[j] < arrayForSorting[j-1]){
                    int temp = arrayForSorting[j];
                    arrayForSorting[j] = arrayForSorting[j-1];
                    arrayForSorting[j-1] = temp;
                }
            }
        }
    }

    void printArray(int[] arrayForSorting){
        for (int item :
                arrayForSorting) {
            System.out.print(item + " ; ");
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, -34, 25, 12, -22, 11, 90, 87, 0 };
        ob.sort(arr);
        System.out.println("Sorted array!!!");
        ob.printArray(arr);
    }

}
