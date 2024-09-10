class Solution {
    public int romanToInt(String s) {
        int ans=0;
        HashMap<Character,Integer> hmp=new HashMap<>();
        hmp.put('I',1);
        hmp.put('V',5);
        hmp.put('X',10);
        hmp.put('L',50);
        hmp.put('C',100);
        hmp.put('D',500);
        hmp.put('M',1000);
        int preval=0;
        for(int i=s.length()-1;i>=0;i--){
            int cur=hmp.get(s.charAt(i));
            if(preval>cur){
                ans-=cur;
            }else{
               ans+= cur;
            }
            preval=cur;
        }
        return ans;
    }
}
