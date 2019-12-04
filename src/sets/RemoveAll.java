package sets;

import java.util.HashSet;

public class RemoveAll {

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
		System.out.println("Original Hash Set: " + h_set);
		
		// Create an empty hash set
		HashSet<String> h_set2 = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set2.add("Red");
		h_set2.add("Black");
		h_set2.add("Pink");
		h_set2.add("Yellow");
		System.out.println("New Hash Set: " + h_set2);
		
		//Remove all elements that match the collection passed in
		h_set.removeAll(h_set2);
		System.out.println("Original Hash Set after remove all: " + h_set);
		
		// clear() method removes all the elements from a hash set
		// and the set becomes empty
		h_set.clear();
		System.out.println("Hash Set after removing all the elements: " +h_set);

	}

}
