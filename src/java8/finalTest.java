package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class finalTest {

	public static void main(String[] args) {

		List<String> value = new ArrayList<>();
		value.add("CN=GLOB2B_PEM_NALA_QA_sponserAdministrator");
		value.add("CN=GLOBnserAdministrator");
		value.add("OU=Application");
		value.add("OU=Groups");
		//System.out.println(value);
		
		Predicate<String> pred = i->(i.startsWith("CN=") && i.contains("GLOB2B"));
		Function<String,String> fun = i->i.substring(i.lastIndexOf("_")+1);
		
		String tol = value.stream().filter(pred)
				.map(fun).collect(Collectors.joining());
		
		System.out.println(tol);
		

		
	
	}

}
