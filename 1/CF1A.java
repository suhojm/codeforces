import java.util.*;

public class CF1A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int a = in.nextInt();

		if(n <= 0 || m <= 0){
			System.out.println("0");
		}
		else{
			if(n % a != 0)
				n += a;
			if(m % a != 0)
				m += a;
			long result = (long)(m / a) * (long)(n / a);
			System.out.println(result);
		}
	}
}