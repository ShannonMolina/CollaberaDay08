package arrayList;

import java.util.*;

public class Iterate {

	public static void main(String[] args) {
		// Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		
		// Person p = new Person("Jack", 22, 'M');
		// list_Strings.add(p); // error, can't add person to ArrayList of Strings
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		//Print the list using for each loop
		for (String element : list_Strings) {
			System.out.println(element);
		}
		
		List<Person> list2 = new ArrayList<Person>();
		Person p = new Person("Jack", 22, 'M');
		list2.add(p);
		p = new Person("Jane", 6, 'F');
		list2.add(p);
		
		for (Person element : list2) {
			System.out.println(element);
		}

	}

}
