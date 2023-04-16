package JDK14;

public class SwitchExpressionRunner {

	public static void main(String[] args) {
		
		String str = "aaaabbbccd";
		char ch = str.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i<str.length(); i++) 
		{
			if(str.charAt(i) == ch) {
				count ++;
			}else 
			{
				
				sb.append(ch).append(count);
				count = 1;
				ch = str.charAt(i);
				
			}
		}
		sb.append(ch).append(count);		
		System.out.println(sb.toString());
		
	}

}
