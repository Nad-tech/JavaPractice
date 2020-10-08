import java.util.*;

class RegExGetTokens{
	/*
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	scan.useDelimiter("\\Z");
	String s = scan.next().trim();
	if (s.length() > 0) {
		String[] tokens = s.split("[!,?._'@\\s]+");
		System.out.println(tokens.length);
		for(String token : tokens) {
			System.out.println(token);
		}
	} else {
		System.out.println(0);
	}
	scan.close();
	*/
		
	public static void main(String[] args) {
		//String s = "He is a very very good boy, isn't he?";
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.trim().length()==0 || s.trim().length()>400000)
		{
			System.out.println(0);
			return;
		}

		String words[]=s.trim().split("[ !,?.\\_'@]+");
		System.out.println(words.length);
		for (String word:words) System.out.println(word);
	}
}