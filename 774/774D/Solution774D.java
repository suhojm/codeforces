import java.util.ArrayList;
import java.util.Collections;

public class Solution774D{
	public String getAnswer(int n, int l, int r, ArrayList<Integer> a, ArrayList<Integer> b){
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
}