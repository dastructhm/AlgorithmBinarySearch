class Algorithm {
    int NumberOfSearchesPerformed = 0; // 记录搜索的次数

    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {
        NumberOfSearchesPerformed++; // 调用了一次方法，搜索了一次，所以NumberOfSearchesPerformed+1

        if (RightIndex >= LeftIndex) { // the remaining half Not empty;
            int IndexOfMidNumber = LeftIndex + (RightIndex - LeftIndex) / 2;
            System.out.println("Current Index of Middle Number: " + IndexOfMidNumber); // 显示中间值的索引

            if (myArray[IndexOfMidNumber] == targetValue){ // 找到目标数字
                System.out.println("Number Of Searches Performed: " + NumberOfSearchesPerformed);
                return IndexOfMidNumber; // 返回目标数字的index
            }

            if (myArray[IndexOfMidNumber] > targetValue) {
                // 再次调用BinarySearch方法; 中间值的索引-1，成为新的最大值的索引；最小值的索引不变
                System.out.println("Current Index of New Max Number: " + (IndexOfMidNumber - 1));
                return BinarySearch(myArray, LeftIndex, IndexOfMidNumber - 1, targetValue);
            }

            // 再次调用BinarySearch方法; 中间值的索引+1，成为新的最小值的索引；最大值的索引不变
            System.out.println("Current Index of New Min Number: " + (IndexOfMidNumber + 1));
            return BinarySearch(myArray, IndexOfMidNumber + 1, RightIndex, targetValue);
        }
        else
            return -1; // 查找结束，且没有返回IndexOfMidNumber,也就是目标数字不在数组中
    }
}