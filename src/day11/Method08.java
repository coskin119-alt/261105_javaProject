package day11;

public class Method08 {

	public int fact(int num) {
		int result = 1;

		if (num < 0) {
			return 0;
		}
		
		if (num == 0 || num ==1)
		{
			return 1;
		}
		
		for (int i=1; i<=num; i++) {
			result *= i;
		}
		
		return result;
	}
	
	// 재귀메서드로 변환
	public int factorial(int num) {
		if (num < 0) {
			return 0;
		}
		
		if (num == 0 || num ==1)
		{
			return 1;
		}

		return num * factorial(num - 1);
		
	}
	
	public static void main(String[] args) {
		// 재귀메서드 : 메서드 안에 자신의 메서드를 호출하는 메서드
		// ! : 팩토리얼 (1부터 자신의 수까지 곱한값을 리턴
		/*
		 * 0! = 1
		 * 1! = 1
		 * 2! = 1*2 = 2
		 * 3! = 1*2*3 = 6
		 */

		Method08 m = new Method08();
		
		System.out.println(m.fact(0));
		System.out.println(m.fact(1));
		System.out.println(m.fact(2));
		System.out.println(m.fact(3));
		System.out.println(m.factorial(3));
		
		
	}

}
