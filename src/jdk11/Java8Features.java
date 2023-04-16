package jdk11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java8Features {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<>();
		names.add("allen");
		names.add("john");
		names.add("Wick");
		
		List<String> copyOfNames = Collections.unmodifiableList(names);
		
		System.out.println(copyOfNames);
	}
	static void doNotChange(List<String> copyOfNames) {
		copyOfNames.add("Shoul not");
	}

}
