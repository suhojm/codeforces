import java.util.Scanner;

public class Codeforces774C{
	public static String getAnswer(int n){
		// 6,2,5,5,4,5,6,3,7,6 are needed for 0,1,2,3,4,5,6,7,8,9
		// if there is more than 2, add one more 1,
		// if there is only 1, change very first one to 7.
		

		// if n is less than 2, there is no number to create...
		if(n < 2)
			return "";
		
		StringBuilder sb = new StringBuilder();
		while(n > 3){
			sb.append("1");
			n -= 2;
		}
		if(n == 3)
			sb = new StringBuilder("7" + sb.toString());
		else
			sb = new StringBuilder("1" + sb.toString());

		return sb.toString();
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(getAnswer(n));
	}
}