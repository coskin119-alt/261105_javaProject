package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// do { 실행문 } while (조건식);
		
		// 한글자를 입력받아 출력, 입력방식은 char
		// y를 입력하면 종료
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {

			// 연산자 입력
			System.out.print("y를 입력하면 종료합니다. > ");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			
		} while (ch != 'y');
		
		
		scan.close();
	}

}
