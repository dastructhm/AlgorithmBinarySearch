public class SearchResult {
    void PrintSearchResult(int IndexOfTargetNumber){
        if (IndexOfTargetNumber == -1)
            System.out.println("Target not in the array.");
        else
            System.out.println("Target found at Index " + IndexOfTargetNumber);
    }
}
