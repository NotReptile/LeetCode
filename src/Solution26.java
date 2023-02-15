import java.util.Arrays;
import java.util.LinkedList;

public class Solution26 {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0)
            return 0;

        int addIndex = 1; 

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }

    public static void main(String[] args) {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        Solution26 solution = new Solution26();
        System.out.println(solution.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
