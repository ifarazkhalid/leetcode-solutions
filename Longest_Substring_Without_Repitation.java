import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int j = 0;
        int lenSubstr = 0;
        HashSet<Character> subset = new HashSet<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // System.out.println(c);
            
            if (!subset.contains(c)) 
            {
                subset.add(c);
                lenSubstr = Math.max(lenSubstr, subset.size());
            } 
            else 
            {
                while (j < i) 
                {
 
                    if (s.charAt(j) == c) 
                    {
                        j++;
                        System.out.println("hi");
                        break;
                    } 
                    else 
                    {
                        subset.remove(s.charAt(j));
                        System.out.println("hello");
                        System.out.println(s.charAt(j));
                        j++;
                    }
                }
 
                subset.add(c);
            }
            
            System.out.println(subset);
        }
        System.out.println("Original String = " + s);
        System.out.println("Length of Longest substring = " + lenSubstr);
        
        return lenSubstr;
        
    }
    
}