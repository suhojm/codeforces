import java.util.*;

public class CF3A{
	public static void main(String[] args){

		// slow :(

		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();

		ArrayList<String> path = new ArrayList<String>();

		int r_differ = (int)(t.charAt(1) - s.charAt(1));
		int c_differ = (int)(t.charAt(0) - s.charAt(0));

		String rstr = "";
		int rdirection = 0;
		if(r_differ > 0){
			rstr = "U";
			rdirection = 1;
		} else if(r_differ < 0) {
			rstr = "D";
			rdirection = -1;
		}	

		String cstr = "";
		int cdirection = 0;
		if(c_differ > 0){
			cstr = "R";
			cdirection = 1;
		} else if(c_differ < 0){
			cstr = "L";
			cdirection = -1;
		}

		int cnt = 0;	
		while(r_differ != 0 || c_differ != 0){
			StringBuilder sb = new StringBuilder();
			if(c_differ != 0){
				sb.append(cstr);
				c_differ -= cdirection;
			}
			if(r_differ != 0){
				sb.append(rstr);
				r_differ -= rdirection;
			}
			path.add(sb.toString());
			cnt++;
		}

		System.out.println(cnt);
		for(String str : path){
			System.out.println(str);
		}
	}
}