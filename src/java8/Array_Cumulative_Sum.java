package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array_Cumulative_Sum {

	public static void main(String[] args) {

		
		List<Integer> numbers = List.of(10,20,30,40,50);
		
		int finalSum = numbers.stream().reduce(0, (a,b)->(a+b));
		System.out.println("ToTal Sum : "+finalSum);
		
		List<Integer> transList = numbers.stream().map(x->x+finalSum).collect(Collectors.toList());
		System.out.println(transList);
		
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

}
