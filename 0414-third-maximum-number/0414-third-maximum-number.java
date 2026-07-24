class Solution {
    public int thirdMax(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        long max=Long.MIN_VALUE;
        long a=Long.MIN_VALUE;
        long b=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]>a){
                a=nums[i];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max && nums[i]!=a && nums[i]>b){
                b=nums[i];
            }
        }
        if(b==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)b;

        
    }
}