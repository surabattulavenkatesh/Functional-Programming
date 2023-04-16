package String_API;

public class TrimVsStrip {

	public static void main(String[] args) {

		String string1 = "   Java   " + " \u2003\u2003\u2003 ";
	      System.out.println("String: " + string1);
	      System.out.println("String length: " + string1.length());

	      String string2 = string1.trim();
	      System.out.println("After using trim() function: " + string2);
	      System.out.println("Length: " + string2.length());

	      String string3 = string1.strip();
	      System.out.println("After using strip() function: " + string3);
	      System.out.println("Length: " + string3.length());
	}

}
