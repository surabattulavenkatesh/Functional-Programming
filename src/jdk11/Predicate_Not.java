package jdk11;

import java.util.List;
import java.util.function.Predicate;

public class Predicate_Not {

	public static void main(String[] args) {

		//if u have a method reference and you want to use the 
		//negation of that then we have to go with the preidcateNot
		List<Integer> numbers = List.of(9,4,7,3,6,2);
		Predicate<Integer> evenpred = i->i%2==0;
		//numbers.stream().filter(evenpred).forEach(System.out::println);
		//numbers.stream().filter(Predicate.not(Predicate_Not::isEven)).forEach(System.out::println);
		numbers.stream().filter(Predicate.not(evenpred)).forEach(System.out::println);
		
		
	}
	public static boolean isEven(Integer num) {
		return num%2==0;
	}

}
