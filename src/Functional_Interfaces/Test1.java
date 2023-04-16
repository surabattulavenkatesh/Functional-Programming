package Functional_Interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> ls = List.of(9,9,5,3,56,78,12,45,18,18,12,45,1999);
		
		//Even
		//ls.stream().filter(i->i%2==0).forEach(System.out::println);
		
		//Numbers starting with 1
		Predicate<String> startsWithPred = i->i.startsWith("1");
		Function<Integer,String> function1 = i->i+"";
		
		//ls.stream().map(function1).filter(startsWithPred).forEach(System.out::println);
		
		
		//duplicate elemets using java 8
		Set<Integer> set = new HashSet<>();
		Predicate<Integer> setpred = i->!set.add(i);
		//ls.stream().filter(setpred).forEach(System.out::println);
		
		//Find first elemet in list.
		//ls.stream().findFirst().ifPresent(System.out::print);
		
		
		//total number of elements in list
		//Long count = ls.stream().collect(Collectors.counting());
		Long count = ls.stream().count();
		//System.out.println(count);
		
		//Min and max
		Comparator<Integer> com = (i,j)->(i-j);
		//Optional<Integer> max = ls.stream().max(com);
		int max = ls.stream().max(Integer::compare).get();
		//System.out.println(max);
		
		
		//Optional<Integer> min = ls.stream().min(com);
		int min = ls.stream().min(Integer::compare).get();
		//System.out.println(min);
		
		List<String> strList = List.of("Active","Suspend","Delete","Active","Delete"); 
		Predicate<String> strfun = i->i.contains("Active");
		
		
		List<String> first = List.of("Active","Active");
		List<String> second = List.of("Suspend","Suspend");
		List<String> third = List.of("Delete");
		
		ArrayList<String> merge = new ArrayList<>();
        merge.addAll(first);
        merge.addAll(second);
        merge.addAll(third);
		System.out.println(merge);
        
        //ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
		
	}

}
