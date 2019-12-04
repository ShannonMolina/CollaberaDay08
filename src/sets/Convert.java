package sets;

import java.util.*;

public class Convert {

	public static void main(String[] args) {
		// Create an empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set); // unordered list
		// Creating an Array
		String[] new_array = new String[h_set.size()];
		h_set.toArray(new_array); // convert to array
		
		// Displaying Array elements
		System.out.println("Array elements: ");
		for(String element : new_array) {
			System.out.println(element);
		}
		
		// Create a TreeSet of HashSet elements
		Set<String> tree_set = new TreeSet<String>(h_set);
		
		// Display TreeSet elements
		System.out.println("TreeSet elements: ");
		for(String element : tree_set) {
			System.out.println(element); // ordered list (alphabetic order)
		}
		
		// Create a List from HashSet elements
		List<String> list = new ArrayList<String>(h_set);
		
		// Display ArrayList
		System.out.println("ArrayList contains: " +list);
	}

}
