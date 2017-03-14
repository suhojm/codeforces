import java.util.Scanner;
import java.lang.Math;

public class Codeforces766A{
	public static int getAnswer(String a, String b){
		if(a.equals(b))
			return -1;
		else{
			if(a == null)
				return b.length();
			if(b == null)
				return a.length();
			return Math.max(a.length(),b.length());
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();

		System.out.println(getAnswer(a,b));
	}
}