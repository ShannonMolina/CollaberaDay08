package regex;

public class Split {
	
	// In String class
	// public String[] split(String regexStr)

	public static void main(String[] args) {
		String source = "There are thirty_three big-apples";
		String[] tokens = source.split("\\s+|-|_"); //whitespace(s) or - or _
		for (String token : tokens) {
			System.out.println(token);
		}
		
		String date = "12-13-2020";
		String[] tokens1 = date.split("-"); 
		int month = Integer.valueOf(tokens1[0]);
		int day = Integer.valueOf(tokens1[1]);
		int year = Integer.valueOf(tokens1[2]);
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
		
	}

}
