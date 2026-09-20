class Solution {
public:
    string convert(string s, int numRows) {
        if(s.length()==1 || numRows==1 || numRows>s.length()){
            return s;
        }
        int r=0;
        int d=1;
        vector<string>hi(numRows);{
            for(char a: s){
                hi[r]+=a;
                if(r==0){
                    d=1;
                }
                else if(r==numRows-1){
                    d=-1;
                }
                r+=d;
            }
        }
        string p="";
        for(string g:hi){
            p+=g;
        }
        return p;
    }
};