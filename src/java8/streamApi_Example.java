package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Stream means a series of objects in java 8
 * 
 * two types : 1) sequential executes one by one
 * 
 * 			2) parallel streams excetues simultaniously
 * 
 * 
 * 1)Terminal operations : only one and at end.
 * foreach
 * terminal
 *
 * 
 * 2)intermediate operstions : return stream it self(several operations)
 * Map
 * filter
 * sorted
 */
public class streamApi_Example {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,8,3,2,5);
		
		
		//multiply by two
		numbers.stream().map(x -> x*2).forEach(System.out::println);
		
		
		//get numbers greater than 2
		numbers.stream().filter(x -> x>2).forEach(System.out::println);
		
		//sort the list in ascending order
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		//min and max
		int min = numbers.stream().min((x,y)->x-y).get();
		System.out.println(min);
		
		int max = numbers.stream().max((x,y)->x-y).get();
		System.out.println(max);
		
		//count numbers
		long count = numbers.stream().count();
		System.out.println(count);
	}

}
