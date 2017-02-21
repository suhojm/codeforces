import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Codeforces757B{
	public static int getAnswer(ArrayList<Integer> s){
		if(s.size() <= 1)
			return s.size();

		HashMap<Integer, Integer> mymap = new HashMap<Integer, Integer>();
		HashMap<Integer, ArrayList<Integer>> dp = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i = 0; i < s.size(); ++i){
			int num = s.get(i);
			
			if(dp.containsKey(num)){
				ArrayList<Integer> al = dp.get(num);
				for(int j = 0; j < al.size(); ++j){
					if(mymap.containsKey(al.get(j))){
						mymap.put(al.get(j), mymap.get(al.get(j)) + 1);
					} else {
						mymap.put(al.get(j), 1);
					}
				}
			} else {
				int orig_num = num;
				int div = 2;
				while(num > 1){
					while(num % div != 0){
						++div;
					}
					if(dp.containsKey(orig_num)){
						ArrayList<Integer> dpal = dp.get(orig_num);
						dpal.add(div);
						dp.put(orig_num, dpal);
					} else {
						dp.put(orig_num, new ArrayList<>(Arrays.asList(div)));
					}

					if(mymap.containsKey(div)){
						mymap.put(div, mymap.get(div) + 1);
					} else{
						mymap.put(div, 1);
					}
					while(num % div == 0){
						num /= div;
					}

					// check dp has num
					if(dp.containsKey(num)){
						ArrayList<Integer> al = dp.get(num);
						ArrayList<Integer> dpal = dp.get(orig_num);
						dpal.addAll(al);
						dp.put(orig_num, dpal);
						
						for(int j = 0; j < al.size(); ++j){
							if(mymap.containsKey(al.get(j))){
								mymap.put(al.get(j), mymap.get(al.get(j)) + 1);
							} else {
								mymap.put(al.get(j), 1);
							}
						}
						num = 1;
					}
				} 
			}
		}

		int max = 1;
		for(Integer key : mymap.keySet()){
			if(mymap.get(key) > max){
				max = mymap.get(key);
			}
		}
		return max;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> s = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i){
			s.add(in.nextInt());
		}
		System.out.println(getAnswer(s));
	}
}