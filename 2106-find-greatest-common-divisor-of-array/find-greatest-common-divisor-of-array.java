class Solution {
    public int findGCD(int[] nums) {
        int mn=nums[0];
        int mx=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                mx=nums[i];
            }
            if(nums[i]<mn){
                mn=nums[i];
            }
            
        }
        while(mn!=0){
                int temp=mn;
                mn=mx%mn;
                mx=temp;
            }
        return mx;
        
    }
}