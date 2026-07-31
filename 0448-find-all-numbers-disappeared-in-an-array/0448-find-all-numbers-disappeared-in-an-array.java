class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>cd = new ArrayList<>();
        Set<Integer>ab = new HashSet<>();
        for (int n : nums){
            ab.add(n);
        }
        for (int i = 1; i <= nums.length; i++){
            if (! ab.contains(i)){
                cd.add(i);
            }
        }
        return cd;
    }
}