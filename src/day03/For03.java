package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int x = 0; x < 1; ) {
			// 구구단의 단수를 선택
			System.out.print("구구단의 단수를 선택하시오 > ");
			int base = scan.nextInt();
			System.out.println("");
			
			// 구구단 출력
			for (int i = 1; i <= 9; i++) {
				
				System.out.println(base + " X " + i + " = " + (base * i));
			}
			System.out.println("");

		}
		
			
		scan.close();
	}

}
