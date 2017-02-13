import java.util.*;

public class CF735A {
	public static boolean helper(int n, int k, String s){
		int g = s.indexOf("G");
		int t = s.indexOf("T");

		if(g < t){
			if((t-g) % k != 0){
				return false;
			}
		} else {
			if((g-t) % k != 0){
				return false;
			}
			k *= -1;
		}

		g += k;
		
		while(s.charAt(g) != 'T'){
			if(s.charAt(g) == '#')
				return false;
			g += k;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();

		if(helper(n,k,s)){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}