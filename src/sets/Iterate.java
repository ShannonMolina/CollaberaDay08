package sets;

import java.util.*;

public class Iterate {

	public static void main(String[] args) {
		// Create an empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Red"); // ignores duplicate
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		
		h_set.remove("Pink");
		//set Iterator
		Iterator<String> p = h_set.iterator();
		//Iterate the hash set
		while (p.hasNext()) {
			System.out.println(p.next());
		}

	}

}
