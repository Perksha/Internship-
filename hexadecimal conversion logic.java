class Solution {
    public String toHex(int num) {
        String arr[]={"0","1","2","3","4","5","6","7","8","9","a",
        "b","c","d","e","f"};
        if(num==0) return "0";
        if(num>0&&num<16) return arr[num];
        long n=num;
        if(n<0)n+=(1L<<32);
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.insert(0,arr[(int)(n%16)]);
            n/=16;
        }
       return sb.toString(); 
    }
}
