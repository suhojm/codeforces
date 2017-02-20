import java.lang.Math;

public class Solution761A{
	public String getAnswer(int a, int b){
		if(Math.abs(a-b) > 1 || (a == 0 && b == 0)){
			System.out.println("NO");
			return "NO";
		} else{
			System.out.println("YES");
			return "YES";
		}	
	}
}