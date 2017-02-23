import java.util.HashSet;
import java.util.HashMap;

public class Solution758B{
	public String getAnswer(String s){
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

		for(int i = 0; hs.size() > 0 && i < s.length(); ++i){
			if(s.charAt(i) != '!'){
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
		
		// sb.append(hm.get('R') + " " + hm.get('B') + " " + hm.get('Y') + " " + hm.get('G'));
		sb.append(hm.get('R'));
		sb.append(" ");
		sb.append(hm.get('B'));
		sb.append(" ");
		sb.append(hm.get('Y'));
		sb.append(" ");
		sb.append(hm.get('G'));

		return sb.toString();
	}
}