public class Main {
    public static void main(String[] args) {
        // 创建一个有17个元素的数组.
        int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

        System.out.println("The length of my array is " + myArray.length);

        int targetNumber = 7;

        // 实例化出来一个对象myAlgorithm
        Algorithm myAlgorithm = new Algorithm();

        //调用方法，返回MidIndex
        int IndexOfTargetNumber = myAlgorithm.BinarySearch(myArray, 0, myArray.length - 1, targetNumber);

        // 实例化出来一个对象myResult
        SearchResult myResult = new SearchResult();
        myResult.PrintSearchResult(IndexOfTargetNumber);
    }
}