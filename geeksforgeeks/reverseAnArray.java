package geeksforgeeks;

public class reverseAnArray {

    public static void reverseArray(int[] arr) {

        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1};

        reverseArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
