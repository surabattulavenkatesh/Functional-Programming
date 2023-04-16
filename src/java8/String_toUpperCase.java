package java8;

import java.util.List;
import java.util.stream.Collectors;

public class String_toUpperCase {

	public static void main(String[] args) {

		
		List<String> strings = List.of("usa","japan","Turkey");
		String Finalstr = strings.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		
		System.out.println(Finalstr);
	}

}
