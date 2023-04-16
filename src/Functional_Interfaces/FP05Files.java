package Functional_Interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class FP05Files {

	public static void main(String[] args) throws IOException {

		Comparator<String> com = Comparator.comparing(i->i.toString().length());
		Files.lines(Path.of("File.txt"))
			.map(i->i.split(" "))
				.flatMap(Arrays::stream).distinct().sorted(com).forEach(i->System.out.println(i));
		
	}

}

/*
 * 
		Files.lines(Path.of("File.txt"))
			.map(i -> i.split("")).flatMap(Arrays::stream)
				.forEach(System.out::print);
				*/
