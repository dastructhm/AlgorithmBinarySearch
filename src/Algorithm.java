class Algorithm {
    int NumberOfSearchesPerformed = 0; // 记录搜索的次数

    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        NumberOfSearchesPerformed++;
            if (IndexOfMaxNumber >= IndexOfMinNumber) { // 16 >= 0
            int IndexOfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2;

            if (myArray[IndexOfMidNumber] == targetNumber){
                System.out.println("Number Of Searches: " + NumberOfSearchesPerformed);
                return IndexOfMidNumber;
            }

            if (myArray[IndexOfMidNumber] > targetNumber) // 再次调用BinarySearch方法
                return BinarySearch(myArray, IndexOfMinNumber, IndexOfMidNumber - 1, targetNumber);

            System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
            return BinarySearch(myArray, IndexOfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }
        return -1;
    }
}