class Solution {
    public double myPow(double x, int n) {
        if(x==1) return 1.0;
        if(x==-1) return (n%2==0)?1.0:-1.0;
        if(x==0) return 0.0;
        if(n==Integer.MIN_VALUE) return 0.0;
        double r=1;
        long n1=Math.abs((long)n);
        if(n<0){
            x=1/x;
        }
        while(n1>0){
            if((n1&1)==1){
                r*=x;
            }
            x*=x;
            n1>>=1;
        }
        return r;
    }
}
