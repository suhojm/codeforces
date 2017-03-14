import java.util.ArrayList;
import java.util.Collections;

public class Solution766B{
	public String getAnswer(ArrayList<Integer> a){
		if(a.size() < 3)
			return "NO";	

		Collections.sort(a);
		for(int i = 0; i < a.size()-2; ++i){
			if(a.get(i) + a.get(i+1) > a.get(i+2))
				return "YES";
		}

		return "NO";
	}
}	