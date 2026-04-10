package geeksforgeeks;

public class binarySearch {

    public static int findElement(int[] arr, int k) { // Iterative

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (k > arr[mid]) {
                start = mid + 1; // 2nd half
            } else if (k < arr[mid]) {
                end = mid - 1; // 1st half
            } else {
                ans = mid;
                end = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 1, 2};
        int k = 2;

        int result = findElement(arr, k);

        System.out.println(result);

    }
}
