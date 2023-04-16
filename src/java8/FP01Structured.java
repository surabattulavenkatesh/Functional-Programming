package java8;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(12,10,7,3,35,14,19);
		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
		
		
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) 
	{
		//How to loop the numbers ?
		for (int n : numbers) 
		{
			System.out.println(n);
		}
		}
		
		private static void printEvenNumbersInListStructured(List<Integer> numbers) 
		{
			//How to loop the numbers ?
			for (int n : numbers) {
				
				if(n%2==0) {
					System.out.println(n);
				}
				
			}
	}

}
