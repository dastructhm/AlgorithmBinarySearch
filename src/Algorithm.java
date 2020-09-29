class Algorithm {
    int NumberOfSearches = 0;

    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        NumberOfSearches++;
            if (IndexOfMaxNumber >= IndexOfMinNumber) { // 16 >= 0
            int IndexOfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2;

            if (myArray[IndexOfMidNumber] == targetNumber)

                return IndexOfMidNumber;

            if (myArray[IndexOfMidNumber] > targetNumber) // 再次调用BinarySearch方法
                return BinarySearch(myArray, IndexOfMinNumber, IndexOfMidNumber - 1, targetNumber);

            System.out.println("Time Complexity: " + NumberOfSearches);
            return BinarySearch(myArray, IndexOfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }

        return -1;
    }
}