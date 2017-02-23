import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Codeforces758A{
	public static int getAnswer(ArrayList<Integer> a){
		int max = Collections.max(a);
		int result = 0;
		for(int i = 0; i < a.size(); ++i){
			int num = a.get(i);
			if(num < max){
				result += (max - num);
			}
		}

		return result;
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