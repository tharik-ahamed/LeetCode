class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;

        }
        int new_arr[]=new int[digits.length+1];
        new_arr[0]=1;
        return new_arr;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] digits={4,3,2,1};
        int ans[] = plusOne(digits);
        System.out.println(ans);
    }
}