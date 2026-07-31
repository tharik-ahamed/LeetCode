class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch =moves.toCharArray();
        int n=0;
        int y=0;
        for(char c : ch){
            switch(c){
                case 'L': n--;
                break;
                case 'R' : n++;
                break;
                case'U' : y++;
                break;
                case'D' : y--;
                break;
            }
        }
        return n==0&&y==0;
        
    }
}