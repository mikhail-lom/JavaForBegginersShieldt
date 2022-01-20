package algorithms.grocking_algorithms;

public class BinarySearchDemo {

    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        String err = "Element not found";

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess>item) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return null;
    }




    public static void main(String[] args) {
        int[] numberArray = {1, 2, 4, 5, 8, 16, 35, 89};

        System.out.println(binarySearch(numberArray, 16));
        System.out.println(binarySearch(numberArray, 134));


    }
}









