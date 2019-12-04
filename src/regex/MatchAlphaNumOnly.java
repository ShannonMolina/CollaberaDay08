package regex;

import java.util.regex.Pattern;

public class MatchAlphaNumOnly {

	public static void main(String[] args) {

		// \\d -> digits
		// [a-z] -> lowercase letters
		// [A-Z] -> uppercase letters
		// {num} -> number of characters
		
		System.out.println(Pattern.matches("[a-zA-Z\\d]{6}", "123456")); //true
		System.out.println(Pattern.matches("[a-zA-Z\\d]{6}", "abcdef")); //true
		System.out.println(Pattern.matches("[a-zA-Z\\d]{6}", "1b3d5f")); //true
		System.out.println(Pattern.matches("[a-zA-Z\\d]{6}", "A2b4C6")); //true
		
		System.out.println(Pattern.matches("[a-zA-Z\\d]{6}", "1234567")); //false (too many)
		System.out.println(Pattern.matches("[a-zA-Z\\d]{6}", "12345!")); //false (! is not letter or digit)
		
		
	}

}
