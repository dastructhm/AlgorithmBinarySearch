class Algorithm {
    int TimeComplexity = 0;

    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        if (IndexOfMaxNumber >= IndexOfMinNumber) { // 16 >= 0
            int IndexOfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2;

            if (myArray[IndexOfMidNumber] == targetNumber)
                return IndexOfMidNumber;

            if (myArray[IndexOfMidNumber] > targetNumber) // 再次调用BinarySearch方法
                return BinarySearch(myArray, IndexOfMinNumber, IndexOfMidNumber - 1, targetNumber);

            // 再次调用BinarySearch方法
            return BinarySearch(myArray, IndexOfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }
        return -1;
    }
}