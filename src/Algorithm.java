class Algorithm {
    int NumberOfSearchesPerformed = 0; // 记录搜索的次数

    int BinarySearch(int[] myArray, int IndexOfMinNumber, int IndexOfMaxNumber, int targetNumber) {
        NumberOfSearchesPerformed++; // 调用了一次方法，搜索了一次，所以NumberOfSearchesPerformed+1

        if (IndexOfMaxNumber >= IndexOfMinNumber) { // the remaining half Not empty; 16>=0; 7>=0;
            int IndexOfMidNumber = IndexOfMinNumber + (IndexOfMaxNumber - IndexOfMinNumber) / 2; // 8;
            System.out.println("Current Index of Middle Number: " + IndexOfMidNumber); // 显示中间值的索引

            if (myArray[IndexOfMidNumber] == targetNumber){ // 找到目标数字
                System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
                return IndexOfMidNumber; // 返回目标数字的index
            }

            if (myArray[IndexOfMidNumber] > targetNumber) {
                // 再次调用BinarySearch方法; 中间值的索引-1，成为新的最大值的索引；最小值的索引不变
                System.out.println("Current Index of Max Number: " + (IndexOfMidNumber - 1));
                return BinarySearch(myArray, IndexOfMinNumber, IndexOfMidNumber - 1, targetNumber);
            }
            System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);

            // 再次调用BinarySearch方法; 中间值的索引+1，成为新的最小值的索引；最大值的索引不变
            return BinarySearch(myArray, IndexOfMidNumber + 1, IndexOfMaxNumber, targetNumber);
        }
        else
            return -1; // 查找结束，且没有返回IndexOfMidNumber,也就是目标数字不在数组中
    }
}