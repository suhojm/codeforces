import java.util.Scanner;
import java.util.HashSet;

public class Codeforces749B{
	public static String getOneCoordinate(int x1, int y1, int x2, int y2, int x3, int y3){
		
		return new String((int)(x1 + x2 - x3) + " " + (int)(y1 + y2 - y3));
	}

	public static HashSet<String> getAnswer(int x1, int y1, int x2, int y2, int x3, int y3){
		HashSet<String> result = new HashSet<String>();

		result.add(getOneCoordinate(x1,y1,x2,y2,x3,y3));
		result.add(getOneCoordinate(x1,y1,x3,y3,x2,y2));
		result.add(getOneCoordinate(x2,y2,x3,y3,x1,y1));

		return result;
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int x3 = in.nextInt();
		int y3 = in.nextInt();

		HashSet<String> answer = getAnswer(x1,y1,x2,y2,x3,y3);
		System.out.println(answer.size());
		for(String s : answer){
			System.out.println(s);
		}
	}
}