
// 26. Remove Duplicate from Sorted Array
//  in-place = means jo v kaam kro is array me hi kro bina koi array bnaye
public class RemoveDuplicatefromSortedArray26 {

    public static int removeDuplicate(int[] nums){
        int unique = 0;
        for(int i=0; i<nums.length-1; i++){
            if (nums[i] != nums[i+1]) {
                nums[unique] = nums[i];
                unique ++;
            }
        }
        return unique ;

    } 
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int noOfUniqueElement = removeDuplicate(nums);

        System.out.println(noOfUniqueElement);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
