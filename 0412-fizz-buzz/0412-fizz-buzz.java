class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> hi=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                hi.add("FizzBuzz");
            }
            else if(i%3==0){
                hi.add("Fizz");
            }
            else if(i%5==0){
                hi.add("Buzz");
            }
            else{
                hi.add(String.valueOf(i));
            }
            
        }
        return hi;
        
    }
}