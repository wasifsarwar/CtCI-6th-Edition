package Q1_04_Palindrome_Permutation;

import java.util.*;

public class LeonaSolution {
    public static boolean isPermutationOfPalindrome(String str) {
        str = str.replace(" ", "");
        
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        
        // put character count in a hashmap
        for (char c: str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c,1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }
        
        // check strings for even length
        if (str.length() % 2 == 0) {
            
            for (char c: map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    return false;
                }
            }
        }
        
        // check strings for odd length
        
          else { 
            int count = 0;
            for (char c: map.keySet()) {
                if (map.get(c) %2 != 0) {
                    count++;
                    if (count > 1) {
                        return false;
                    }
                }
                
            }
        }
        
        
        return true;
    }
}
