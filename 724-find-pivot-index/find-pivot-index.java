class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        int leftsum=0;
        for(int j=0;j<nums.length;j++){
            if(leftsum==totalsum-leftsum-nums[j]){
                return j;
            }
            leftsum+=nums[j];
        }
        return -1;
        
    }
}