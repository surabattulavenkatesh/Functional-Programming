package Functional_Interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;

public class FP03FunctionalInterfaces2 
{
	
	
	public static void main(String[] args) 
	{

		List<Integer> numbers = List.of(12,9,42,3,87,42,9,16);
		
		//BiPredicate
		BiPredicate<Integer, String> bipred = (num,Str)->
		{
			return num<10 && Str.length()>4;
			
		};
		System.out.println(bipred.test(6, "venky"));
		
		
		//Bifunction
		BiFunction<Integer, String, String> bifunction = (num,str)->
		{
			return num+str;
					
		};
		System.out.println(bifunction.apply(6, "venkay"));
				
		//BiConsumer
		BiConsumer<Integer, String> biconsumer = (num,str)->
		{
			System.out.println(num);
					
		};
		biconsumer.accept(10, "hii");
		
		//Primitive spectific functional Interfaces
		IntBinaryOperator intbin = (a,b)->a+b;
		
		System.out.println(intbin.applyAsInt(3, 9));
	
	}

}
