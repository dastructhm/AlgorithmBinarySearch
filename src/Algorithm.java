// int[] myArray = {6, 7, 8, 9, 10};
// int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

class Algorithm {
    // 记录搜索的次数
    int NumberOfSearchesPerformed = 0;

    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {
        // 调用了一次方法，搜索了一次，所以NumberOfSearchesPerformed + 1
        NumberOfSearchesPerformed++;

        // the remaining half Not empty; LeftIndex和RightIndex不重合
        if (RightIndex >= LeftIndex) {
            // 注意不要写成(LeftIndex-RightIndex) / 2
            int MidIndex = LeftIndex + (RightIndex - LeftIndex) / 2;
            // 打印中间值的索引
            System.out.println("Current Middle Index: " + MidIndex);

            // 找到目标数字
            if (myArray[MidIndex] == targetValue){
                // 返回目标数字的index
                System.out.println("After Search "  + NumberOfSearchesPerformed + ", current Left Index: " + (MidIndex + 1)  + " ");
                System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
                return MidIndex;
            }

            // 目标值在中间值左边
            if (myArray[MidIndex] > targetValue) {
                System.out.print("After Search "  + NumberOfSearchesPerformed + ", current Right Index: " + (MidIndex - 1) + " ");
                // 再次调用BinarySearch方法; 中间值的索引-1，成为新的最大值的索引；最小值的索引不变
                return BinarySearch(myArray, LeftIndex, MidIndex - 1, targetValue); // -1是因为MidIndex不是目标的Index
            }

            System.out.println("After Search "  + NumberOfSearchesPerformed + ", current Left Index: " + (MidIndex + 1)  + " ");
            // 目标值在中间值右边
            // 再次调用BinarySearch方法; 中间值的索引+1，成为新的最小值的索引；最大值的索引不变
            return BinarySearch(myArray, MidIndex + 1, RightIndex, targetValue);
        }
        // the remaining half is now empty; LeftIndex和RightIndex重合
        else
            // 查找结束，且没有返回IndexOfMidNumber,也就是目标数字不在数组中
            return 0;
    }
}