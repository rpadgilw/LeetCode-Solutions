import java.util.*;
public class Solution {
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //Checking Corner Case when difference is greater than k
            if (!map.containsKey(num) || i - map.get(num) > k) {
                
                map.put(num, i);

            } else {
                
                return true;
            }
        }

        return false;
    }
}
