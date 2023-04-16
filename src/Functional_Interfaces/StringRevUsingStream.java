package Functional_Interfaces;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRevUsingStream {

	public static void main(String[] args) {

		String str = "Hello";
		
		String str1 = Stream.of(str).map(i-> new StringBuilder(i).reverse().toString())
		.collect(Collectors.joining());
		System.out.println(str1);
		
		Stream.of("vasan bijapur").forEach(i->{
			if(i.contains("bija")) {
				System.out.println("hii");
			}else {
				System.out.println("bye");
			}
		});
		System.out.println(Stream.of(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())));
		
		boolean equalsIgnoreCase = Stream.of("AVA").map(i->new StringBuilder(i).reverse().toString()).collect(Collectors.joining()).equalsIgnoreCase("AVA");
		System.out.println(equalsIgnoreCase);
		
	}
}
