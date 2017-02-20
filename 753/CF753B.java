import java.util.*;

public class CF753B {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[4];
		int index = 0;

		int initial_bulls = -1;
		int initial_cows = -1;

		// get 4 numbers
		for(int i = 0;index < 4 && i < 10; ++i){
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < 4; ++j){
				sb.append(i);
			}
			// now sb is like 0000, 1111 .... 9999
			System.out.println(sb);
			System.out.flush();
			int bulls = in.nextInt();
			int cows = in.nextInt();

			if(bulls != 0 || cows != 0){
				arr[index] = i;
				index++;
			}
		}
		// now arr[0], arr[1], arr[2], and arr[3] have the 4 numbers


		// initial with 4 same number (ex: 2222 if arr[0] == 2)
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; ++i){
			sb.append(arr[0]);
		}
		System.out.println(sb);
		System.out.flush();
		int bulls = in.nextInt();
		int cows = in.nextInt();

		// has index of arr
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(0);
		hs.add(1);
		hs.add(2);
		hs.add(3); 

		boolean found = false;
		// i for index of a string of 4 numbers
		for(int i = 0; !found && i < 4; ++i){
			boolean changed = false;
			char prev = sb.charAt(i);

			// j for index of the arr contains 4 possible numbers
			for(int j = 1; !changed && j < 4; ++j){
				if(hs.contains(j)){
					sb.setCharAt(i, (char)('0'+arr[j]));
					System.out.println(sb);
					System.out.flush();
					int newBulls = in.nextInt();
					int newCows = in.nextInt();	
					if(newBulls ==4 && newCows == 0){
						found = true;
						break;
					}
					if(newBulls > bulls){
						hs.remove(j);
						bulls = newBulls;
						cows = newCows;
						changed = true;
					} else if(newBulls < bulls){
						hs.remove(j-1);
						changed = true;
						sb.setCharAt(i, prev);
					}
					prev = sb.charAt(i);
				}
			}
		}
		
		System.out.println(sb);
		System.out.flush();
	}
}