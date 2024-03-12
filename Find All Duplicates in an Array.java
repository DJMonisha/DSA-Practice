import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if(n <= 1) return ans;

        boolean[] vis = new  boolean[(int)Math.pow(10, 5)];
        
        for(int num : nums){
            if(vis[num]) ans.add(num);
            else vis[num] = true;
        }
        return ans;
    }
}