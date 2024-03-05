package stream_API_3_03_24;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {
		List<Person> personList = Data.getPersons();

		List<Person> personList2 = personList.stream().filter(p -> p.getAge() > 30)
				.collect(Collectors.toList());

//		for (int i = 0; i < personList2.size(); i++) {
//			System.out.println(personList2.get(i));
//		}


	}
}
