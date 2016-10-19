/**
*I am using simple approach by moving element at front of pointer where is last non_zero element is.
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroAt = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                nums[nonZeroAt + 1] = nums[i];
                nonZeroAt++; 
            }
        }
        
        for(int j = nonZeroAt + 1; j < nums.length; j++) {
            nums[j] = 0;
        }
        
    }
}
