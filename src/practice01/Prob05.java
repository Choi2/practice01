package practice01;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 100; i ++) {
			String number = String.valueOf(i);
			boolean start = false;
			
			for(int j = 0; j < number.length(); j++) {
				if(number.charAt(j) == '3' || number.charAt(j) == '6' 
						||number.charAt(j) == '9') {
					if(!start) {
						System.out.print(number + " ");
						start = true;
					}
					System.out.print("짝");
				}
				
			}
			if(start) {
				System.out.println();
			}
		}
		
	}

}
