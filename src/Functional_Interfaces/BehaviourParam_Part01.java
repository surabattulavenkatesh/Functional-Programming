package Functional_Interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class BehaviourParam_Part01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//filterAndPrint(numbers, x -> x%2==0);

		//filterAndPrint(numbers, x -> x%2!=0);
		
		//filterAndPrint(numbers, x -> x%3==0);
		
		Function<Integer, Integer> mappingFunction = x -> x*x;
		
		Function<Integer, String> mappingFunction2 = x -> x+" ";
	
		mapAndCreateNewList(numbers, mappingFunction2);
		
		Consumer<Integer> con = i->System.out.println(i);
	
		con.accept(6);
		
	}

//	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) 
//	{
//		numbers.stream().filter(predicate).forEach(System.out::println);
//		
//	}

	private static void  mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, String> mappingFunction2) 
	{
		numbers.stream().map(i->i*i).forEach(i->System.out.println(i));
		
	}

	
}