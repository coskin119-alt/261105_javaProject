package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학과 관련된 기능을 제공하는 클래스

		// 실수의 기본형은 double, 정수의 기본형은 int

		// Math.round(값) : 정수로 반올림  => 소수자리수 0
		// Math.floor(값) : 소수자리를 버림 => 소수자리수 0
		// Math.ceil(값)  : 소수자리를 올림 => 소수자리수 0
		double number = 3.14159;
		System.out.println("origin = " + number);
		
		int roundNum = (int)Math.round(number); 	// return Value = double
		System.out.println("round = " + roundNum);
		int floorNum = (int)Math.floor(number); 	// return Value = double
		System.out.println("floor = " + floorNum);
		int ceilNum  = (int)Math.ceil(number); 		// return Value = double
		System.out.println("ceil = " + ceilNum);

		// Math.random() : 0~1 사이의 아무수 => double
		double randomNum = Math.random(); 			// return Value = double
		System.out.println("random = " + randomNum);
		System.out.println("random X 10 = " + randomNum*10);
		System.out.println("round : random X 10 = " + (int)Math.round(randomNum*10));
		System.out.println("floor : random X 10 = " + (int)Math.floor(randomNum*10));
		System.out.println("ceil  : random X 10 = " + (int)Math.ceil(randomNum*10));
		
		//int random = (int)(Math.random()*10);
		
		// double = Math.random()
		// (int)(Math.random()*갯수) + 시작
		// (예) 주사위 값 (1 ~ 6) : (int)(Math.random()*6)+1

		// Random() 클래스
		// int 자료형으로 랜덤 값을 리턴 (0~9)
		// random.nextInt(count)+start
		Random random1 = new Random();
		System.out.println(random1.nextInt(45)+1);
		
		// Math.max(값1, 값2) / Math.min(값1, 값2)
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
	
		
	}

}
