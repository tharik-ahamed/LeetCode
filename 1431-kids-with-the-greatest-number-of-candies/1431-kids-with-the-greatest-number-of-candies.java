class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> hi=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                hi.add(true);
            }
            else{
                hi.add(false);
            }
        }
        return hi;
        
    }
}