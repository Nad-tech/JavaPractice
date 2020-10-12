import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class RegexIpAddress{

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
            System.out.println(IP.matches(new MyRegex().pattern1));
        }

    }
}

//YOU SHOULD ONLY SUBMIT THE FOLLOWING BLOCK
class MyRegex
{
         String pattern = 
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
			
		String term = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"; 
		String pattern1 = term + "." + term + "." + term + "." + term;

}