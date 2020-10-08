import java.util.*;

class SubstringComparison{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		
		SortedSet<String> set = new TreeSet<String>();
		for(int i = 0; i <= s.length() - n;i++){
			set.add(s.substring(i, i + n));
		}
		
		System.out.println(set.first() + "\n" + set.last());
		
		
		
		/*
		 String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i + k <= s.length(); i++) {
            if((s.substring(i, i + k)).compareTo(smallest) < 0) {smallest = s.substring(i, i + k);}
            if((s.substring(i, i + k)).compareTo(largest) > 0)  {largest = s.substring(i, i + k);}
        }*/
        
		
		
		
	}
}