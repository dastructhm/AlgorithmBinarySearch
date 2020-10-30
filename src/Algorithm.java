class Algorithm {
    // 记录查找的次数
    int SearchesPerformed = 1;

    // 左界下标LeftIndex = 0, 右界下标RightIndex = 数组长度 - 1
    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {
        if (LeftIndex <= RightIndex) {
            // 计算中点下标
            int MidIndex = (LeftIndex + RightIndex) / 2;

            System.out.println("Search " + SearchesPerformed + ": " + "Left = " +
                               LeftIndex + " Middle = " + MidIndex + " Right = " + RightIndex);

            // 中点值等于目标值
            if (myArray[MidIndex] == targetValue){
                System.out.println("Searches Performed: " + SearchesPerformed);
                // 返回中点下标
                return MidIndex;
            }

            // 目标值在中点左边
            else if (myArray[MidIndex] > targetValue) {
                SearchesPerformed++;
                // 递归：BinarySearch调用BinarySearch自身
                return BinarySearch(myArray, LeftIndex, MidIndex - 1, targetValue);
            }

            SearchesPerformed++;
            // 目标值在中点右边
            return BinarySearch(myArray, MidIndex + 1, RightIndex, targetValue);
        }
        // 左界和右界重合，中点值不等于目标值
        else
            return -1;
    }
}


