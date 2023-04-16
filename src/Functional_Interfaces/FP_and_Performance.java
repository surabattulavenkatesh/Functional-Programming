package Functional_Interfaces;

import java.util.List;

public class FP_and_Performance {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring","SpringBoot","Microservices");
		
		System.out.println(courses.stream().peek(System.out::println)
				.filter(i->i.length()>7).
				map(String::toUpperCase).peek(System.out::println).findFirst());
	}

}
