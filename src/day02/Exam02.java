package day02;

import java.util.Random;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 두개와 연사자 1개를 입력받아 두저2 정수의 연산 결과를 출력
		// 2 3 + => 2 + 3 = 5
		// 사용 가능 연산자는 +, -, *, /, % : 이외의 연산자에 대해서는 

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		int a, b, c, d;
		char operator;
		String result;

		// Random 정수 2개 입력
		a = random.nextInt(100)+0;
		b = random.nextInt(100)+0;
		System.out.println("Random 정수 2개 : " + a + ' ' + b);
		System.out.println("");

		// 정수 2개 입력 : 띄워쓰기로 분리
		System.out.print("정수 2개 입력 > ");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("");
		
		// 연산자 입력
		System.out.print("연산자를 입력하세요 > ");
		operator = scan.next().charAt(0);
		System.out.println("");
		
		// 계산
		//System.out.print("결과 : " + a + ' ' + operator + ' ' + b + " = ");

		switch (operator) {
		case '+':
			//System.out.println(a + b);
			result = String.valueOf(a + b);
			break;

		case '-':
			//System.out.println(a - b);
			result = String.valueOf(a - b);
			break;
		
		case '*':
			//System.out.println(a * b);
			result = String.valueOf(a * b);
			break;
		
		case '/':
			if (b != 0) {
				//System.out.println(a / b);
				result = String.valueOf(a / b);
			}else {
				//System.out.println("Zero 로 나눌수 없습니다.");
				result = "Zero 로 나눌수 없습니다.";
			}
			break;
		
		case '%':
			if (b != 0) {
				//System.out.println(a % b);
				result = String.valueOf(a % b);
			}else {
				//System.out.println("Zero 로 나눌수 없습니다.");
				result = "Zero 로 나눌수 없습니다.";
			}
			break;
		
		default:
			//System.out.println("등록되지 않은 연산자를 입력하였습니다.");
			result = "등록되지 않은 연산자를 입력하였습니다.";
			break;
		}
		
		System.out.println("결과 : " + a + ' ' + operator + ' ' + b + " = " + result);
		
		scan.close();
		
	}

}
