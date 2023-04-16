package Functional_Interfaces;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces 
{
	
	/*
	 * boolean is Even(int x){
	 * 
	 * return x%2==0;
	 * }
	 * 
	 * int squared(int x){
	 * 
	 * retunr x*x;
	 * }
	 */

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,9,42,3,87,42,9,16);
		
		// i->i%2==0;, 
		//Predicate is a FI which return boolean value.boolean test
		Predicate<Integer> evenPredicate = i->i%2==0;
		
		
		//Function is a FI which takes one generic and return output, Map Takes an input and customizes it
		//Foreach is a consumer..it takes the input but doesn't return anything.(just print ro console or save in db).
		Function<Integer,Integer> mapFunction = i->i*i;
			
		//supplier..<no input> return some thing
		Supplier<String> sup = ()->"4";
		System.out.println(sup.get());
		
		Consumer<String> cons = (num)->System.out.println(num);;
		cons.accept("Consumer");
		
		
		Supplier<String> s = ()->"Hello";
		System.out.println(s.get());
		
		Supplier<Integer> sup1 = new Supplier<Integer>() 
		{

			@Override
			public Integer get() 
			{

				Random r = new Random();
				return r.nextInt(100);
			}
			
			
		};
		//System.out.println("random : "+sup1.get());
		
		UnaryOperator<Integer> uoperator = i->(2*i);
		System.out.println("Unary operator : "+uoperator.apply(9));
		
		
		BinaryOperator<Integer> sumBinaryOperator = (a,b)->(a+b);//Takes two input and return
		//one o/p.
		
		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {

				return t+u;
			}
			
			
		};
		
		int sum = numbers.stream().reduce(0,sumBinaryOperator);
		System.out.println(sum);
		numbers.stream().filter(evenPredicate).map(mapFunction).forEach(System.out::println);
	
	}

}
