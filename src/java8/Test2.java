package java8;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) 
	{
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Venkat",20,3000));
		list.add(new Employee("kishore",19,2500));
		list.add(new Employee("manam",17,3000));
		list.add(new Employee("sky",22,3000));
		
		list.stream().filter(i->i.getAge()>19).map(Employee::getName).forEach(System.out::println);
	}

}
