public class Solution757A{
	public int getAnswer(String s){
		String bulbasaur_chars = "auBlbsr";
		int possible_num = 0;

		char[] ascii_array = new char[256];
		for(int i = 0; i < s.length(); ++i){
			ascii_array[s.charAt(i)]++;
		}


		// a(index: 0) and u(index: 1) are needed 2 times
		possible_num = ascii_array[bulbasaur_chars.charAt(0)] / 2;

		int n = ascii_array[bulbasaur_chars.charAt(1)];
		if(n / 2 < possible_num){
			possible_num = n / 2;
		}
		for(int i = 2;possible_num !=0 && i < bulbasaur_chars.length(); ++i){
			n = ascii_array[bulbasaur_chars.charAt(i)];
			if(n < possible_num){
				possible_num = n;
			}
		}

		return possible_num;
	}
}