package regex;

import java.util.regex.Pattern;

public class MatchOnlyAlpha {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("PM$", "12:00:00PM")); //?

		System.out.println(Pattern.matches("W[a-zA-Z]{7}", "Wabcdefg")); //true
		System.out.println(Pattern.matches("W[a-zA-Z]{7}", "WABCDEFG")); //true
		
		System.out.println(Pattern.matches("W[a-zA-Z]{7}", "WAB4DEF3")); //false (contains digits)
		System.out.println(Pattern.matches("W[a-zA-Z]{7}", "wABCDEFG")); //false (does not start with uppercase W)
	}

}
