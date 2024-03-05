package stream_API_3_03_24;
import java.util.*;

import java.util.ArrayList;

public class Data {
	private  static  List<Person> persons = new ArrayList<>();

	static {
		Person person1 = new Person("cccc","mm",23);
		Person person2 = new Person("aaaaaa","ffff",35);
		Person person3 = new Person("tt","mm",40);
		Person person4 = new Person("aaa","ffff",19);
		Person person5 = new Person("cccc","bbbbbbbb",32);

		Collections.addAll(persons, person1,person2,person3,person4,person5);

	}

	public  static List<Person> getPersons(){
		return persons;
	}
}
