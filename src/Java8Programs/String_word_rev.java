package Java8Programs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_word_rev {

	public static void main(String[] args) {

		
		String str = "This is my hostel";
		
		String rev= Stream.of(str).map(i->new StringBuilder(i)
					.reverse().toString()).
						collect(Collectors.joining());
		System.out.println(rev);
		List<String> strList = List.of(str.split(" "));
		
		List<String> finList = strList.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(finList);
	}

}
