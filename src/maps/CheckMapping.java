package maps;

import java.util.HashMap;

public class CheckMapping {

	public static void main(String[] args) {
		HashMap<String, Integer> hash_map = new HashMap<String,Integer>();
		
		hash_map.put("Red", 1);
		hash_map.put("Green", 2);
		hash_map.put("Black", 3);
		hash_map.put("White", 4);
		hash_map.put("Blue", 5);
		// print the map
		System.out.println("The original map: " + hash_map);
		
		System.out.println("1. Does key 'Green' exist?");
		if (hash_map.containsKey("Green")) {
			//key exists
			System.out.println("yes! - " + hash_map.get("Green"));
		} else {
			//key does not exist
			System.out.println("no!");
		}
		
		System.out.println("1. Does key 'Orange' exist?");
		if (hash_map.containsKey("Orange")) {
			//key exists
			System.out.println("yes! - " + hash_map.get("Orange"));
		} else {
			//key does not exist
			System.out.println("no!");
		}

	}

}
