@SuppressWarnings("InfiniteLoopStatement")

public class Main {
    public static void main(String[] args) {
        SetArrayLength myArrayLength = new SetArrayLength();
        int arrayLength = myArrayLength.SetMyArrayLength();
        System.out.println("The length of my array is " + arrayLength);

        int[] myArray = new int[arrayLength];

        SetArrayElements myElements = new SetArrayElements();
        myElements.SetElements(arrayLength, myArray);

        SetTargetNumber myTargetNumber = new SetTargetNumber();
        int targetNumber = myTargetNumber.ReadInTargetNumber();

        // 实例化出来一个对象myAlgorithm
        Algorithm myAlgorithm = new Algorithm();

        //调用方法，返回MidIndex
        int IndexOfTargetNumber = myAlgorithm.BinarySearch(myArray, 0, arrayLength - 1, targetNumber);

        // 实例化出来一个对象myResult
        SearchResult myResult = new SearchResult();
        myResult.PrintSearchResult(IndexOfTargetNumber);
        }
}