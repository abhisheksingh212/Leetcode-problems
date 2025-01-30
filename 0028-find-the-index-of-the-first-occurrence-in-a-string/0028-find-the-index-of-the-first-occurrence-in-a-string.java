class Solution {
    public int strStr(String haystack, String needle) 
    { int startindex=0;
       if(haystack.contains(needle)){
      startindex=haystack.indexOf(needle);
       
       return startindex;
    }
       else 
       return -1;
    }
}