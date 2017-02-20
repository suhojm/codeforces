import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class CF762B{
	public static void  main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); // num of coms with usb
		int b = in.nextInt(); // num of coms with ps/2
		int c = in.nextInt(); // num of coms with both

		int m = in.nextInt(); // num of mouses

		// store the prices and type for m number of mouse using ArrayList(java data structure)
		ArrayList<Integer> usbPrices = new ArrayList<Integer>();
		ArrayList<Integer> ps2Prices = new ArrayList<Integer>(); 

		for(int i = 0; i < m; ++i){
			int price = in.nextInt();
			String type = in.next();

			if(type.equals("USB")){
				usbPrices.add(price);
			} else if(type.equals("PS/2")){
				ps2Prices.add(price);
			}
		}

		// sort the ArrayLists
		Collections.sort(usbPrices);
		Collections.sort(ps2Prices);

		// counter for number of computers got connected mouse
		int count = 0;

		// total price needs
		long total = 0;

		// indexing for the ArrayLists
		int usbIndex = 0;
		int ps2Index = 0;


		// add value to total and count for usb computers
		while(usbIndex < usbPrices.size() && usbIndex < a){
			total += usbPrices.get(usbIndex);
			++count;
			++usbIndex;
		}

		// add value to total and count for ps2 computers
		while(ps2Index < ps2Prices.size() && ps2Index < b){
			total += ps2Prices.get(ps2Index);
			++count;
			++ps2Index;
		}

		// add value to total and count for both 
		while(c > 0 && (usbIndex < usbPrices.size() || ps2Index < ps2Prices.size())){
			if(usbIndex == usbPrices.size()){
				total += ps2Prices.get(ps2Index);
				++ps2Index;
			} else if(ps2Index == ps2Prices.size()){
				total += usbPrices.get(usbIndex);
				++usbIndex;
			} else{
				if(usbPrices.get(usbIndex) < ps2Prices.get(ps2Index)){
					total += usbPrices.get(usbIndex);
					++usbIndex;
				} else{
					total += ps2Prices.get(ps2Index);
					++ps2Index;
				}
			}
			++count;
			--c;
		}

		// print output
		System.out.println(count + " " + total);
	}
}