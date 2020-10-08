import java.util.Scanner;

class Scan{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name");
		String name = myObj.nextLine();
		System.out.println("Name = " + name);
	}
	
}