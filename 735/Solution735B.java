import java.util.Collections;
import java.util.ArrayList;
import java.lang.Math;

public class Solution735B{
	public double getAnswer(int n, int n1, int n2, ArrayList<Integer> a){
		Collections.sort(a, Collections.reverseOrder());
		
		// long total1 = 0;
		// long total2 = 0;
		Double total1 = 0.0;
		Double total2 = 0.0;
		int index = 0;

		int min = Math.min(n1,n2);
		int max = Math.max(n1,n2);

		// for(int i = 0; i < min; ++i){
		// 	total1 += a.get(index);
		// 	++index;
		// }

		// for(int j = 0; j < max; ++j){
		// 	total2 += a.get(index);
		// 	++index;
		// }

		// return ((double)total1/min + (double)total2/max);

		for(int i = 0; i < min; ++i){
			total1 *= i;
			total1 += a.get(index);
			total1 /= (i+1);
			++index;
		}

		for(int j = 0; j < max; ++j){
			total2 *= j;
			total2 += a.get(index);
			total2 /= (j+1);
			++index;
		}

		return total1 + total2;
	}
}