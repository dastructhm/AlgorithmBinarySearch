class Algorithm {
    int NumberOfSearchesPerformed = 0; // 记录搜索的次数

    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        NumberOfSearchesPerformed++; // 调用了一次方法，搜索了一次，所以NumberOfSearchesPerformed+1

        if (IndexOfMaxNumber >= IndexOfMinNumber) { // 16 >= 0
            int IndexOfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2;

            if (myArray[IndexOfMidNumber] == targetNumber){
                System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
                return IndexOfMidNumber;
            }

            if (myArray[IndexOfMidNumber] > targetNumber) // 再次调用BinarySearch方法
                return BinarySearch(myArray, IndexOfMinNumber, IndexOfMidNumber - 1, targetNumber);

            System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
            return BinarySearch(myArray, IndexOfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }
        else
            return -1; // 查找结束，且没有返回IndexOfMidNumber,也就是目标数字不在数组中
    }
}