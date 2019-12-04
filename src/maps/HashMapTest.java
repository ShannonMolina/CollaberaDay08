package maps;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// Use base class (Map) for declaration, and subclass (HashMap) for initialization
		Map<String,String> userCityMapping = new HashMap<>();
		
		// Check if HashMap is empty
		System.out.println("Is userCityMapping empty? " + userCityMapping.isEmpty() );
		
		userCityMapping.put("John", "New York");
		userCityMapping.put("Rajeev", "Bengaluru");
		userCityMapping.put("Steve", "London");
		
		// Print the HashMap
		System.out.println("userCityMapping HashMap: " + userCityMapping);
		
		// Find the size of HashMap
		System.out.println("We have the city information of " + userCityMapping.size() + " users.");
		
		String username = "Steve";
		// Check if a key exists in the HashMap
		if(userCityMapping.containsKey(username)) {
			String city = userCityMapping.get(username);
			System.out.println(username+ " lives in " +city);
		} else {
			System.out.println("City details are not found for " +username);
		}
		
		// Check if a value exists in the HashMap
		if(userCityMapping.containsValue("New York")) {
			System.out.println("There is a user in the userCityMapping who lives in New York.");
		} else {
			System.out.println("There is no user in the userCityMapping who lives in New York.");
		}
		
		// Modify the value assigned to an existing key
		userCityMapping.put(username, "California");
		System.out.println(username + " moved to a new city: " + userCityMapping.get(username));
		System.out.println("New userCityMapping: " +userCityMapping);
		
		// The get() method returns 'null' if the specified key was not found in the HashMap
		System.out.println("Lisa's city: " +userCityMapping.get("Lisa"));

	}

}
