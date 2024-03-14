class Solution {
  public int findPairs(int[] nums, int k) {
      int n =nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i =0;i<n;i++){
        if(map.containsKey(nums[i]))
        map.put(nums[i],map.get(nums[i])+1);
        else
        map.put(nums[i],1);
    }
      int count =0;

    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      int val = entry.getValue();
      int key = entry.getKey();

      if(k==0){
        if(val>=2)
          count++;
      }

      else if(map.containsKey(key+k))
      count++;
    }  
      return count;
  }
}