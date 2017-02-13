import java.util.*;

public class CF760B {
	public static void main(String[] args){
		// getting inputs
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // number of bed and hobbits
		int m = in.nextInt(); // number of pillows
		int k = in.nextInt(); // where Frodo sleep. kth bed

		int result = 1;
		m -= n;

		int frodoAndNeighbors = 1;
		int range = 0;

		while(m >= frodoAndNeighbors){
			if(frodoAndNeighbors == n){
				result += m / n;
				break;
			} else {
				result++;
				m -= frodoAndNeighbors;

				range++;
				if(k - range > 0)
					frodoAndNeighbors++;
				if(k + range <= n)
					frodoAndNeighbors++;
			}
		}
		System.out.println(result);
	}
}