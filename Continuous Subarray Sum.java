class Solution {
  public boolean checkSubarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      map.put(0, -1);
      int currSum = 0, i, n = nums.length;
      for(i=0;i<n;i++){
          currSum += nums[i];
          currSum %= k;
          if(map.containsKey(currSum) && i - map.get(currSum)>1) 
              return true;
          if(!map.containsKey(currSum)) map.put(currSum, i);
      }
      return false;
  }
}