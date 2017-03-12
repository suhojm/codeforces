import java.util.Scanner;

public class Codeforces764A{
	public static int getLCM(int n, int m){
		int prime = 2;
		int result = 1;

		while(n != 1 && m != 1){
			// System.out.println(n + " " + m);
			while(n % prime == 0 && m % prime == 0){
				result *= prime;
				n /= prime;
				m /= prime;
			}
			while(n % prime == 0){
				// System.out.println("n: " + n);
				result *= prime;
				n /= prime;
			}
			while(m % prime == 0){
				// System.out.println("m: " + m);
				result *= prime;
				m /= prime;
			}
			prime++;
		}
		result*=m;
		result*=n;

		// System.out.println(result);
		return result;
	}

	public static int getAnswer(int n, int m, int z){

		return z / getLCM(n,m);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int z = in.nextInt();

		System.out.println(getAnswer(n,m,z));
	}
}