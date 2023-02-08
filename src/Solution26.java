import java.util.Arrays;

public class Solution26 {
    public int removeDuplicates(int[] nums){
        int k = 0;
        int []temp = new int[nums.length];
        for (int i = 1 ; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                k++;
            }
            else
                temp[k+1] = nums[i];
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(k);
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution26 solution = new Solution26();
        solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
