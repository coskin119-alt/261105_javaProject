package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 메서드 (method) = 함수 (Function)
		// Main 메서드는 실행을 담당 (콘솔 실행)
		/* 주석 => ctrl + / : 블럭 처리 가능
		 * 
		 * java
		 * package => class => method
		 * 
		 * main : 실행을 담당
		 * println() : 괄호안의 값을 콘솔 출력 (출바꿈 포함)
		 * print() : 괄호안의 값을 콘솔 출력 (출바꿈 없음)
		 * 
		 * ctrl + F11 : 실행
		 * 
		 */
		
		// println()
		/*
		 * 숫자 : +, -, (부호), 사칙연산
		 * 문자열 : "문자는 모두 큰따음표로 묶기" String 이라는 class 로 표시
		 * 문자 : '작은따음표로 묶기'
		 * 
		 */
		System.out.println("Hello World !");
		System.out.println('a'+'b');
		System.out.println("a"+"b");
		
		
		int number=10;
		System.out.println(number);
		
		String str = "abc";
		System.out.println(str);
		

	}

}
