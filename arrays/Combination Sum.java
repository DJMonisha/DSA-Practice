class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> wrapper = new ArrayList<>();
      helper(wrapper, candidates, candidates.length, target, 0, 0, new ArrayList<>());
      return wrapper;
  }
  
  private void helper(List<List<Integer>> wrapper, int[] arr, int n, int target, int currSum, int i, List<Integer> probableAnsList) {
      if (i >= n) { 
  // Base-case 1
          if (currSum == target)
              wrapper.add(new ArrayList<>(probableAnsList)); 
      /* cloning arraylist (adding new Arraylist) because java references same object here which we are in future going to mutate and if the cloned list is not added then mutated changes will be seen here as well. */
          return;
      }
      if (currSum > target) // base-case 2
          return;
      
  // Including the i-th indexed number
      currSum += arr[i];
      probableAnsList.add(arr[i]);
      helper(wrapper, arr, n, target, currSum, i, probableAnsList);
  
  // excluding the i-th indexed number
      currSum -= arr[i];
      probableAnsList.remove(probableAnsList.size() - 1);
      helper(wrapper, arr, n, target, currSum, i + 1, probableAnsList);
      
      return;
  }
  
}