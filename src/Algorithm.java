// int[] myArray = {1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71};

class Algorithm {
    // 记录搜索的次数
    int SearchesPerformed = 1;

    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {

        // 左界和右界不重合
        if (LeftIndex <= RightIndex) {
            int MidIndex = (LeftIndex + RightIndex) / 2;
            System.out.println("Search " + SearchesPerformed + ": " + "Left = " + LeftIndex+ " Middle = " + MidIndex + " Right = " + RightIndex);

            if (myArray[MidIndex] == targetValue){
                System.out.println("Searches Performed: " + SearchesPerformed);
                return MidIndex;
            }

            else if (myArray[MidIndex] > targetValue) {
                SearchesPerformed++;
                return BinarySearch(myArray, LeftIndex, MidIndex - 1, targetValue);
            }

            SearchesPerformed++;
            return BinarySearch(myArray, MidIndex + 1, RightIndex, targetValue);
        }
        // 查找结束
        else
            return -1;
    }
}