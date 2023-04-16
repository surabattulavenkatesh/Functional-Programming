package jdk11;

import java.util.List;
import java.util.stream.Collectors;

public class Type_Inferences_Runner {

	public static void main(String[] args) {

		List<String> names1 = List.of("venkat","ravi");
		List<String> names2 = List.of("Killer","kiran");
		
		//var abc = null; can't define for null;
		
		//Java Type inferences the type at compile time.
		var names = List.of(names1,names2);
		List<String> collect = names.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		System.out.println(collect);
		//names.stream().forEach(System.out::println);
		names.forEach(System.out::println);
		
		
	}

}
