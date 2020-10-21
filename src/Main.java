import java.util.Scanner;
// int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

public class Main {
    public static void main(String[] args) {
        SetArrayLength myArrayLength = new SetArrayLength();
        int arrayLength = myArrayLength.SetMyArrayLength();
        System.out.println("The length of my array is " + arrayLength);

        int[] myArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            Scanner UserInput = new Scanner(System.in);
            myArray[i] = UserInput.nextInt();
        }



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