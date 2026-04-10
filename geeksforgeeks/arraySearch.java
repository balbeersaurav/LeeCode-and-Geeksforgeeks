package geeksforgeeks;
public class arraySearch {

    public static int search(int[] arr, int x){

        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                index = i;
                return index;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 3, 4};
        int x = 3;
        
        int index = search(arr, x);
        System.out.println(index);

    }
}
