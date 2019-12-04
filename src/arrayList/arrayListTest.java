package arrayList;

import java.util.*;

public class arrayListTest {

	public static void main(String[] args) {
		List<Person> friends;
		Person person;
		
		friends = new ArrayList<Person>();
		
		person = new Person("jane", 10, 'F');
		friends.add(person);
		person = new Person("jack", 6, 'M');
		friends.add(person);
		
		Person p = friends.get(1);
		
		System.out.println(p);

	}

}
