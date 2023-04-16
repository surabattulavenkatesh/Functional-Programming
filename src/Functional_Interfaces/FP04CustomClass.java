package Functional_Interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP04CustomClass {

	public static void main(String[] args) 
	{
		List<Course> courses = List.of
				(new Course("Spring","Framework",98,20000),
				new Course("SpringBoot","Framework",97,18000),
				new Course("API","Micorservices",92,14000),
				new Course("MicroServices","Micorservices",90,20000),
				new Course("Full Stack","Full stack",99,17000),
				new Course("Azure","Cloud",93,19000),
				new Course("Aws","Cloud",96,20000));
		
		//allMatch, noneMatch, anyMatch.
		Predicate<Course> pred1 = course->course.getReviewScrorer()>95;
		System.out.println("All Match: "+ courses.stream().allMatch(pred1));
		
		Predicate<Course> pred2 = course->course.getReviewScrorer()>92;
		System.out.println("None Match : "+ courses.stream().noneMatch(pred2));
		
		Predicate<Course> pred3 = course->course.getReviewScrorer()<90;
		System.out.println("NONE MATCH : "+courses.stream().noneMatch(pred3));
		
		Predicate<Course> pred4 = course->course.getReviewScrorer()>90;
		System.out.println(courses.stream().anyMatch(pred4));
		
		Comparator<Course> comparingByNoOfStudentsIncreasing 
			= Comparator.comparing(Course::getName);
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
		
		Comparator<Course> comparingByNoOfStudentsDecreasing 
			= Comparator.comparing(Course::getName).reversed();
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
		
		//Awesome
		Comparator<Course> comparingTest 
			= Comparator.comparing(Course::getNoOfStudent).thenComparing(Course::getName);
		System.out.println("Awesome :"+ courses.stream().sorted(comparingTest).collect(Collectors.toList()));
		
		
		Comparator<Course> comparingMarksAndHeadCount
		= Comparator.comparing(Course::getReviewScrorer).thenComparing(Course::getNoOfStudent);
		System.out.println(courses.stream().sorted(comparingMarksAndHeadCount).collect(Collectors.toList()));
	
		//Playing with limits upto mentioned limit.
		Comparator<Course> comparinglimits 
		= Comparator.comparing(Course::getNoOfStudent).thenComparing(Course::getName);
		System.out.println(courses.stream().sorted(comparingTest).limit(3).collect(Collectors.toList()));
	
		//skip, skips first 3 courses
		Comparator<Course> comparingskip
		= Comparator.comparing(Course::getNoOfStudent).thenComparing(Course::getName);
		System.out.println(courses.stream().sorted(comparingskip).skip(3).collect(Collectors.toList()));
		
		//Skip and limit
		Comparator<Course> comparingSkipAndLimit
		= Comparator.comparing(Course::getNoOfStudent).thenComparing(Course::getName);
		System.out.println(courses.stream().sorted(comparingSkipAndLimit).skip(3).limit(1).collect(Collectors.toList()));
		
		//takeWhile (skips all the elements after that condition breaks)
		
		System.out.println(courses);
		System.out.println(courses.stream().takeWhile(i->i.getReviewScrorer()>=95).collect(Collectors.toList()));
		
		
		//dropWhile
		System.out.println(courses.stream().dropWhile(i->i.getReviewScrorer()>=95).collect(Collectors.toList()));
		
		
		
		Comparator<Course> comparingmax 
		= Comparator.comparing(Course::getNoOfStudent).thenComparing(Course::getName);
	System.out.println(courses.stream().max(comparingmax));
		
		
	Comparator<Course> comparingmin 
	= Comparator.comparing(Course::getNoOfStudent).thenComparing(Course::getName);
	System.out.println(courses.stream().min(comparingmin));
	
		
		//findfirst
	System.out.println(courses.stream().filter(pred1).findFirst());
	
				
				//findAny
	System.out.println(courses.stream().filter(pred1).findAny());
	
	//MaptoInt(sum)
	
	System.out.println(courses.stream().filter(pred2).mapToInt(Course::getNoOfStudent).sum());
	
	//avg,count, max
	System.out.println(courses.stream().filter(pred2).mapToInt(Course::getNoOfStudent).average());
	System.out.println(courses.stream().filter(pred2).mapToInt(Course::getNoOfStudent).count());
	System.out.println(courses.stream().filter(pred2).mapToInt(Course::getNoOfStudent).max());
	
	//Grouping
	System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));
	//{Micorservices=Optional[API : 92 : 14000], Full stack=Optional[Full Stack : 99 : 17000], Cloud=Optional[Aws : 96 : 20000], Framework=Optional[Spring : 98 : 20000]}

	//counting
	System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
	
	//maxBy
	
	System.out.println(courses.stream().collect(Collectors.groupingBy
			(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScrorer)))));
	
	//Mapping By name
	System.out.println(courses.stream().collect(Collectors.groupingBy
			(Course::getCategory,Collectors.mapping(Course::getName, Collectors.toList()))));
	
	
	System.out.println(IntStream.range(1, 10).sum());
	
	
	
	}
	
	

}
