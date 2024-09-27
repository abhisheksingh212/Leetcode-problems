class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
   String w1=concat(word1);
   String w2=concat(word2);
   if(w1.equals(w2))
   return true;
   else
   return false;

        
    }
    public String concat(String[] s)
    { String s1="";
        for(int i=0;i<s.length;i++)
        {
            s1+=s[i];
        }
        return s1;
    }
}