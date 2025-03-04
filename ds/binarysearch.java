public class binarysearch {
    // Recursive Binary Search
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        // Check if the mid element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // If target is smaller, search in the left half
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }

        // Else, search in the right half
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 72 };
        int target = 23;

        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
