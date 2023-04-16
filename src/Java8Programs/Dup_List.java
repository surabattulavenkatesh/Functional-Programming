package Java8Programs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dup_List {

	public static void main(String[] args) {

		
		List<Integer> ls = List.of(2,3,4,5,6,7,2,9,19,19,19,9);
		Set<Integer> set = new HashSet<>();
		//ls.stream().skip(4).forEach(System.out::print);
		//ls.stream().filter(i->!set.add(i)).distinct().forEach(System.out::println);
		
		ls.stream().filter(i->!set.add(i)).distinct().sorted()
		
		.collect(Collectors.toList()).forEach(System.out::println);
	}

}
