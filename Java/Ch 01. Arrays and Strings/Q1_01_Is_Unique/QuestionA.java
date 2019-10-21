package Q1_01_Is_Unique;

import java.util.HashSet;

public class QuestionA {
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean isUnique(String str) {
	    HashSet<Character> unique = new HashSet<Character>();
	    
	    for (char c: str.toCharArray()) {
	        if (unique.contains(c)) {
	            return false;
	        }
	        unique.add(c);
	    }
	    
	    return true;
	}
	
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
		System.out.println("Wasif's unique solution: -->>>");
		for (String word: words) {
		    System.out.println(word + ": " + isUnique(word));
		}
	}

}
