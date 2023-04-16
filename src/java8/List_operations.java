package java8;

import java.util.Arrays;
import java.util.List;

public class List_operations {

	public static void main(String[] args) {

		
		List <Integer> numbers = Arrays.asList(10,10,12,30,40,12,30,40,50,60);
		
		
		//numbers.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
	
		numbers.stream().distinct().forEach(System.out::println);
	}

}
