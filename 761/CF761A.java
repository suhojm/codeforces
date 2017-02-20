import java.util.*;
import java.lang.Math;

public class CF761A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int	a = in.nextInt(); // num of even steps
		int b = in.nextInt(); // num of odd steps

		if(Math.abs(a-b) > 1 || (a == 0 && b == 0)){
			System.out.println("NO");
		} else{
			System.out.println("YES");
		}	
	}
}