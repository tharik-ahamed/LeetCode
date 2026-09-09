class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hi=new HashSet<>();
        for(int d : nums){
            hi.add(d);
        }
        if(hi.size()!=nums.length){
            return true;
        }
        return false;
        
    }
}