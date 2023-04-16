package Functional_Interfaces;

import java.util.stream.LongStream;

public class FP05Parallelizing {

	public static void main(String[] args) 
	{

		long time = System.currentTimeMillis();
		
		System.out.println(LongStream.range(0,999999999).parallel().sum());
		
		System.out.println(System.currentTimeMillis() - time);
	}

}
