import java.util.*;

public class CF1B{
	public static String convertRXCXtoOTHER(String input){
		int index_c = input.indexOf("C");
		String r_str = input.substring(1,index_c);
		String c_str = input.substring(index_c+1);
		int c = Integer.parseInt(c_str);

		StringBuilder sb = new StringBuilder();
		while(c > 0){
			c--;
			if(c >= 0){
				int n = c % 26;
				sb.insert(0, (char)(n+'A'));
				c /= 26;
			}
		}

		return sb.toString() + r_str;
	}

	public static String convertOTHERtoRXCX(String input){
		int i = 0;
		int intValueOfC = 0;
		while(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
			intValueOfC *= 26;
			intValueOfC += input.charAt(i) - 'A' + 1;
			++i;
		}
		StringBuilder sb = new StringBuilder("R");
		sb.append(input.substring(i));
		sb.append("C");
		sb.append(String.valueOf(intValueOfC));
		return sb.toString();
	}

	public static boolean isRXCX(String input){
		if(input.charAt(0) != 'R')
			return false;
		if(input.charAt(1) < '0' || input.charAt(1) > '9'){
			return false;
		}
		boolean found_c = false;
		int i = 2;
		for(; i < input.length(); ++i){
			if(input.charAt(i) == 'C'){
				found_c = true;
				break;
			}
		}
		if(!found_c)
			return false;

		return true;	
	}

	public static String solution(String input){
		if(isRXCX(input)){
			// switch it to CR form
			return convertRXCXtoOTHER(input);
		} else{
			// switch it to RXCS form
			return convertOTHERtoRXCX(input);
		}
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i = 0; i < n; ++i){
			String str = in.next();
			System.out.println(solution(str));
		}		
	}
}