import java.util.Scanner;

public class CF749A{
	public static String getAnswer(int n){ 
		int m = n / 2;
		StringBuilder sb = new StringBuilder();
		
		sb.append(m+"\n");

		// 248ms
		// StringBuilder tail = new StringBuilder();
		// if(m > 1){
		// 	int i = 1;
		// 	tail.append("2 ");
		// 	while(i * 2 <= m-1){
		// 		tail.append(tail);
		// 		i *= 2;
		// 	}
		// 	for(; i < m-1; ++i){
		// 		tail.append("2 ");
		// 	}
		// }
		// // last number can be 2 or 3
		// if(n % 2 == 0)
		// 	tail.append("2");
		// else
		// 	tail.append("3");
		// sb.append(tail);

		// 187ms...??
		for(int i = 0; i < m-1; ++i){
			sb.append("2 ");
		}

		// last number can be 2 or 3
		if(n % 2 == 0)
			sb.append("2");
		else
			sb.append("3");

		return sb.toString();
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(getAnswer(n));
	}
}