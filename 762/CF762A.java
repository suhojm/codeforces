import java.util.*;
import static java.lang.Math.sqrt;

public class CF762A{
	public static void main(String[] args){
		
		// This answer is so dirty.. do refactoring

		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int k = in.nextInt();

		if(k == 1){
			System.out.println("1");
		} else if((n > 2 && n == k) || k > n) {
			System.out.println("-1");
		} else{
			int sqrtn = (int)sqrt(n);

			long i = 1;
			int count = 0;

			while(count < k && i < sqrtn){
				if(n % i == 0)
					count++;
				++i;
			}

			if(count < k){
				int possibleMaxCount = 0;
				if(i * i == n){
					possibleMaxCount = count * 2 + 1;
				} else{
					if(n % i == 0)
						count++;
						
					possibleMaxCount = count * 2;
				}

				if(possibleMaxCount < k){
					i = -1;
				} else if(count < k){		
					while(count < k){
						if(i == 0){
							i = -1;
							break;
						}
						if(n % i == 0)
							count++; 
						--i;
					}
					if(i != -1)
						i = (long)(n / (i+1));		
				}	
			}	
			else
				--i;
			
			System.out.println(i);
		}
	}
}