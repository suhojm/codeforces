public class Solution749A{
	public String getAnswer(int n){ 
		int m = n / 2;
		StringBuilder sb = new StringBuilder();
		
		sb.append(m+"\n");

		StringBuilder tail = new StringBuilder();
		if(m > 1){
			int i = 1;
			tail.append("2 ");
			while(i * 2 <= m-1){
				tail.append(tail);
				i *= 2;
			}
			for(; i < m-1; ++i){
				tail.append("2 ");
			}
		}
		// for(int i = 0; i < m-1; ++i){
		// 	sb.append("2 ");
		// }

		// last number can be 2 or 3
		if(n % 2 == 0)
			tail.append("2");
		else
			tail.append("3");

		sb.append(tail);

		return sb.toString();
	}
}