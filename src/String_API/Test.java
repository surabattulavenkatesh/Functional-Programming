package String_API;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Integer[] a = {1,2,3,4,5,6};
		Integer[] b = {1,2,3,5,6};
		
		Set<Integer> set = new HashSet<>(Arrays.asList(b));
		
		for(int i = 0;i<a.length; i++) {
			if(!set.add(a[i])) 
			{
				continue;
			}else {
				System.out.println(a[i]);
			}
	}

}
}
