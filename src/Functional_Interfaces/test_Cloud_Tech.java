package Functional_Interfaces;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;

public class test_Cloud_Tech {

	public static void main(String[] args) {

		
		List<Integer> numbers = List.of(2,3,4,5,6,7,9);
		
		IntPredicate pred = i->i>=100;
		
		OptionalDouble opt = numbers.stream().mapToInt(i->i*i).filter(pred).average();
		
		if(opt.isPresent()) {
			System.out.println(opt.getAsDouble());
		}else
			System.out.println("Nu such value found for requirement");
		
		
	}

}
