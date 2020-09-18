// https://www.geeksforgeeks.org/binary-search/
// Java implementation of recursive Binary Search

public class Main {
    // Driver method to test above
    public static void main(String[] args) {
        BinarySearch object = new BinarySearch();

        int[] myArray = {2, 3, 4, 10, 40};

        int lengthOfArray = myArray.length;

        int target = 3;

        int result = object.BinarySearcher(myArray, 0, lengthOfArray - 1, target);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at Index " + result);
    }
}