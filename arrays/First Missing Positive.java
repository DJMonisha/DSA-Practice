class Solution {
  public int firstMissingPositive(int[] nums) {
      
      int ans[] = new int[nums.length + 1];

      // mark the presence of each positive integer in the input array
      for(int i = 0; i < nums.length; i++){
          int val = nums[i];
          if(val > 0 && val <= nums.length) { // check to avoid index out of bounds
              ans[val] = 1;
          }
      }

      // find the smallest missing positive integer by checking the array of marked integers
      for(int i = 1; i < ans.length; i++){
          if(ans[i] == 0){
              return i;
          }
      }

      // if no missing positive integer is found, return the length of the array
  return ans.length;
  }
}