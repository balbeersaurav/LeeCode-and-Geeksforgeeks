package geeksforgeeks;

public class largestInArray {
    
    public static int largestElement(int[] arr){

        int largest = arr[0];
        for (int i : arr) {
            if(largest < i)
                largest = i;
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 8, 7, 56, 90};

        int largest = largestElement(arr);

        System.out.println(largest);
    }
}
