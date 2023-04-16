package java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_Non_repeated_char {

	public static void main(String[] args) {

		String str = "Java JProgramming";
		Function<Character,Character> fun = i->Character.toLowerCase(Character.valueOf((char) i));
		
		 Character result = str.chars() // Stream of String       
                 .mapToObj(s -> Character.toLowerCase((char)s)) // First convert to Character object and then to lowercase         
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() == 1)
                 .map(entry -> entry.getKey())
                 .findFirst()
                 .get();
		 	System.out.println(result);  
	}

}
