package Functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Strings_flatMap {

	public static void main(String[] args) {

		
		List<String> courses = List.of("Spring", "SpringBoot","Microservices","Sql","Jpa");
		
		//System.out.println(courses.stream().collect(Collectors.joining(",")));
		
		System.out.println(courses.stream()
				.map(i->i.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
	}

}
