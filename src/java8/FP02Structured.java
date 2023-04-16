package java8;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(12,10,7,3,35,14,19,976);
		
		int sum = addListStructured(numbers);
		
		System.out.println(sum);
		
			
	}

	private static int addListStructured(List<Integer> numbers) {
		
		int sum = 0;
		for(int n : numbers) {
			sum+=n;
		}
		return sum;
	}


	

}
