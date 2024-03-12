class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {      
        // sorting when the numbers are from 1 to n 
		// we are checking i+1 as range is from 1 to n
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != i+1 && nums[i] != nums[nums[i] - 1])
            {
                //swap
                int temp =  nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
                // to check the current ith pos'n again so that the correct value is here
                i--;
            }           
        }
        //the values which are not in their correct posn should be checked here and inserted into the list 
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length; i++)
        {
            if(nums[i]!=i+1)
            {
                list.add(i+1);
            }
        }       
        return list; 
    }
}
// the following dry run can explain the sorting happening 
/*
[4,3,2,7,8,2,3,1]
[7,3,2,4,8,2,3,1]
[3,3,2,4,8,2,7,1]
[2,3,3,4,8,2,7,1]
[3,2,3,4,8,2,7,1]
[3,2,3,4,1,2,7,8]
[1,2,3,4,3,2,7,8]
*/