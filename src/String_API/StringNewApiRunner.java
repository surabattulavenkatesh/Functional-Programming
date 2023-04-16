package String_API;

public class StringNewApiRunner {

	public static void main(String[] args) {

		
		System.out.println(" ".isBlank());//return empty and whitespace returns true
		System.out.println(" ".isEmpty());
		System.out.println(" L R ".trim());
		System.out.println(" L R  ".strip());
		System.out.println(" L R  ".stripLeading());
		System.out.println(" L R  ".stripTrailing());
		
		//Transform and formatted  strings
		System.out.println("Venkat".transform(i->i.substring(3)));
		System.out.println("My name is %s and Age is : %d".formatted("venky",23));
		
		//helpful Null pointer Exceptions	
		String str = null;
		System.out.println(str.isBlank());
		
		
	}

}
