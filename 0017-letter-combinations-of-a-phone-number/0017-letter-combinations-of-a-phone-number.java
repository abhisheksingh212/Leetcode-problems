class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
        return new ArrayList<>();

        List<String> result=new ArrayList<>();
        helper(digits,0,new StringBuilder(),result);
        return result;
        
    }
    private void helper(String digits,int index,StringBuilder current,List<String> result)
    { 
        if(index==digits.length())
        {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = getLetters(digit);

        for(char letter:letters.toCharArray())
        {
            current.append(letter);
            helper(digits,index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }

    }
    private String getLetters(char digit) {
        switch (digit) {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
}