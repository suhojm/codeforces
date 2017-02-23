import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

public class Codeforces758B{
	public static String getAnswer(String s){
		if(s.indexOf("!") == -1){
			return "0 0 0 0";
		}

		char[] chars = new char[4];

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('R', 0);
		hm.put('B', 0);
		hm.put('Y', 0);
		hm.put('G', 0);

		HashSet<Character> hs = new HashSet<Character>();
		hs.add('R');
		hs.add('B');
		hs.add('Y');
		hs.add('G');

		for(int i = 0; i < s.length(); ++i){
			if(hs.size() > 0 && s.charAt(i) != '!'){
				chars[i % 4] = s.charAt(i);
				hs.remove(s.charAt(i));
			} 
		}

		for(int i = 0; i < s.length(); ++i){
			if(s.charAt(i) == '!'){
				hm.put(chars[i % 4], hm.get(chars[i % 4])+1);
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(hm.get('R'));
		sb.append(" ");
		sb.append(hm.get('B'));
		sb.append(" ");
		sb.append(hm.get('Y'));
		sb.append(" ");
		sb.append(hm.get('G'));
		
		return sb.toString();
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();

		System.out.println(getAnswer(s));
	}	
}