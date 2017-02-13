import java.util.*;

public class CF760A {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int d = in.nextInt();
		
		int[] daysOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
		int days = daysOfMonths[m-1];
	
		int firstWeekDays = 8 - d;

		int result = 1;
		days -= firstWeekDays;
		result += (days / 7);
		days %= 7;
		if(days != 0)
			result++;

		System.out.println(result);	
	}
}