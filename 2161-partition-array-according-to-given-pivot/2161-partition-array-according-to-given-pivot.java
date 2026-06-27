class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int adf[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){          
            if(nums[i]<pivot){
                adf[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){          
            if(nums[i]==pivot){
                adf[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){          
            if(nums[i]>pivot){
                adf[k]=nums[i];
                k++;
            }
        }
        return adf;
        
    }
}