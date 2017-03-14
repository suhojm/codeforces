import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codeforces766B{
	public static String getAnswer(ArrayList<Integer> a){
		if(a.size() < 3)
			return "NO";	

		Collections.sort(a);
		for(int i = 0; i < a.size()-2; ++i){
			if(a.get(i) + a.get(i+1) > a.get(i+2))
				return "YES";
		}

		return "NO";
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i){
			a.add(in.nextInt());
		}

		System.out.println(getAnswer(a));
	}	
}