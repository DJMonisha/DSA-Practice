class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int count=0;
        int p=0;
        while(i<arr.length){
            if(count+1 == arr[i]){
                i++;
                count ++;
                continue;
            }
            count++;
            p++;
            if(p==k){
                return count;
            }
        }
        return count+(k-p);
    }
}