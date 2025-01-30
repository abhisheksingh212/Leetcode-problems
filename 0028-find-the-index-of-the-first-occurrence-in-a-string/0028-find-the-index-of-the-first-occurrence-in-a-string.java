class Solution {
    public int strStr(String haystack, String needle) 
    { int startindex=0;
       if(haystack.contains(needle)){
      startindex=haystack.indexOf(needle);
       String s=haystack.substring(startindex);
       return startindex;
    }
       else 
       return -1;
    }
}