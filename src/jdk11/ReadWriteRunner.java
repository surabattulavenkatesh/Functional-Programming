package jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteRunner {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("File.txt");
		String oneFile = Files.readString(path);
		//System.out.println(oneFile);
		
		String replcing = oneFile.replace("H", "k");
		//System.out.println(replcing);
		
		Path write = Paths.get("newFile.txt");
		Files.writeString(write,replcing);
		//introduces in jdk11
		String newFile = Files.readString(write);
		System.out.println(newFile);
		
	}

}
