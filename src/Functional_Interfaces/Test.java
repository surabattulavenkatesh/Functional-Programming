
package Functional_Interfaces;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;

public class Test {

	public static void main(String[] args) {
		
		
		List<Integer> list = List.of(10,20,4,8,5,3,8);
		
		IntPredicate pred1 = i->i>=100;
	
		OptionalDouble opt =  list.stream().mapToInt(i->i*i).filter(pred1).average();
		if(opt.isPresent()) {
			System.out.println(opt.getAsDouble());
		}else {
			System.out.println("NO values filered to do avg");
		}
		
	}

}
