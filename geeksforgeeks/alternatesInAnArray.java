package geeksforgeeks;



import java.util.ArrayList;

public class alternatesInAnArray {
    
    public static ArrayList<Integer> getAlternates(int arrs[]) {
        // Code Here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arrs.length; i+=2){
            list.add(arrs[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> list = getAlternates(arr);
        System.out.println(list);
    
    }
}
