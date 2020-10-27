// int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

class Algorithm {
    // 记录搜索的次数
    int NumberOfSearchesPerformed = 1;

    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {

        // the remaining half Not empty; LeftIndex和RightIndex不重合
        if (LeftIndex <= RightIndex) {
            int MidIndex = (LeftIndex + RightIndex) / 2;
            System.out.println("Search " + NumberOfSearchesPerformed + ": " + "Left = " + LeftIndex+ " Middle = " + MidIndex + " Right = " + RightIndex);

            if (myArray[MidIndex] == targetValue){
                // 返回目标值的下标
                System.out.println("Searches Performed: " + NumberOfSearchesPerformed);
                return MidIndex;
            }

            else if (myArray[MidIndex] > targetValue) {
                NumberOfSearchesPerformed++;
                return BinarySearch(myArray, LeftIndex, MidIndex - 1, targetValue); // -1是因为MidIndex不是目标的Index
            }

            NumberOfSearchesPerformed++;
            return BinarySearch(myArray, MidIndex + 1, RightIndex, targetValue);
        }
        // the remaining half is now empty; LeftIndex和RightIndex重合
        else
            // 查找结束
            return -1;
    }
}