package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int number = input.nextInt();
			int start = (number % 2 == 0) ? 0 : 1;

			for (int i = start; i <= number; i += 2) {
				sum += i;
			}
			System.out.println("결과 값 : " + sum);
			sum = 0;
		}
	}

}
