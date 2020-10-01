public class Main {
    public static void main(String[] args) {

        // 创建一个有17个元素的数组
        int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

        // 获得数组的长度
        int lengthOfMyArray = myArray.length;
        System.out.println("The length of my array is " + lengthOfMyArray);

        // 获得数组的长度
        int targetNumber = 7;

        // 实例化出来一个对象
        Algorithm myAlgorithm = new Algorithm();
        int IndexOfTargetNumber = myAlgorithm.BinarySearch(myArray, 0, lengthOfMyArray - 1, targetNumber);

        if (IndexOfTargetNumber == 0)
            System.out.println("The target number is not in the array.");
        else
            System.out.println("The target number was found at Index " + IndexOfTargetNumber);
    }
}