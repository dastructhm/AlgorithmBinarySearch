public class Main {
    public static void main(String[] args) {
        SetLength myArrayLength = new SetLength();
        int arrayLength = myArrayLength.SetMyArrayLength();

        int[] myArray = new int[arrayLength];

        InputElements myElements = new InputElements();
        myElements.SetElements(arrayLength, myArray);

        SetTarget myTargetNumber = new SetTarget();
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