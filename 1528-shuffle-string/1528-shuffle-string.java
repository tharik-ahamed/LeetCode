class Solution {
    public String restoreString(String s, int[] indices) {
        char a[]=new char[s.length()];
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            a[indices[i]]=s.charAt(i);
        }
        sb.append(a);
        return sb.toString();   
    }
}