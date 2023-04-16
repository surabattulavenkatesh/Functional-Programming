package Java8Programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_word_occurance {

	public static void main(String[] args) {

		String str = "How much you need to score score";
		
		List<String> list = List.of(str.split(" "));
		
		//System.out.println(list);
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
	}

}
