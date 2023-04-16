package Functional_Interfaces;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OnlyStreams {

	public static void main(String[] args) {

		
		int arr[] = {1,2,3,4,5};
		
		Integer[] revArray = IntStream.rangeClosed(1, arr.length)
		.mapToObj(i->arr[arr.length-i]).toArray(i->new Integer[i]);
		
		System.out.println(Arrays.toString(revArray));
	}

}
