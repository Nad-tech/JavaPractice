import java.util.*;
import java.time.LocalDate;

class DayOfWeek{
	
	static int month = 8; 
	static int day = 5;
	static int year = 2015;
	
	public static void main(String[] args) {
		System.out.print(LocalDate.of(year, month, day).getDayOfWeek().name());
	}
}