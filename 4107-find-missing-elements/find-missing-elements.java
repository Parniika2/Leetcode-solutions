class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int num=min;num<=max;num++){
            boolean found=false;
            for (int i=0;i<nums.length;i++){
                if(nums[i]==num){
                    found=true;
                    break;
                }
                
            }
            if(!found){
                    arr.add(num);
                }
        
        }
        return arr;
        
    }
}