import java.lang.Math;

public class Solution766A{
	public int getAnswer(String a, String b){
		if(a.equals(b))
			return -1;
		else{
			if(a == null)
				return b.length();
			if(b == null)
				return a.length();
			return Math.max(a.length(),b.length());
		}
	}
}