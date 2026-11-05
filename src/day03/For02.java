package day03;

public class For02 {

	public static void main(String[] args) {
		// for 문을 사용하여 1~100 합계를 출력
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~100 합계 = " + sum);
		
		// for 문을 사용하여 1~100 짝수 합계를 출력
		int eSum = 0, oSum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 2) == 0) eSum += i; else oSum += i;
		}
		
		System.out.println("1~100 홀수 합계 = " + oSum);
		System.out.println("1~100 짝수 합계 = " + eSum);

		// for 문을 사용하여 1~10까지의 랜덤수 5번 출력
		for (int i = 1; i <= 5; i++) {
			int randome = (int)(Math.random()*10) + 1;
			System.out.println("Random [" + i +"] = " + randome);
		}
		
		
	}

}
