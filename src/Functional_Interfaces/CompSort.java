package Functional_Interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompSort {

	public static void main(String[] args) {
		
		List<Course> courses = Arrays.asList(new Course("Spring","Framework",98,20000),
				new Course("SpringBoot","Framework",97,18000),
				new Course("API","Micorservices",92,14000),
				new Course("MicroServices","Micorservices",90,20000),
				new Course("Full Stack","Full stack",99,17000),
				new Course("Azure","Cloud",93,19000),
				new Course("Aws","Cloud",96,20000));
		
		Collections.sort(courses, Comparator.comparing(o1->o1.getName().length()));
		System.out.println(courses);
//		List<Course1> list = List.of(new Course1("Active"),
//				new Course1("Suspend"),new Course1("Active"),
//				new Course1("Delete"),new Course1("Suspend"));
//
//		
//		Comparator<Course1> comp = Comparator.comparing(Course1::getName);
//		list.stream().sorted(comp).limit(1).forEach(System.out::println);
	}

}
