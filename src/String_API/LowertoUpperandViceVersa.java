package String_API;

public class LowertoUpperandViceVersa {

	public static void main(String[] args) {

		String str = "iciciBANK";
		StringBuilder sb = new StringBuilder();
		char []ch = str.toCharArray();
		
		for(int i =0; i<ch.length; i++) {
			
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) 
			{
				char u = (char) (c+32);
				
				sb.append(u);
			}else {
				char l = (char)(c-32);
				sb.append(l);
			}
			
		}
		System.out.println(sb.toString());
	}

}
