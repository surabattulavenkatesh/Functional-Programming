package java8;

import java.util.Optional;

public class mapAndFlat {

	public static void main(String[] args) 
	{
		String[] words = new String[3];
		
		Optional<String> optional = Optional.ofNullable(words[2]);
		
		if(optional.isPresent()) {
			System.out.println(words[2].toString());
		}else {
			System.out.println("Its has a null value");
		}
		
	}
	/*
	 * Sql Interview questions.
	 * 
	 *  3rd highest salary of an employee
	 *  select salary from Employee ORDER salary DESC  Limit 2,1
	 *  CREATE INDEX Emp_name on Employee(Emp);
	 *  select * 
	 */

}
