class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" "))
      {
        return true;
      }
      
     s=s.toLowerCase().replaceAll("[\\p{Punct}\\s]","");
      String s2="";
        for(int i=s.length()-1;i>=0;i--)
        {
          s2 += s.charAt(i);
        }
      if(s.equals(s2)){
      return true;
      }
      return false;
      }

}