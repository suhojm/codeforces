import java.util.ArrayList;
import java.util.Collections;

public class Solution758A{
	public int getMax(ArrayList<Integer> a){
		if(a.size() == 0)
			return -1;

		int max = a.get(0);
		for(int i = 1; i < a.size(); ++i){
			if(a.get(i) > max)
				max = a.get(i);
		}
		return max;
	}

	public int getAnswer(ArrayList<Integer> a){
		// int max = getMax(a);
		
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
}