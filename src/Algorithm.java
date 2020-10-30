class Algorithm {
    // 记录搜索的次数
    int SearchesPerformed = 1;

    int BinarySearch(int[] myArray, int LeftIndex, int RightIndex, int targetValue) {

        // 左界和右界不重合
        if (LeftIndex <= RightIndex) {
            int MidIndex = (LeftIndex + RightIndex) / 2;
            System.out.println("Search " + SearchesPerformed + ": " + "Left = " + LeftIndex + " Middle = " + MidIndex + " Right = " + RightIndex);

            if (myArray[MidIndex] == targetValue){
                System.out.println("Searches Performed: " + SearchesPerformed);
                return MidIndex;
            }

            else if (myArray[MidIndex] > targetValue) {
                SearchesPerformed++;
                // 递归：BinarySearch调用BinarySearch自身
                return BinarySearch(myArray, LeftIndex, MidIndex - 1, targetValue);
            }

            SearchesPerformed++;
            // 递归：BinarySearch调用BinarySearch自身
            return BinarySearch(myArray, MidIndex + 1, RightIndex, targetValue);
        }
        // 左界和右界重合，且数组中没有目标值
        else
            return -1;
    }
}


