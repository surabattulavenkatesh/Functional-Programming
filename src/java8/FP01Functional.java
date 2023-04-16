package java8;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(12,10,7,3,35,14,19);
		//printAllNumbersInListStructured(numbers);
		//printEvenNumbersInListStructured(numbers);
		printSquaresOfEvenNumbersInListStructured(numbers);
		
		
	}

//	private static void print(int number) {
//		
//		System.out.println(number);
//		
//	}
//	private static boolean isEven(int number) {
//		
//		return number%2==0;
//	}
	private static void printAllNumbersInListStructured(List<Integer> numbers) 
	{
		
		//What to do ?
		
		numbers.stream().forEach(System.out::println);//Method Reference
		
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) 
	{
		
		//What to do ?
		
		numbers.stream().filter(i->i%2==0)//lambda Expression.
		.forEach(System.out::println);//Method Reference
		
	}
	private static void printSquaresOfEvenNumbersInListStructured(List<Integer> numbers) 
	{
		
		//What to do ?
		
		numbers.stream().filter(i -> i%2==0).map(n -> n+n).forEach(System.out::println);//Method Reference
		
	}

}
