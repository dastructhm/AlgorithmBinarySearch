class Algorithm {
    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        if (IndexOfMaxNumber >= IndexOfMinNumber) {
            int IndexIfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2;

            if (myArray[IndexIfMidNumber] == targetNumber)
                return IndexIfMidNumber;

            if (myArray[IndexIfMidNumber] > targetNumber)
                return BinarySearch(myArray, IndexOfMinNumber, IndexIfMidNumber - 1, targetNumber);

            return BinarySearch(myArray, IndexIfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }
        return -1;
    }
}