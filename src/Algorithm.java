// int[] myArray = {5, 88, 220};
// int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

class Algorithm {
    // 记录搜索的次数
    int NumberOfSearchesPerformed = 0;

    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {
        // 调用了一次方法，搜索了一次，所以NumberOfSearchesPerformed + 1
        NumberOfSearchesPerformed++;

        // the remaining half Not empty; LeftIndex和RightIndex不重合
        if (RightIndex >= LeftIndex) {
            int MidIndex = LeftIndex + (RightIndex - LeftIndex) / 2;
            // 打印中间值的索引
            System.out.println("Middle Index: " + MidIndex);

            // 中间值等于目标值
            if (myArray[MidIndex] == targetValue){
                // 返回目标值的下标
                System.out.println("After Search "  + NumberOfSearchesPerformed + ", Left Index: " + (MidIndex)  + " ");
                System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
                return MidIndex;
            }

            // 中间值大了
            if (myArray[MidIndex] > targetValue) {
                System.out.println("After Search "  + NumberOfSearchesPerformed + ", Right Index: " + (MidIndex) + " ");
                // 再次调用BinarySearch方法; 中间值的索引-1，成为新的最大值的索引；最小值的索引不变
                return BinarySearch(myArray, LeftIndex, MidIndex - 1, targetValue); // -1是因为MidIndex不是目标的Index
            }

            System.out.println("After Search "  + NumberOfSearchesPerformed + ", Left Index: " + (MidIndex)  + " ");
            // 目标值在中间值右边
            // 再次调用BinarySearch方法; 中间值的索引+1，成为新的最小值的索引；最大值的索引不变
            return BinarySearch(myArray, MidIndex + 1, RightIndex, targetValue);
        }
        // the remaining half is now empty; LeftIndex和RightIndex重合
        else
            // 查找结束
            return 1;
    }
}