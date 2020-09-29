public class Main {
    public static void main(String[] args) {
        // 创建数组；获得数组的长度；
        int[] myArray = {2, 3, 4, 10, 40};
        int lengthOfMyArray = myArray.length;
        System.out.println("The length of my array is " + lengthOfMyArray);

        // 查找的目标数
        int targetNumber = 40;

        Algorithm myAlgorithm = new Algorithm();
        int IndexOfTargetNumber = myAlgorithm.BinarySearch(myArray, 0, lengthOfMyArray - 1, targetNumber);
        if (IndexOfTargetNumber == -1)
            System.out.println("Target number is not in the array.");
        else
            System.out.println("Target number found at Index " + IndexOfTargetNumber);
    }
}