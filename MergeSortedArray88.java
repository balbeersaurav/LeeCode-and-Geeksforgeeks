import java.util.Scanner;

public class MergeSortedArray88 {

    public void merge(int[] nums1, int[] nums2, int m, int n){
        int i = m-1;  // length-1
        int j = n-1;
        int k = m+n-1;

        // loop j ke basis pe chlega kyuki j jab -1 ho jayega iska matlab nums2 array element merge hogye nums1 se
        for( ; j>=0; ){
            if (i>=0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter M");
        int m = sc.nextInt();

        System.out.println("Enter N");
        int n = sc.nextInt();

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];

        // input array
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            nums2[i] = sc.nextInt();
        }

        //call the method
        MergeSortedArray88 obj = new MergeSortedArray88();
        obj.merge(nums1, nums2, m, n);

        // print array
        for (int i : nums1) {
            System.out.print(i+ " ");
        }
        sc.close();

    }
}
