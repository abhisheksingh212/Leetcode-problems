class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" "))
      {
        return true;
      }
      s=s.toLowerCase();
      String s1=s.replaceAll("[\\p{Punct}\\s]","");
      String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
          s2 += s1.charAt(i);
        }
      if(s1.equals(s2)){
      return true;
      }
      return false;
      }

}