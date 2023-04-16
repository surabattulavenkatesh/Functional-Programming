package Functional_Interfaces;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Operations {

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
		
		/*all match-->all should satisfy this condition 
		 * 
		none Match-->none of the course should meet this criteria
		
		Anymatcg
		*/
		System.out.println(courses.stream().
				allMatch(course->course.getReviewScrorer()>90));
		
		System.out.println(courses.stream().
				noneMatch(course->course.getReviewScrorer()<90));
		
		System.out.println(courses.stream().
			anyMatch(course->course.getReviewScrorer()<=90));
		/*
		 * Sorting
		 */
		
		Comparator<Course> comparingByNoOfStudentsIncreasing = 
				Comparator.comparingInt(Course::getNoOfStudent);
		Comparator<Course> comparingByNoOfStudentsDecresing = 
				Comparator.comparingInt(Course::getNoOfStudent).reversed();
		
		System.out.println(courses.stream().
				sorted(comparingByNoOfStudentsIncreasing)
				.collect(Collectors.toList()));
		
		System.out.println(courses.stream().
				sorted(comparingByNoOfStudentsDecresing)
				.collect(Collectors.toList()));
		/*
		 * Skip
		 * 
		 * limit
		 * 
		 * Take while --
		 * 
		 * dropwhile---
		 * 
		 */
		System.out.println(courses.stream().
				sorted(comparingByNoOfStudentsIncreasing).skip(2)
				.collect(Collectors.toList()));
		System.out.println(courses.stream().
				sorted(comparingByNoOfStudentsIncreasing).limit(3)
				.collect(Collectors.toList()));
		
		List<Integer> ls = List.of(9,2,3,1,9,7,9,3);
		Predicate<Integer> takewhile = i->i!=9;
		//prints until the condition is true.
		List<Integer> l = ls.stream().takeWhile(takewhile).collect(Collectors.toList());
		
		System.out.println(l);
		
		System.out.println(courses.stream()
				.takeWhile(i->i.getReviewScrorer()>=95).collect(Collectors.toList()));
		Predicate<Integer> dropwhile = i->i!=9;
		//print remaining once the condition becomes false
		List<Integer> l1 = ls.stream().dropWhile(dropwhile).collect(Collectors.toList());
		
		System.out.println(l1);
		
		/*
		 * max-->it doesn't know tthe criteria ..
		 * but it usually return last one in the condition.
		 * ,min, findfirst and findAny
		 * 
		 */
		System.out.println(courses.stream().max(comparingByNoOfStudentsIncreasing));
		
		System.out.println(courses.stream().min(comparingByNoOfStudentsIncreasing));
		
		System.out.println(ls.stream().min((i,j)->(i-j)).orElse(10));
		
		System.out.println(ls.stream().max((i,j)->(i-j)).orElse(8));
		
		System.out.println(ls.stream().findFirst().orElse(2));
		
		//find any has freedom to select and it is explicitly non determinstic
		System.out.println(ls.stream().findAny().orElse(2));
		
		/*
		 * Sum,Avg and count
		 */
		//sum
		System.out.println(
				courses.stream()
				.filter(course->course
						.getReviewScrorer()<=90)
		.mapToInt(Course::getReviewScrorer).sum());
		//average
		System.out.println(
				courses.stream()
				.filter(course->course
						.getReviewScrorer()<=90)
		.mapToInt(Course::getReviewScrorer).average().orElse(10));
		
		System.out.println(
				courses.stream()
				.filter(course->course
						.getReviewScrorer()>=90)
		.mapToInt(Course::getReviewScrorer).count());
		
		/*
		 * Catergory Based questions,groupBy counting
		 */
		//{Micorservices=2, Full stack=1, Cloud=2, Framework=2}
		System.out.println(
				courses.stream().
				collect(Collectors.groupingBy(Course::getCategory,
						Collectors.counting())));
		
		//get max score for individial course
		//{Micorservices=Optional[API : 92 : 14000], Full stack=Optional[Full Stack : 99 : 17000], Cloud=Optional[Aws : 96 : 20000], Framework=Optional[Spring : 98 : 20000]}

		System.out.println("hiii"+
				courses.stream().
				collect(Collectors.groupingBy(Course::getCategory,
						Collectors.maxBy(Comparator
								.comparing(Course::getReviewScrorer)))));
		//{Micorservices=[API, MicroServices], Full stack=[Full Stack], Cloud=[Azure, Aws], Framework=[Spring, SpringBoot]}

		System.out.println(
				courses.stream().
				collect(Collectors.groupingBy(Course::getCategory,
						Collectors.mapping(Course::getName, Collectors.toList()))));
		
		//group by category and review scorer.
		
		Map<String, List<Integer>> collect = courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getReviewScrorer, Collectors.toList())));
		System.out.println(collect);
	}

}
