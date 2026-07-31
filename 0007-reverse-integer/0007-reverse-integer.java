class Solution {
    public static int reverse(int x) {
        long finald=0;
        while(x!=0){
            int lastd=x%10;
            finald+=lastd;
            finald=finald*10;
            x=x/10;
        }
        finald=finald/10;
         if(finald > Integer.MAX_VALUE || finald<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finald);
        }
        return (int)finald;
    }
}
    
