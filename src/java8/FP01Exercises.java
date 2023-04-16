package java8;

import java.util.List;

//print only odd numbers from the List
//print all courses individually
//print course containing the word "Spring".
//print courses who name has atlease 4characters

public class FP01Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(10,11,12,13,14,15);
		List<String> courses = List.of("spring", "spring Boot", "API", "Microservices");
		printonlyOdd(numbers);
		printAllCoursesIndividually(courses);
		printCoursesContainSpring(courses);
		printCoursesContainAtleast4words(courses);
		printSquaresOfEvenNumbers(numbers);
		printCubesOfOddNumbers(numbers);
		printNoOfcharatersOfEachString(courses);
		
		
	}
	public static void printonlyOdd(List<Integer> numbers) {
		numbers.stream().filter(x->x%2!=0).forEach(System.out::println);
	}
	public static void printAllCoursesIndividually(List<String> courses) {
		courses.stream().forEach(System.out::println);
	}
	public static void printCoursesContainSpring(List<String> courses) {
		courses.stream().filter(x ->x.contains("Spring")).forEach(System.out::println);
	}
	public static void printCoursesContainAtleast4words(List<String> courses) {
		courses.stream().filter(x ->x.length()>=4).forEach(System.out::println);
	}
	public static void printSquaresOfEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(x->x%2==0).map(y->y*y).forEach(System.out::println);
	}
	public static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(x->x%2!=0).map(y->y*y*y).forEach(System.out::println);
	}
	public static void printNoOfcharatersOfEachString(List<String> courses) {
		courses.stream().map(x->x+":"+x.length()).forEach(System.out::println);
	}
	

}
