package day04;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 조합
		// (예) 6 의 약수 : 1, 2, 3, 6
		
		int number = 10;
		
		for (int i = 1; i <= number; i++) {
			if ((number % i) == 0) System.out.println(i);
		}

		// 공약수 : 두 수의 공통된 약수
		// 최대공약수 : 가장큰 공약수
		
		int num1 = 6, num2 = 12, max = 0;
		for (int i = 1; i <= Math.max(num1, num2); i++) {
			if ((num1 % i) == 0 && (num2 % i) == 0) {
				System.out.println(i);
				max = i;
			}
		}
		System.out.println(max);
		
		// 배수 : 1부터 곱해서 나오는 약수
		// 공배수 : 2 수의 공통된 배수 조합
		// 최소공배수 : 2 수의 공배수 중에서 가장 작은 공배수
		int num3 = 13, num4 = 17, min = 0;
		for (int i = num3 * num4; i >= Math.max(num3, num4); i--) {
			if ((i % num3) == 0 && (i % num4) == 0) {
				System.out.println(i);
				min = i;
			}
		}
		System.out.println(min);
		
		for (int i = 1; ; i++) {
			min = num3 * i;
			if ((min % num4) == 0) break;
		}
		System.out.println(min);
	
	}


}
