package Functional_Interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Newtest {

	public static void main(String[] args) {

		List<String> list = List.of("active","delete","suspend","active","delete","suspend");
//		
//		Function<String,String> f1 = i->{
//			if(!i.equals("active")) {
//				list1.add(i);
//			}
//			return i;
//			
//		};
		List<String> list1 = list.stream().sorted().filter(i->i.equals("active")).collect(Collectors.toList());
		List<String> delList = list.stream().filter(i->!i.equals("active")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());;
		list1.addAll(delList);
		System.out.println(list1);
	}

}
