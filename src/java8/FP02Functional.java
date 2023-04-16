package java8  ;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7);
		
		addListFunctional(numbers);
		
			
	}
	private static int sum(int aggregate, int nextnumber)
	{
		System.out.println(aggregate + " " +nextnumber);
		return aggregate + nextnumber;
	}

	private static void addListFunctional(List<Integer> numbers) {
		
		//combine them into one result=> one result
		
		//return numbers.stream().reduce(0, FP02Functional::sum);
		
		//return numbers.stream().reduce(0, (x,y)-> x + y);
		
		//return numbers.stream().reduce(0, Integer::sum);	
		
		//return numbers.stream().reduce(0, (x,y)-> x);
		//return numbers.stream().reduce(0, (x,y)-> y);
		
		//return numbers.stream().reduce(0, (x,y)-> x>y?x:y);
		
		//return numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y?x:y);
		
		//return numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y?y:x);
		
		//return numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y?y:x);
		
		//return numbers.stream().map(x->x*x).reduce(0, (x,y)->x+y);
		
//		return numbers.stream().sorted().forEach(System.out::println);
//		
//		return numbers.stream().distinct().forEach(System.out::println);
//		
//		courses.stream().sorted().forEach(System.out::println);
//		
//		return courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
//		return courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		
//		Comparator.comparing(str -> str.length());
//		
//		return courses.stream().sorted(Comparator.reverseOrder()).sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

		//return numbers.stream().map(num -> num*num).collect(Collectors.toList());	
	}


	

}
