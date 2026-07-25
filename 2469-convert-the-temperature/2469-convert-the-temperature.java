class Solution {
    public double[] convertTemperature(double celsius) {
        double k=celsius+273.15;
        double f=(celsius*9/5)+32;
        double[] l={k,f};
        return l;

        
    }
}