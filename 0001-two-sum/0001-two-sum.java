class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0;
        int r=0;
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    a[0]=i;
                    a[1]=j;
                }
                
            }
        }
        /*for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }*/
        return a;
    }
}