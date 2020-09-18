class Algorithm {

    int BinarySearch(int[] myArray, int leftBorder, int rightBorder, int target) {
        if (rightBorder >= leftBorder) {
            int middle = leftBorder + (rightBorder - leftBorder) / 2;

            // 元素在中间点
            if (myArray[middle] == target)
                return middle;

            // If element is smaller than mid, then it can only be present in left sub-array
            if (myArray[middle] > target)
                return BinarySearch(myArray, leftBorder, middle - 1, target);

            // Else the element can only be present in right sub-array
            return BinarySearch(myArray, middle + 1, rightBorder, target);
        }

        // We reach here when element is not present in array
        return -1;
    }
}