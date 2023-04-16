package java8;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8_Testing {

	public static void main(String[] args) {

		
		List<Integer> numbers = List.of(1,4,5,6,8,1,2,3);
		
		//numbers.stream().distinct().forEach(System.out::print);
		
		Supplier<Integer> rs = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		Predicate<Integer> p = x -> x%3==0;
				
		Consumer<Integer> c = i->System.out.println(i);
		numbers.forEach(c);
		
		System.out.println(rs);
		
		
	}

}
