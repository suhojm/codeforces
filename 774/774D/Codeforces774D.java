import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Codeforces774D{
	public static String getAnswer(int n, int l, int r, ArrayList<Integer> a, ArrayList<Integer> b){
		if(a.equals(b))
			return "TRUTH";

		for(int i = 1; i < l; ++i){
			if(a.get(i-1) != b.get(i-1))
				return "LIE";
		}
		for(int i = r; i < n; ++i){
			if(a.get(i) != b.get(i))
				return "LIE";
		}
		ArrayList<Integer> sa = new ArrayList<Integer>(a.subList(l-1,r));
		ArrayList<Integer> sb = new ArrayList<Integer>(b.subList(l-1,r));

		Collections.sort(sa);
		Collections.sort(sb);

		if(sa.equals(sb))
			return "TRUTH";
		else			
			return "LIE";
		
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int r = in.nextInt();

		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i){
			a.add(in.nextInt());
		}

		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i){
			b.add(in.nextInt());
		}

		System.out.println(getAnswer(n,l,r,a,b));
	}
}