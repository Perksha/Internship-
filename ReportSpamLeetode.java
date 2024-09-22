class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
      Set<String> a1=new HashSet<>();
      for(String s:bannedWords){
         a1.add(s);
      }
      int count=0;
      for(String h:message){
        if(a1.contains(h)){
            count++;
            if(count ==2){
                return true;
            }
        }
      }
     return false;
    }
}
