package java8;

import java.util.stream.IntStream;

public class FirstLowerThenUpperCase {

	public static void main(String[] args) {

		String inputString = "HelloWorld";

		int length = inputString.length();
		int halfLength = length / 2;

		String outputString = IntStream.range(0, length)
		        .mapToObj(i -> i < halfLength ? Character.toLowerCase(inputString.charAt(i)) : Character.toUpperCase(inputString.charAt(i)))
		        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
		        .toString();

		System.out.println(outputString);

		
		
	}

}
