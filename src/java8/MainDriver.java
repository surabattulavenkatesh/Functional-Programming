package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainDriver {

	public static void main(String[] args) {

		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("venkat", 21, 10000));
		employees.add(new Employee("ramesh", 22, 20000));
		employees.add(new Employee("suresh", 26, 30000));
		employees.add(new Employee("balu", 26, 40000));
		
		Comparator<Employee> c = Comparator.comparing(Employee::getSalary);
		employees.stream().
		sorted(c).forEach(System.out::println);
		Comparator<Employee> com = (e1,e2)->e1.getName().compareTo(e2.getName());
		Stream<Employee> sorted = employees.stream().sorted(com);
		sorted.forEach(e -> System.out.println("Sorted Name:" + e.getName()+" Age: "+e.getAge()));
			
		//System.out.println("Updated salary : ");
		//System.out.println(updated);
		
		List<Employee> updated = employees.stream().map(
				
				e->{
					if(e.getAge()>24) 
					{
						e.setSalary(e.getSalary()*1.10);
					}
					return e;
				}).collect(Collectors.toList());
	}

}