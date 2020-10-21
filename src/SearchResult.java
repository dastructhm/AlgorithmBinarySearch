public class SearchResult {
    void PrintSearchResult(int IndexOfTargetNumber){
        if (IndexOfTargetNumber == 0)
            System.out.println("The target number is not in the array.");
        else
            System.out.println("The target number was found at Index " + IndexOfTargetNumber);
    }
}
