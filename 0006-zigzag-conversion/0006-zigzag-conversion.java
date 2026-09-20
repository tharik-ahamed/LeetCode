class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==1 || numRows==1 || numRows>s.length()){
            return s;
        }
        int r=0;
        int d=1;
        String arr[]=new String[numRows];
        for(int i=0;i<arr.length;i++){
            arr[i]="";
        }
        String t="";
        for(char a:s.toCharArray()){
            arr[r]+=a;
            if(r==0){
                d=1;
            }
            else if(r==numRows-1){
                d=-1;
            }
            r+=d;

        }
        for(String p:arr){
            t+=p;
        }
        return t;

    }
}