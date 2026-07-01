class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int sum=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(i>=k){
                if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' ||s.charAt(i-k)=='o' ||s.charAt(i-k)=='u')
                sum--;
            }
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u')
            sum++;
            max=Math.max(sum,max);
        }
        return max;
        
    }
}