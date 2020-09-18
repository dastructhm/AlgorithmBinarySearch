public class Main {
    public static void main(String[] args) {
        Algorithm myAlgorithm = new Algorithm();
        int[] myArray = {2, 3, 4, 10, 40};
        int lengthOfMyArray = myArray.length;
        System.out.println("The length of my array is " + lengthOfMyArray);
        int targetNumber = 3;
        int result = myAlgorithm.BinarySearch(myArray, 0, lengthOfMyArray - 1, targetNumber);
        if (result == -1)
            System.out.println("Target number not found");
        else
            System.out.println("Target number found at Index " + result);
    }
}