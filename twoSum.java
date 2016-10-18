/**
* This is one of the simple problems in leetcode.
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* 
* I am using hashmap to solve this problem. This is explained as. Consier tagret is 13 and array is [2,3,11].
* Code will iterate over array and find if key is present in map i.e. for 2 it will search if there 2 present in hashmap.
* If there is no such key, then it will add key = target - current val, index of current value. 
* SO, 2 will add key (11,0) in map and at time of 11, I will understand that there is some number present which require 11 to complete
* target.
* 
*/



import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> loc = new HashMap<>();
        int sol[] = new int[2];
        
        //int j = nums.length;
        for(int i =0; i < nums.length; i++) {
            if(loc.containsKey(nums[i])){
                sol[0] = loc.get(nums[i]);
                sol[1] = i;
                //return(loc.get(nums[i]),i);
                return(sol);
            }
            else{
                loc.put(target - nums[i], i);
            }
        }
        return(sol);
    }
}
