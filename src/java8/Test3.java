package java8;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {

		List<String> value = new ArrayList<>();
		value.add("CN=GLOB2B_PEM_NALA_QA_sponserAdministrator");
		value.add("CN=GLOBnserAdministrator");
		value.add("OU=Application");
		value.add("OU=Groups");
		
		String val = "";
		StringBuilder sb = new StringBuilder();
		for(String i : value) 
		{
			
			if(i.startsWith("CN=") && i.contains("GLOB2B")) 
			{
				
				sb.append(i);
			}
		}
		String[] str = sb.toString().split("_");
		val = str[str.length-1];
		System.out.println(val);
		
		//setProperty(key,val)
		
		
		
		
		
		

		
	
	}

}
