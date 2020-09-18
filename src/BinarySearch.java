class BinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int BinarySearcher(int myArray[], int left, int right, int target) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            // 元素在中间点
            if (myArray[middle] == target)
                return middle;

            // If element is smaller than mid, then it can only be present in left sub-array
            if (myArray[middle] > target)
                return BinarySearcher(myArray, left, middle - 1, target);

            // Else the element can only be present in right sub-array
            return BinarySearcher(myArray, middle + 1, right, target);
        }

        // We reach here when element is not present in array
        return -1;
    }
}