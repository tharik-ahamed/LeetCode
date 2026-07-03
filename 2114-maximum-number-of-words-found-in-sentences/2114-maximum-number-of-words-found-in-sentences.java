class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence:sentences){
            int count=1;
            for(char ch:sentence.toCharArray()){
                if(ch==' '){
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
        
    }
}