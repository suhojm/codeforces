import java.util.ArrayList;
import java.util.Collections;

public class Solution761B{
	public String getAnswer(int n, int l, ArrayList<Integer> k_input, ArrayList<Integer> s_input){
		ArrayList<Integer> k = new ArrayList<Integer>();
		ArrayList<Integer> s = new ArrayList<Integer>();

		StringBuilder k_sb = new StringBuilder();
		StringBuilder s_sb = new StringBuilder();

		for(int i = 0; i < n-1; ++i){
			k_sb.append(k_input.get(i+1) - k_input.get(i));
			s_sb.append(s_input.get(i+1) - s_input.get(i));
			k.add(k_input.get(i+1) - k_input.get(i));
			s.add(s_input.get(i+1) - s_input.get(i));
		}

		int last_k = l - k_input.get(n-1) + k_input.get(0);
		k.add(last_k);
		k_sb.append(last_k);
		int last_s = l - s_input.get(n-1) + s_input.get(0);
		s.add(last_s);
		s_sb.append(last_s);

		k_sb.append(k_sb);
		if(k_sb.indexOf(s_sb.toString()) == -1){
			System.out.println("NO");
			return "NO";
		} 

		System.out.println("YES");
		return "YES";
	}
}