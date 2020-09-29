class Algorithm {
    int NumberOfSearchesPerformed = 0; // 记录搜索的次数

    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        NumberOfSearchesPerformed++; // 调用了一次方法，搜索了一次，所以NumberOfSearchesPerformed+1

        if (IndexOfMaxNumber >= IndexOfMinNumber) { // the remaining half Not empty; 16>=0; 7>=0;
            int IndexOfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2; // 8;
            System.out.println("Index of Middle Number: " + IndexOfMidNumber);
            if (myArray[IndexOfMidNumber] == targetNumber){ // 找到目标数字
                System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
                return IndexOfMidNumber; // 返回目标数字的index
            }

            if (myArray[IndexOfMidNumber] > targetNumber)
                // 再次调用BinarySearch方法; 中间值的索引-1，成为新的最大值的索引
                return BinarySearch(myArray, IndexOfMinNumber, IndexOfMidNumber - 1, targetNumber);

            System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
            return BinarySearch(myArray, IndexOfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }
        else
            return -1; // 查找结束，且没有返回IndexOfMidNumber,也就是目标数字不在数组中
    }
}