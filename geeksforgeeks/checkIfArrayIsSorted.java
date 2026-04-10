package geeksforgeeks;

public class checkIfArrayIsSorted {
    
    public static boolean IsSorted(int[] arr){
        boolean check = true;
        int i=0;
        while (i<arr.length-1) {
            if(arr[i] >= arr[i+1]){
                check = false;
                return check;
            }
            i++;
        }
        return check;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5};

        boolean check = IsSorted(arr);

        System.out.println(check);

    }
}
